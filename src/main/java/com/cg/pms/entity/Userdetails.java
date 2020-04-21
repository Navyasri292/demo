package com.cg.pms.entity;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

    @Entity
	@Table(name="userdetails_tbl")
	public class Userdetails {
	    
		@Id
		@Column(name="id")
		private int Id;
		
		@Column(name="userName",length=10)
		private String  userName;
		
		@Column(name="password",length=10)
		private String password;
		
		
		@Column(name="phonenum",length=20)
		private String phoneNum;
		
		@Column(name="designation",length=10)
		private String Designation;
		
		@OneToMany
		@JoinColumn(name="designationid")
		private Designation designation;

		
		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	
		

		public Designation getDesignation() {
			return designation;
		}

		public void setDesignation(Designation designation) {
			this.designation = designation;
		}

		public String getPhoneNum() {
			return phoneNum;
		}

		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		
		
		
			
		
		
	}
		
		
		

