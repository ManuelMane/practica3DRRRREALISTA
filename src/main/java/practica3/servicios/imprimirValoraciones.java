package practica3.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import practica3.entidades.Rating;
import practica3.entidades.User;
import practica3.repositorios.MovieRepository;
import practica3.repositorios.RatingRepository;
import practica3.repositorios.TimeRepository;
import practica3.repositorios.UserRepository;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class imprimirValoraciones {

    @Autowired
    private RatingRepository ratingRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TimeRepository timeRepository;

    //@PostConstruct
    public void imprimir(String ruta){
        FileWriter fichero = null;

        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter (ruta);
            pw = new PrintWriter(fichero);

            for (int i = 1; i < 100; i++) {

                pw.println("HOLI");


                User currentUser = userRepository.findByIdd(i);
                List<Rating> currentRatings = ratingRepository.findByUserId(i);
                List<Object> listOfMovies = null;


                for (int j = 0; j<currentRatings.size();j++){

                    listOfMovies.add(movieRepository.findOne(currentRatings.get(j).getMovieId()));
                }

                pw.println(currentUser+"-"+currentRatings.toString());


            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public static void main(String[] args){

    }
}
