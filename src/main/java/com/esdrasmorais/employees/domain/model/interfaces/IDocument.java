package com.esdrasmorais.employees.domain.model.interfaces;

import java.util.Date;

public interface IDocument {
	public void setCountry(String country);
	public void setAddress(String address);
	public void setExpiryDate(Date expiryDate);
}
