package kodlamaio.Northwind_project.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.Northwind_project.business.abstracts.UserService;
import kodlamaio.Northwind_project.core.entities.User;
import kodlamaio.Northwind_project.core.utilities.results.DataResult;
import kodlamaio.Northwind_project.core.utilities.results.ErrorDataResult;
import kodlamaio.Northwind_project.core.utilities.results.Result;

import org.springframework.*;

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
	public ResponseEntity<?> add(@Valid @RequestBody User user) {  //@RequestBody = kullanıcıdan alacağımız için
		return ResponseEntity.ok(this.userService.add(user));
	}
	
	
	//global hata  yakalama işlemi
	
	@ExceptionHandler(MethodArgumentNotValidException.class) //Bu sistemde şu türde bir hata olursa bu metodu devreye sok diyoruz.
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String,String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
		return errors;
	}
	
	
	
	/*
	@GetMapping("/findByEmail")	
	public DataResult<User> findByEmail(@RequestParam String email){
		return this.userService.findByEmail(email);
	}*/
}
