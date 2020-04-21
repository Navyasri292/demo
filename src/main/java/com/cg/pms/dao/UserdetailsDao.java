package com.cg.pms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.pms.entity.Userdetails;


	@Repository
	public interface UserdetailsDao extends JpaRepository<Userdetails,Integer>{

//		
//	@Query("From Userdetails where e.userName=:user and e.password=:pass")
//	public List<Userdetails> findUser(@Param("user") String user,@Param("pass") String pass);
//	
	@Query(" FROM Userdetails where d.designation=:des")
	public List<Userdetails>  findByDesignation(@Param("designation") String des);
	
		
}
