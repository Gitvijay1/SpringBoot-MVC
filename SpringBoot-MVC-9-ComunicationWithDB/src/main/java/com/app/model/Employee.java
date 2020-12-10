package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "emp1")
@Data
public class Employee {
	@Id
	private Integer eid;
	private String ename;
	private String job;
	private Integer sal;
	private Integer bonas;

}
