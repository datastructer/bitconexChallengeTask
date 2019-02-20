package com.bitconex.challenge.model;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class HistoryModel implements Serializable {
	
    /**
	 * 
	 */	
	private static final long serialVersionUID = 340750310099549748L;

	@JsonProperty("rev")
	@Id
    private String rev;
    
	@JsonProperty("created_at")
    private String  created_at;
    
	@JsonProperty("updated_at")
    private Date  updated_at;
    
	@JsonProperty("full_name")
    private String fullName;
    
	@JsonProperty("product_id")
    private String product_id;
	
	@JsonProperty("technology_type")
    private String  technology_type;
	
	@JsonProperty("device_type")
    private String  device_type;
    
	@JsonProperty("revtype")
    private String revtype;

	public String getRev() {
		return rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getTechnology_type() {
		return technology_type;
	}

	public void setTechnology_type(String technology_type) {
		this.technology_type = technology_type;
	}

	public String getDevice_type() {
		return device_type;
	}

	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}

	public String getRevtype() {
		return revtype;
	}

	public void setRevtype(String revtype) {
		this.revtype = revtype;
	}

	
   
   

}
