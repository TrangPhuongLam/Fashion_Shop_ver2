package com.fashionShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_ID", columnDefinition = "VARCHAR(10)")
	private String categoryID;
	
	@Column(name = "category_name", columnDefinition = "VARCHAR(50)")
	private String categoryname;
	
	@Column(name = "category_type", columnDefinition = "VARCHAR(50)")
	private String categorytype;
	
	@OneToMany(mappedBy = "categoryID")
	private List<Product> products = new ArrayList<Product>();
	
	
}
