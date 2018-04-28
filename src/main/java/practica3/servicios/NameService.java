package practica3.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practica3.entidades.User;
import practica3.repositorios.UserRepository;


@Service
public class NameService {

	@Autowired
	private UserRepository repositorio;
	
	public List<User> getName(){
		return (List<User>) repositorio.findAll();
	}
	
	public User getName(Integer id) {
		return repositorio.findOne(id);
	}
	
	public void guardarAcceso(User user){
		repositorio.save(user);
	}
	

	
}
