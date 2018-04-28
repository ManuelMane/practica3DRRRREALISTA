package practica3.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import practica3.entidades.Time;
import practica3.repositorios.TimeRepository;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


@Component
public class ProcessTime {
    @Autowired
    private TimeRepository repositorio;
    //@PostConstruct
    public void process(){


        int contAccT = 0;
        String firstLine = "DateNum,Date,YearMonthNum,Calendar_Quarter,MonthNum,MonthName,MonthShortName,WeekNum,DayNumOfYear,DayNumOfMonth,DayNumOfWeek,DayName,DayShortName,Quarter,YearQuarterNum,DayNumOfQuarter";

        try (BufferedReader br = new BufferedReader(new FileReader("Table_Time.csv"))) { //mas-accesos-servidor-nitflex.log
            String line;
            while ((line = br.readLine()) != null) {  //Vamos linea a linea separando la informacion

                if(!line.equals(firstLine)){
                    String atributtes[] = line.split(",");
                    Time currentTime = new Time(
                            atributtes[0],atributtes[1],
                            atributtes[2],atributtes[3],
                            atributtes[4],atributtes[5],
                            atributtes[6],atributtes[7],
                            atributtes[8],atributtes[9],
                            atributtes[10],atributtes[11],
                            atributtes[12],atributtes[13],
                            atributtes[14],atributtes[15]
                    );

                    repositorio.save(currentTime);
                    //System.out.println(currentTime);


                }
            }//while
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//process

    public static void main(String[] args) {
        ProcessTime a = new ProcessTime();
        a.process();
    }

}
