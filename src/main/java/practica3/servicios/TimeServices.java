package practica3.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practica3.entidades.Time;
import practica3.repositorios.TimeRepository;

@Service
public class TimeServices extends Time{

	/*@Autowired
	private TimeRepository repositorio;
	
	public List<Time> getTime(){
		return (List<Time>) repositorio.findAll();
	}
	
	public void guardarTime(Time t){
		repositorio.save(t);
	}
	
	public long comprobarTime(Time t){
		Time time = repositorio.findByAnioAndDiaAndMesAndHora(t.getAnio(),t.getDia(),t.getMes(),t.getHora());
		if (time!= null){
			long id = time.getIdt();
			return id;
		}
		else{
			return (repositorio.save(t).getIdt());
		}
	}*/
}
