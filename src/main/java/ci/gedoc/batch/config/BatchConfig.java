package ci.gedoc.batch.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.xstream.XStreamMarshaller;

import ci.gedoc.batch.processor.BatchItemProcessor;
import ci.gedoc.model.Batch;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private DataSource dataSource;

	@Bean
	public BatchItemProcessor processor() {
		return new BatchItemProcessor();
	}

	@Bean
	public StaxEventItemReader<Batch> reader() {
		StaxEventItemReader<Batch> reader = new StaxEventItemReader<Batch>();
		reader.setResource(new ClassPathResource("SortieLots.xml"));
		reader.setFragmentRootElementName("batch");

		Map<String, String> aliasesMap = new HashMap<String, String>();
		aliasesMap.put("batch", "ci.gedoc.model.Batch");
		XStreamMarshaller marshaller = new XStreamMarshaller();
		marshaller.setAliases(aliasesMap);

		reader.setUnmarshaller(marshaller);
		return reader;
	}

	@Bean
	public JdbcBatchItemWriter<Batch> writer() {
		JdbcBatchItemWriter<Batch> writer = new JdbcBatchItemWriter<Batch>();
		writer.setDataSource(dataSource);
		writer.setSql(
				"INSERT INTO batch (id,nom_lot, auteur_numerisation, base_doc_lot, date_numerisation, file_name, nb_page_lot, nb_doc_lot, statut_lot)"
						+ " VALUES (?,?,?,?,?,?,?,?,?)");
		writer.setItemPreparedStatementSetter(new BatchPreparedStatementSetter());
		return writer;
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<Batch, Batch>chunk(100).reader(reader()).processor(processor())
				.writer(writer()).build();
	}

	@Bean
	public Job exportBatch() {
		return jobBuilderFactory.get("importBatchJob").incrementer(new RunIdIncrementer()).flow(step1()).end().build();
	}
}
