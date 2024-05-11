package com.userapplication.payload.request;

import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import com.userapplication.model.User;
 
public class SignupRequest {
   
    @Size(max = 50)
    @Email
    private String email;
    
    private Set<String> role;
    
    private User user;
    
   
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
    @Size(min = 6, max = 40)
    private String password;
    
    private String firstName;
    
    private String lastName;
    
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public SignupRequest(@Size(max = 50) @Email String email, Set<String> role, User user,
			@NotBlank @Size(min = 6, max = 40) String password, String firstName, String lastName) {
		super();
		this.email = email;
		this.role = role;
		this.user = user;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public SignupRequest() {
		
	}

	@Override
	public String toString() {
		return "SignupRequest [email=" + email + ", role=" + role + ", user=" + user + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
    
}