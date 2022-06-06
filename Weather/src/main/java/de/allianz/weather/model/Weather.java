package de.allianz.weather.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
	
	
	
	private static final long serialVersionUID = -7973821099757632934L;

	@JsonProperty("id")
	private Long  id;
	
	@JsonProperty("main")
	private String main;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("icon")
	private String icon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}
	
	
	
	
	

}
