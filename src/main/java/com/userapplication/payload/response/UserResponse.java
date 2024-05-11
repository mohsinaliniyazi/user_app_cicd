package com.userapplication.payload.response;

import lombok.Data;

@Data
public class UserResponse {
	
	private String name;
	
	private String location;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public UserResponse(String user_name, String location) {
		super();
		this.name = user_name;
		this.location = location;
	}
	
	public UserResponse() {
		
	}

	@Override
	public String toString() {
		return "UserResponse [name=" + name + ", location=" + location + "]";
	}
	
	

}
