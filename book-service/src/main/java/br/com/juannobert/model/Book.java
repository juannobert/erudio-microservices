package br.com.juannobert.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Book implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String author;
	
	private Date launchDate;
	
	private Double price;
	
	private String currency;
	
	private String enviroment;
	
	public Book() {
	}

	public Book(Long id, String author, Date launchDate, Double price, String currency, String enviroment) {
		this.id = id;
		this.author = author;
		this.launchDate = launchDate;
		this.price = price;
		this.currency = currency;
		this.enviroment = enviroment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
