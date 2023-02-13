package com.nuage.FirstSpring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.nuage.model.Mytoken;
import com.nuage.model.NuageResponse;
import com.nuage.model.login;


import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.servlet.http.HttpServletRequest;

import com.nuage.model.*;
@Api
@RestController
@RequestMapping(value = "/iam")
public class UserAuth {
	static Map<String,Mytoken> logins = Collections.synchronizedMap(new HashMap<String,Mytoken>());
    public UserAuth() {
        Mytoken mytoken = new Mytoken("admin","xmma");
    	logins.put("admin",mytoken);
    }
    @ApiOperation(value = "身份认证", nickname = "getAuthenty", notes = "失败返回401，成功返回JWT令牌 令牌由三段字符串组成，Header.Payload.Signature", response = NuageResponse.class, tags = {})
    @ApiResponses({@ApiResponse(code = 200, message = "ok", response = NuageResponse.class), @ApiResponse(code = 500, message = "Error Response", response = ErrorInfo.class)})
    @RequestMapping(value = {"/auth"}, produces = {"application/json"}, method = {RequestMethod.POST})
    public Mytoken getToken(@RequestBody login logininfo) {
        return logins.get(logininfo.getlogin().getUser());
    }
    

}
