package com.cg.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pms.entity.Userdetails;
import com.cg.service.UserdetailsService;

@RestController
public class UserdetailsController {
	@Autowired
    UserdetailsService loginService;
	
	@PostMapping("userdetails")
	public ResponseEntity<Userdetails>  createUserdetails(@RequestBody Userdetails userdetails)
	{
		Userdetails user = loginService.addUserdetails(userdetails);
		   ResponseEntity<Userdetails> rt= new ResponseEntity<Userdetails>(userdetails,HttpStatus.OK);
		   return rt;
   }

	
//	@GetMapping ("user/login/{UserName}/{password}")
//	public ResponseEntity<List<Userdetails>> login(@PathVariable("UserName") String UserName,@PathVariable("password") String password)
//	
//	{
//		List<Userdetails> userinfo=loginService.findUser(UserName,password);
//		ResponseEntity<List<Userdetails>> re=new ResponseEntity<List<Userdetails>>(userinfo,HttpStatus.OK);
//		return re;
//				
//	}
//	
	
	@GetMapping("userdetails")
	public ResponseEntity<List<Userdetails>>  findAllUserdetails()
	{
	  
		List<Userdetails> list = loginService.findAllUserdetails();
		ResponseEntity<List<Userdetails>>  rt = new ResponseEntity<List<Userdetails>>(list,HttpStatus.OK);
		return rt;
		
	}
}
