package practica3.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practica3.repositorios.RatingRepository;

@Service
public class ResourceService {

	/*@Autowired
	private RatingRepository repositorio;
	
	public List<Recursos> getRecursos(){
		return (List<Recursos>) repositorio.findAll();
	}
	
	public void guardarRecursos(Recursos t){
		repositorio.save(t);
	}
	
	public long comprobarRecurso(Recursos r){
		Recursos re = repositorio.findByUrl(r.getUrl());
		if (re!= null){
			long id = re.getIdr();
			return id;
		}
		else{
			
			return (repositorio.save(r).getIdr());
		}
	}*/
}
