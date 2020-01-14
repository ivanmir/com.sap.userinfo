package com.sap.userinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.cloud.security.xsuaa.token.SpringSecurityContext;

@RestController
public class UserInfoExtract {

	@GetMapping("/getPrincipal")
	public String doGet() {
	    return SpringSecurityContext.getToken().getEmail();
	}
}
