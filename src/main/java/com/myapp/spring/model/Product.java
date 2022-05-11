package com.myapp.spring.model;

import java.util.Objects;


import javax.persistence.*;


@Entity
@Table(name="devops_products")
public class Product {




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productId=");
		builder.append(productId);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", description=");
		builder.append(description);
		builder.append(", price=");
		builder.append(price);
		builder.append(", starRating=");
		builder.append(starRating);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, price, productId, productName, starRating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(description, other.description) && Objects.equals(price, other.price)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& Objects.equals(starRating, other.starRating);
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getStarRating() {
		return starRating;
	}

	public void setStarRating(Double starRating) {
		this.starRating = starRating;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private Integer productId;
	
	@Column(name="PRODUCT_NAME",nullable =  false)
	private String productName;
	
	@Column(name="PRODUCT_DESCRIPTION",nullable =  false)
	private String description;
	
	@Column(name="PRODUCT_PRICE",nullable =  false)
	private Double price;
	
	@Column(name="PRODUCT_RATING",nullable =  false)
	private Double starRating;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productName, String description, Double price, Double starRating) {
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.starRating = starRating;
	}

}
