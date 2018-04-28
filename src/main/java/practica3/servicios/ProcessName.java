package practica3.servicios;


import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import practica3.App;
import practica3.entidades.Name;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class ProcessName {

    @PostConstruct
    public void process(){
        int contAccT = 0;
        String firstLine = "nameId,firstName,familyName";

        try (BufferedReader br = new BufferedReader(new FileReader("Table_Names.csv"))) { //mas-accesos-servidor-nitflex.log
            String line;
            while ((line = br.readLine()) != null) {  //Vamos linea a linea separando la informacion

                if(!line.equals(firstLine)){
                    String atributtes[] = line.split(",");
                    Name a = new Name(Integer.parseInt(atributtes[0]),atributtes[1],atributtes[2]);
                    System.out.println(a);
                }
            }//while
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//process

    public static void main(String[] args) {
        ProcessName a = new ProcessName();
        a.process();
    }

}
