package kodlamaio.Northwind_project.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Northwind_project.business.abstracts.UserService;
import kodlamaio.Northwind_project.core.entities.User;
import kodlamaio.Northwind_project.core.utilities.results.DataResult;
import kodlamaio.Northwind_project.core.utilities.results.Result;

@RestController 		         	
@RequestMapping("/api/users") 
public class UsersController {
	
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody User user) {  //@RequestBody = kullanıcıdan alacağımız için
		return ResponseEntity.ok(this.userService.add(user));
	}
	/*
	@GetMapping("/findByEmail")	
	public DataResult<User> findByEmail(@RequestParam String email){
		return this.userService.findByEmail(email);
	}*/
}
