package practica3;

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

import java.io.File;
import java.util.List;

public class Recomendador {

    public static void main( String[] args ) throws Exception
    {

        DataModel model =
                new FileDataModel(new File("data/Table_Ratings.csv"));
        UserSimilarity similarity =
                new PearsonCorrelationSimilarity(model);
        UserNeighborhood neighborhood =
                new ThresholdUserNeighborhood(0.1, similarity, model);
        UserBasedRecommender recommender =
                new GenericUserBasedRecommender(model, neighborhood, similarity);
        List<RecommendedItem> recommendations = recommender.recommend(2, 3);
        for (RecommendedItem recommendation : recommendations) {
            System.out.println(recommendation);
        }

        DataModel model2 = new FileDataModel(new File("data/Table_Ratings.csv"));

        ItemSimilarity similarityItemBased = new EuclideanDistanceSimilarity(model2);

        ItemBasedRecommender recommenderItemBased = new GenericItemBasedRecommender(model2,similarityItemBased);

        List<RecommendedItem> recommendations2 = recommenderItemBased.recommend(2, 3);
        for (RecommendedItem recommendation : recommendations2) {
            System.out.println(recommendation);
        }
    }
}
