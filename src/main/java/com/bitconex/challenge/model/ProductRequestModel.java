package com.bitconex.challenge.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductRequestModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8533092799492077296L;
	
    @JsonProperty("productId")
	private Long productId;

    @JsonProperty("productId")
	public Long getProductId() {
		return productId;
	}
    @JsonProperty("productId")
	public void setProductId(Long productId) {
		this.productId = productId;
	}


	

}
