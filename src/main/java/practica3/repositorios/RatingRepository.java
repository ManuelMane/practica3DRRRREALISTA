package practica3.repositorios;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import practica3.entidades.Rating;

@RepositoryRestResource
public interface RatingRepository extends CrudRepository<Rating,Integer>{

}
