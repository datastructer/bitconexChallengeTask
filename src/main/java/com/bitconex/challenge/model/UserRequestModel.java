package com.bitconex.challenge.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequestModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8533092799492077296L;
	
    @JsonProperty("userId")
	private Long userId;

    @JsonProperty("userId")
	public Long getUserId() {
		return userId;
	}
    @JsonProperty("userId")
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

}
