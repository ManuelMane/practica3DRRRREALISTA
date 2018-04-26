package practica3.repositorios;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import practica3.entidades.Name;


@RepositoryRestResource
public interface NameRepository extends CrudRepository<Name,Integer>{


}
