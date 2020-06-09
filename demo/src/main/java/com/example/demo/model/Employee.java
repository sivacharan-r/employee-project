package com.example.demo.model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue int id;
	private String name;
	private String company;
	private int deptid;
	private String country;
	private String state;
	
}
