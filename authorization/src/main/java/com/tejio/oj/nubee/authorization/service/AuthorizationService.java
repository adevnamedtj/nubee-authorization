package com.tejio.oj.nubee.authorization.service;

import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.tejio.oj.nubee.authorization.model.Authorization;

@Service
public interface AuthorizationService {
	
	public Authorization authorize(HttpHeaders httpHeaders, Map<String, String> requestParam);

}
