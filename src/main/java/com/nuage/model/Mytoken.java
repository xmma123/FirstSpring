package com.nuage.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@ApiModel(description = "认证实体")
public class Mytoken {
	String token;
    String user;
    public  Mytoken(String ur,String Tk) {
    	token=Tk;
    	user=ur;
    }

}
