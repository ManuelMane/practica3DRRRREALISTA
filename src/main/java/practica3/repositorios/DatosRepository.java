package practica3.repositorios;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import practica3.entidades.Datos;
@RepositoryRestResource
public interface DatosRepository extends CrudRepository<Datos,Integer>{

	List<Datos> findByIp(String ip);
	List<Datos> findByDesde(String ip);
	List<Datos> findByNumeros(String ip);
	List<Datos> findByBuscador(String ip);
}