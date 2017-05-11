package micoach.dao;

import org.springframework.data.repository.CrudRepository;

import micoach.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	public  User findUserByUsername(String user);
	
}
