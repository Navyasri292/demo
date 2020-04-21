package com.cg.pms.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="designation_tbl")
public class Designation {

	 @Id
//	  @GeneratedValue(generator="mygen",strategy=GenerationType.SEQUENCE)
//	  @SequenceGenerator(name="mygen",sequenceName="designation_seq",allocationSize=1)
//	 
	  @Column(name="designationid")
	  private int designationId;
	  
	  @Column(name="designation",length=15)
	  private String designation;
	  
	  @OneToMany(mappedBy="designation")
	  @JsonIgnore
	  List<Userdetails>  userdetails = new ArrayList<>();


	public int getDesignationId() {
		return designationId;
	}

	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Userdetails> getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(List<Userdetails> userdetails) {
		this.userdetails = userdetails;
	}
	  
	  
	  
	  
}
