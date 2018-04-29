package practica3.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import practica3.entidades.Movie;

@RepositoryRestResource
public interface MovieRepository extends CrudRepository<Movie,Integer>{
    Movie findOne(int id);

}
