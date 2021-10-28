package com.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 20)
	private String name;
	
	@Column(nullable = false,unique = true, length = 30)
	private String emailId;
	
	@Column(nullable = false,length = 20)
	private String passWord;
	
	@Column(nullable = false,length = 10)
	private long contact;
}