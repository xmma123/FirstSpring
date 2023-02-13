package com.nuage.model;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author Linker
 * @Date 2020/3/17 10:49 下午
 * @Version 1.0
 */






@ApiModel(description = "认证")
public class login {
	

	public logininfo login ;
		
	public logininfo getlogin() {
		return this.login;
	}
}




