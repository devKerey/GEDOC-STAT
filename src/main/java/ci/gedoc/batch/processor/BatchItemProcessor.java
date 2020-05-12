package ci.gedoc.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import ci.gedoc.model.Batch;

public class BatchItemProcessor implements ItemProcessor<Batch, Batch> {

	@Override
	public Batch process(Batch batch) throws Exception {
		return batch;
	}

}
