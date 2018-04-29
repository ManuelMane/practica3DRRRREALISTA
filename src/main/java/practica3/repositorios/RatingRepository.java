package practica3.repositorios;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import practica3.entidades.Rating;



@RepositoryRestResource
public interface RatingRepository extends CrudRepository<Rating,Integer>{
    List<Rating> findAll();
    Rating findByIdd(int id);
    List<Rating> findByUserId(int id);
}
