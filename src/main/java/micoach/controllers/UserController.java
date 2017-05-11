package micoach.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import micoach.entities.*;
import micoach.services.CourseService;
import micoach.services.UserService;

@RestController
@RequestMapping("/app")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/index")
	public String hello(){
		return "Im CEO bitch";
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<User> listEmployes(){
		return userService.listUsers();
	}
	
	@RequestMapping(value="/login")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/courses", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Course> courseByUser(){
		return courseService.listCourseByUser(1);
		
	}
	
	
}
