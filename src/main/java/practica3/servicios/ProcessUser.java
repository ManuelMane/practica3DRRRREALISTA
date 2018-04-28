package practica3.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import practica3.entidades.User;
import practica3.repositorios.UserRepository;
import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


@Component
public class ProcessUser {
    @Autowired
    private UserRepository repositorio;
    //@PostConstruct
    public void process(){


        int contAccT = 0;
        String firstLine = "nameId,firstName,familyName";

        try (BufferedReader br = new BufferedReader(new FileReader("data/Table_Names.csv"))) { //mas-accesos-servidor-nitflex.log
            String line;
            while ((line = br.readLine()) != null) {  //Vamos linea a linea separando la informacion

                if(!line.equals(firstLine)){
                    String atributtes[] = line.split(",");
                    User currentUser = new User(Integer.parseInt(atributtes[0]),atributtes[1],atributtes[2]);

                    //repositorio.save(currentUser);
                    //System.out.println(currentUser);


                }
            }//while
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//process

    public static void main(String[] args) {
        ProcessUser a = new ProcessUser();
        a.process();
    }

}
