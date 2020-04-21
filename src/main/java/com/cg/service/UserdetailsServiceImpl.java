package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.pms.dao.UserdetailsDao;
import com.cg.pms.entity.Userdetails;

@Service
public class UserdetailsServiceImpl implements UserdetailsService {

	  @Autowired
	    UserdetailsDao userdetailsdao;
	    
	  
		@Override
		public Userdetails addUserdetails(Userdetails userdetails) {
			userdetailsdao.saveAndFlush(userdetails);
			return userdetails;
		}


		@Override
		public List<Userdetails> findAllUserdetails() {
			List<Userdetails> list = userdetailsdao.findAll();
			return list;
		}


//		@Override
//		public List<Userdetails> findUser(String Username, String Password) {
//
//			return userdetailsdao.findUser(Username,Password);
//		}


		
}
