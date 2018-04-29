package practica3;


import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.ItemBasedRecommender;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import practica3.servicios.imprimirValoraciones;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Configuration
@ComponentScan
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@SpringBootApplication

public class App {
	
	public static void main(String[] args) throws IOException, TasteException {

		SpringApplication.run(App.class, args);

		DataModel model =
				new FileDataModel(new File("data/Table_Ratings.csv"));
		UserSimilarity similarity =
				new PearsonCorrelationSimilarity(model);
		UserNeighborhood neighborhood =
				new ThresholdUserNeighborhood(0.1, similarity, model);
		UserBasedRecommender recommender =
				new GenericUserBasedRecommender(model, neighborhood, similarity);
		List<RecommendedItem> recommendations = recommender.recommend(2, 10);
		for (RecommendedItem recommendation : recommendations) {
			System.out.println(recommendation);
		}

		DataModel model2 = new FileDataModel(new File("data/Table_Ratings.csv"));

		ItemSimilarity similarityItemBased = new EuclideanDistanceSimilarity(model2);

		ItemBasedRecommender recommenderItemBased = new GenericItemBasedRecommender(model2,similarityItemBased);

		List<RecommendedItem> recommendations2 = recommenderItemBased.recommend(2, 10);
		for (RecommendedItem recommendation : recommendations2) {
			System.out.println(recommendation);
		}

		imprimirValoraciones i = new imprimirValoraciones();
		i.imprimir("valoraciones.txt");

	}



}
