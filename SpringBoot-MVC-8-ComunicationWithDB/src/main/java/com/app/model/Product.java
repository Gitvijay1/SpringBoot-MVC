package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "prodtab")
public class Product {
	@Id
	private Integer pid;
	private String pname;
	private Double cost;
	private Double pDiscount;
	private Double pGst;

}
