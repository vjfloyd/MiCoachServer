package micoach.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.annotations.Where;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import micoach.dao.CourseRepository;
import micoach.dao.UserRepository;
import micoach.entities.Course;
import micoach.entities.User;

@Service
@Transactional
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CourseService {

	private final CourseRepository courseRepository;
	
	
	public CourseService(CourseRepository courseRepository){
		this.courseRepository = courseRepository;
	}
	
	public List<Course> listCourseByUser(int idUsuario){
		List<Course> lista = null;
		lista = courseRepository.findCourseByidcourse(idUsuario);
		int a =1;
		return lista;
 	}
	


	
	
}
