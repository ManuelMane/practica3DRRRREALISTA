package practica3.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practica3.entidades.Datos;
import practica3.repositorios.DatosRepository;

@Service
public class DataService {

	@Autowired
	private DatosRepository repositorio;
	
	public List<Datos> getDatos(){
		return (List<Datos>) repositorio.findAll();
	}
	
	public void guardarDatos(Datos t){
		repositorio.save(t);
	}
}
