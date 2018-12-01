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

import com.tejio.oj.nubee.authorization.console.ConsoleService;
import com.tejio.oj.nubee.authorization.model.Authorization;
import com.tejio.oj.nubee.authorization.service.AuthorizationService;

@RestController
@RequestMapping("/service")
public class AuthorizationConsoleCtrl {
	
	@Autowired
	private ConsoleService consoleService;
	
	Logger logger = LoggerFactory.getLogger(AuthorizationConsoleCtrl.class);
	
	@GetMapping("/console")
	public JSONArray Console(@RequestHeader HttpHeaders httpHeaders, @RequestParam Map<String, String> requestParam) {
		//user=teja&user-type=admin&operation=refresh&asset=data&asset-type=content
		logger.info("HTTPHeaders:"+httpHeaders.toString()+" | QueryParams:"+requestParam.toString());
		String user = requestParam.get("user");
		String userType = requestParam.get("user");
		String operation = requestParam.get("operation");
		String asset = requestParam.get("asset");
		String assetType = requestParam.get("asset-type");
		
		consoleService.refreshDataFromRawSource();
		JSONArray responseObj = new JSONArray();
		
		JSONObject entry = new JSONObject();
		
		entry.put("usertype", "DEFAULT");
		entry.put("httpheaders", httpHeaders);
		entry.put("requestparams", requestParam);
		
		responseObj.add(entry);
		
		return responseObj;
		
	}
	
	

}
