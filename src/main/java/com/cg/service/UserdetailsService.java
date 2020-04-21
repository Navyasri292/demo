package com.cg.service;

import java.util.List;

import com.cg.pms.entity.Userdetails;

public interface UserdetailsService {

	public Userdetails addUserdetails(Userdetails userdetails);
	 public List<Userdetails> findAllUserdetails();
	// public List<Userdetails> findUser(String Username,String Password);
}
