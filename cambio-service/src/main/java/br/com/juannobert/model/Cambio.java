package br.com.juannobert.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cambio implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionFactor;
	
	private BigDecimal convertedValues;
	
	private String environment;
	
	public Cambio() {
	}

	public Cambio(Long id, String from, String to, BigDecimal conversionFactor, BigDecimal convertedValues,
			String environment) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.convertedValues = convertedValues;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public BigDecimal getConvertedValues() {
		return convertedValues;
	}

	public void setConvertedValues(BigDecimal convertedValues) {
		this.convertedValues = convertedValues;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	

}
