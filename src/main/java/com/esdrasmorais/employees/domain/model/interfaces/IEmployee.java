package com.esdrasmorais.employees.domain.model.interfaces;

import java.util.Date;
import java.util.List;

import com.esdrasmorais.employees.domain.model.Profession;

public interface IEmployee {
	public void setEmail(String email);
	public void setDocuments(List<IDocument> documents);
	public void setName(String name);
	public void setBirth(Date birth);
	public void setIsOutSourced(Boolean isOutSourced);
	public void setProfession(Profession profession);
}
