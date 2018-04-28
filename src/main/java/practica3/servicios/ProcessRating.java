package practica3.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import practica3.entidades.Rating;
import practica3.repositorios.RatingRepository;
import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class ProcessRating {
    @Autowired
    private RatingRepository repositorio;
    //@PostConstruct
    public void process(){


        int contAccT = 0;
        String firstLine = "userId,movieId,rating,timestamp";

        try (BufferedReader br = new BufferedReader(new FileReader("data/Table_Ratings.csv"))) { //mas-accesos-servidor-nitflex.log
            String line;
            while ((line = br.readLine()) != null) {  //Vamos linea a linea separando la informacion

                if(!line.equals(firstLine)){
                    String atributtes[] = line.split(",");
                    Rating currentRating = new Rating(Integer.parseInt(atributtes[0]),Integer.parseInt(atributtes[1]),Double.parseDouble(atributtes[2]),Integer.parseInt(atributtes[3]));
                    repositorio.save(currentRating);
                    //System.out.println(currentRating);

                }
            }//while
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//process

    public static void main(String[] args) {
        ProcessRating a = new ProcessRating();
        a.process();
    }

}
