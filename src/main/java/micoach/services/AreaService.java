package micoach.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import micoach.dao.UserRepository;
import micoach.entities.User;

@Service
@Transactional
public class AreaService {

	private final UserRepository userRepository;
	
	
	public AreaService(UserRepository personRepository){
		this.userRepository = personRepository;
	}
	
	public List<User> listUsers(){
		return  (List<User>) userRepository.findAll();
 	}
	
}
