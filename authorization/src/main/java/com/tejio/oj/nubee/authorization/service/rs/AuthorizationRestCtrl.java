package com.tejio.oj.nubee.authorization.service.rs;

import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tejio.oj.nubee.authorization.model.Authorization;
import com.tejio.oj.nubee.authorization.service.AuthorizationService;

@RestController
@RequestMapping("/service")
public class AuthorizationRestCtrl {
	

	Logger logger = LoggerFactory.getLogger(AuthorizationRestCtrl.class);

	@Autowired
	private AuthorizationService authorizationService;
	
	@GetMapping("/authorize")
	public Authorization getAuthorized(@RequestHeader HttpHeaders httpHeaders, @RequestParam Map<String, String> requestParam) {
		
		logger.info("HTTPHeaders:"+httpHeaders.toString()+" | QueryParams:"+requestParam.toString());
		
		return authorizationService.authorize( httpHeaders, requestParam);
		
	}
	
	

}
