package micoach.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import micoach.dao.UserRepository;
import micoach.entities.User;

@Service
@Transactional
public class UserService {

	private final UserRepository userRepository;
	
	
	public UserService(UserRepository personRepository){
		this.userRepository = personRepository;
	}
	
	public List<User> listUsers(){
		return  (List<User>) userRepository.findAll();
 	}
	
	public User findUser(String username){
		User user = userRepository.findUserByUsername(username);
		return user;
		
	}
	
}
