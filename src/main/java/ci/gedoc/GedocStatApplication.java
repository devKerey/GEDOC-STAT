package ci.gedoc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ci.gedoc.repositories.BatchRepository;

@SpringBootApplication
public class GedocStatApplication {

	public static void main(String[] args) throws IOException, TransformerException {
		ApplicationContext ctx = SpringApplication.run(GedocStatApplication.class, args);
		BatchRepository batchRepository = ctx.getBean(BatchRepository.class);

		/*
		 * batchRepository.save(new
		 * Batch("DRH_Capture_1_DRH_sysadmin_07042020_185516_00001", "KOKO",
		 * "2020-04-07", "File07032020", 5, "DRH", 1, "Non traité"));
		 * batchRepository.save(new
		 * Batch("DRH_Capture_1_DRH_sysadmin_07042020_185516_00002", "KOKO",
		 * "2020-04-07", "File07032020", 5, "DRH", 1, "Non traité"));
		 * 
		 * batchRepository.save(new
		 * Batch("DRH_Capture_1_DRH_sysadmin_07042020_185516_00001", "LAURENT",
		 * "2020-04-07", "File07032020", 5, "DRH", 1, "Non traité"));
		 * 
		 * batchRepository.save(new
		 * Batch("DRH_Capture_1_DRH_sysadmin_07042020_185516_00002", "LAURENT",
		 * "2020-04-07", "File07032020", 5, "DRH", 1, "Non traité"));
		 */

		batchRepository.findAll().forEach(b -> System.out.println(b.getAuteur_numerisation()));

		Path pathSortieLot = Paths.get("Chemin_Sortie_Lots.txt");

		List<String> lignesLot = Files.readAllLines(pathSortieLot);

		System.out.println("\n*** Lot(s) récupéré(s) ***\n");

		for (String ligne : lignesLot) {
			File pathContenuSotieLot = new File(ligne);

			File[] recupFiles = pathContenuSotieLot.listFiles();

			try {

				for (int i = 0; i < recupFiles.length; i++) {
					System.out.println(recupFiles[i].getName());

					System.out.println(recupFiles[i].length());

					TransformerFactory tFactory = TransformerFactory.newInstance();

					Transformer transformer = tFactory.newTransformer(
							new StreamSource("C:/Users/LAURENT/eclipse-workspace/GEDOC-STAT/SortieLots.xsl"));

					transformer.transform(new StreamSource(recupFiles[i]), new StreamResult(new FileOutputStream(
							"C:/Users/LAURENT/eclipse-workspace/GEDOC-STAT/src/main/resources/SortieLots.xml")));
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Il y a plus de lot à recuperer\n");
			}

		}

	}

}
