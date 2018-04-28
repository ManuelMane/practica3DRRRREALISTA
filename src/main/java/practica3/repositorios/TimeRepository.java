package practica3.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import practica3.entidades.Time;

@RepositoryRestResource
public interface TimeRepository extends CrudRepository<Time,Integer>{
    List<Time> findAll();
    Time findByIdd(int id);

	
}
