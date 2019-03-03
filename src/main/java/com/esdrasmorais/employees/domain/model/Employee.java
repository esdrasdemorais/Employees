package com.esdrasmorais.employees.domain.model;

import java.util.Date;
import java.util.List;

import com.esdrasmorais.employees.domain.model.interfaces.IDocument;
import com.esdrasmorais.employees.domain.model.interfaces.IEmployee;

public abstract class Employee implements IEmployee {
	protected String email;
	protected List<IDocument> documents;
	protected String name;
	protected Date birth;
	protected Boolean isOutSourced;
	protected Profession profession;
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDocuments(List<IDocument> documents) {
		this.documents = documents;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public void setIsOutSourced(Boolean isOutSourced) {
		this.isOutSourced = isOutSourced;
	}
	
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public List<IDocument> getDocuments() {
		return this.documents;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Date getBirth() {
		return this.birth;
	}
	
	public Boolean getIsOutSourced() {
		return this.isOutSourced;
	}
	
	public Profession getProfession() {
		return this.profession;
	}
}
