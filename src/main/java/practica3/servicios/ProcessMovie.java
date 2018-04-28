package practica3.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import practica3.entidades.Movie;
import practica3.repositorios.MovieRepository;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class ProcessMovie {
    @Autowired
    private MovieRepository repositorio;

    @PostConstruct
    public void process(){
        int contTotal = 0;
        int cont = 0;


        String firstLine = "movieId,title,genres";

        try (BufferedReader br = new BufferedReader(new FileReader("Table_Movies.csv"))) { //mas-accesos-servidor-nitflex.log
            String line;
            while ((line = br.readLine()) != null) {  //Vamos linea a linea separando la informacion

                if(!line.equals(firstLine)){
                    String atributtes[] = line.split(",");

                    ++contTotal;

                    if(atributtes.length==3){
                        ++cont;

                        int id = Integer.parseInt(atributtes[0]);
                        String title = this.getTitle3Elements(atributtes);
                        String date = this.getDate3Elements(atributtes);
                        String genres = atributtes[2];

                        Movie currentMovie = new Movie(id,title,date,genres);
                        repositorio.save(currentMovie);
                        /*
                        if(!date.contains("1")&&!date.contains("2")){
                            System.out.println(line);
                            System.out.println(currentMovie);
                        }
                        */
                    }
                    if(atributtes.length==4){

                        ++cont;

                        //System.out.println(line);
                        int id = Integer.parseInt(atributtes[0]);
                        String title = this.getTitle4Elements(atributtes);
                        String date = this.getDate4Elements(atributtes);
                        String genres = atributtes[3];

                        Movie currentMovie = new Movie(id,title,date,genres);
                        repositorio.save(currentMovie);

                        //System.out.println(currentMovie);
                    }

                    if(atributtes.length==5){
                        ++cont;
                        //System.out.println(line);
                        int id = Integer.parseInt(atributtes[0]);
                        String title = this.getTitle5Elements(atributtes);
                        String date = this.getDate5Elements(atributtes);
                        String genres = atributtes[4];

                        Movie currentMovie = new Movie(id,title,date,genres);
                        repositorio.save(currentMovie);
                        //System.out.println(currentMovie);

                    }

                    if(atributtes.length==6){
                        ++cont;
                        //System.out.println(line);

                        int id = Integer.parseInt(atributtes[0]);
                        String title = this.getTitle6Elements(atributtes);
                        String date = this.getDate6Elements(atributtes);
                        String genres = atributtes[5];

                        Movie currentMovie = new Movie(id,title,date,genres);
                        repositorio.save(currentMovie);
                       //System.out.println(currentMovie);

                    }

                    if(atributtes.length==8){
                        ++cont;
                        //System.out.println(line);

                        int id = Integer.parseInt(atributtes[0]);
                        String title = this.getTitle8Elements(atributtes);
                        String date = this.getDate8Elements(atributtes);
                        String genres = atributtes[7];

                        Movie currentMovie = new Movie(id,title,date,genres);
                        repositorio.save(currentMovie);

                        //System.out.println(currentMovie);

                    }

                }
            }//while
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Contador actual:"+cont);
        System.out.println("Contador total:"+contTotal);

    }//process

    //3 Elements
    public String getTitle3Elements (String[] atributtes){
        return atributtes[1].split("\\(")[0].replace("\"","").replace("\'","");
    }
    public String getDate3Elements (String[] atributtes){

        String date = atributtes[1].replace(" ","");
        date = date.replace("\"","");

        if (!atributtes[1].contains("1")&&!atributtes[1].contains("2")){
            return "NoDate";
        }
        else{
            return date.substring(date.length()-5,date.length()-1);
        }
    }

    //4 Elements
    public String getTitle4Elements (String[] atributtes){
        return atributtes[1].concat(atributtes[2]).replace("\"","").split("\\(")[0].replace("\'","");
    }
    public String getDate4Elements (String[] atributtes){

        if (!atributtes[2].contains("1")&&!atributtes[2].contains("2")){
            return "NoDate";
        }

        if(atributtes[2].substring(atributtes[2].length()-3,atributtes[2].length()-1).equals("-)")){

            return atributtes[2].substring(atributtes[2].length()-7,atributtes[2].length()-3);
        }
        else{
            return atributtes[2].substring(atributtes[2].length()-6,atributtes[2].length()-2);
        }
    }

    //5 Elements
    public String getTitle5Elements (String[] atributtes){
        return atributtes[1].concat(atributtes[2].concat(atributtes[3])).replace("\"","").split("\\(")[0].replace("\'","");
    }
    public String getDate5Elements (String[] atributtes){

        if (!atributtes[3].contains("1")&&!atributtes[3].contains("2")){
            return "NoDate";
        }

        else{
            return atributtes[3].substring(atributtes[3].length()-6,atributtes[3].length()-2);
        }
    }

    //6 Elements

    public String getTitle6Elements (String[] atributtes){
        return atributtes[1].concat(atributtes[2].concat(atributtes[3].concat(atributtes[4]))).replace("\"","").split("\\(")[0].replace("\'","");
    }
    public String getDate6Elements (String[] atributtes){

        if (!atributtes[4].contains("1")&&!atributtes[4].contains("2")){
            return "NoDate";
        }

        else{
            return atributtes[4].substring(atributtes[4].length()-6,atributtes[4].length()-2);
        }
    }


    //8 Elements

    public String getTitle8Elements (String[] atributtes){
        return atributtes[1].concat(atributtes[2].concat(atributtes[3])).replace("\"","").split("\\(")[0].replace("\'","");
    }
    public String getDate8Elements (String[] atributtes){

        if (!atributtes[6].contains("1")&&!atributtes[6].contains("2")){
            return "NoDate";
        }

        else{
            return atributtes[6].substring(atributtes[6].length()-6,atributtes[6].length()-2);
        }
    }


    public static void main(String[] args) {
        ProcessMovie a = new ProcessMovie();
        a.process();
    }

}
