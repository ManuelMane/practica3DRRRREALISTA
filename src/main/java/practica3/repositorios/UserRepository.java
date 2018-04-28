package practica3.repositorios;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import practica3.entidades.User;


@RepositoryRestResource
public interface UserRepository extends CrudRepository<User,Integer>{
    List<User> findAll();
    User findByIdd(int id);

}
