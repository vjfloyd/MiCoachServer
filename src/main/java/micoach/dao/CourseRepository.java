package micoach.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import micoach.entities.Course;
import micoach.entities.User;


public interface CourseRepository extends CrudRepository<Course,Integer>{

	public List<Course> findCourseByUser(int idUsuario);
	
}
