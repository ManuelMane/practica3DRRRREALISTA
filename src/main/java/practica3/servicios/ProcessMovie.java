package practica3.servicios;


import org.springframework.stereotype.Component;
import practica3.entidades.Movie;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class ProcessMovie {

    @PostConstruct
    public void process(){
        int contAccT = 0;
        String firstLine = "movieId,title,genres";
        int cont = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("Table_Movies.csv"))) { //mas-accesos-servidor-nitflex.log
            String line;
            while ((line = br.readLine()) != null) {  //Vamos linea a linea separando la informacion

                if(!line.equals(firstLine)){
                    String atributtes[] = line.split(",");
                    if(atributtes.length==4){
                        ++cont;
                        Movie currentMovie = new Movie(Integer.parseInt(atributtes[0]),atributtes[1],atributtes[2],atributtes[3]);
                        System.out.println(currentMovie);
                    }

                }
            }//while
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(cont);
    }//process

    public static void main(String[] args) {
        ProcessMovie a = new ProcessMovie();
        a.process();
    }

}
