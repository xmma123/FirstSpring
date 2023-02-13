package com.nuage.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@ApiModel(description = "账号信息")
public class logininfo {
	private String User ;
	private String Password ;
	
	public String getUser() {
	    return this.User;
	  }
	  
	  public void setUser(String User) {
	    this.User = User;
	  }
	  
	  public String getPassword() {
	    return this.Password;
	  }
	  
	  public void setPassword(String Password) {
	    this.Password = Password;
	  }
	}

