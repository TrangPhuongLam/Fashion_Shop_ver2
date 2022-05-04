package com.fashionShop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_ID", columnDefinition = "VARCHAR(10)")
	private String productID;
	
	@ManyToOne
	@JoinColumn(name = "category_ID", referencedColumnName = "category_ID")
	private Categories categoryID;
	
	@Column(name = "product_name", columnDefinition = "VARCHAR(50)")
	private String productname;
	
	@Column(name = "price", columnDefinition = "BIGINT")
	private long price;
	
	@Column(name = "date_Import", columnDefinition = "DATE")
	private Date dateImport;
	
	@Column(name = "amount", columnDefinition = "INT")
	private int amount;
	
	@Column(name = "image", columnDefinition = "VARCHAR(255)")
	private String image;
	
	@ManyToMany(mappedBy = "products")
	private List<ShoppingCart> shoppingCarts = new ArrayList<ShoppingCart>();

	@ManyToMany(mappedBy = "products")
	private List<Bill> bills = new ArrayList<Bill>();
	
	
	
}
