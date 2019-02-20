package com.bitconex.challenge.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ozanozgurdursun
 *
 */
public class UserDTO implements Serializable {


	private static final long serialVersionUID = -4432738839130705469L;

	@JsonProperty("id")
	private String Id;
	
	@JsonProperty("fullName")
	private String  fullName;
	
	@JsonProperty("productId")
	private String productId;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	

	
	
}
