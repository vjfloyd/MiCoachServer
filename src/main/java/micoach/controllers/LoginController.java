package micoach.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import micoach.entities.User;
import micoach.services.UserService;

@Controller
public class LoginController {

	private UserService userService;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/login")
	public String authenticate(@PathVariable("user") String username, @PathVariable("password") String password){
		 User user = userService.findUser(username);
		if(user!=null){
			if(password!=null){
				if(user.getPassword().equals(password)){
					//acceso ingresar
				}else{
					//contraseña incorrecta
				}
			}else{
				//ingrese contraseña
			}
		}else{
			//usuario incorrecto
		}
		
		return "index";
	}
	
}
