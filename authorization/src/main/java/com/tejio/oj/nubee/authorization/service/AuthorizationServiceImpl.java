package com.tejio.oj.nubee.authorization.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.tejio.oj.nubee.authorization.content.ContentService;
import com.tejio.oj.nubee.authorization.model.Authorization;
import com.tejio.oj.nubee.authorization.model.Content;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {
	Logger logger = LoggerFactory.getLogger(AuthorizationServiceImpl.class);

	@Autowired
	private ContentService contentService;

	public Authorization authorize(HttpHeaders httpHeaders, Map<String, String> requestParam) {
		logger.info("Got the request");
		Authorization authorization = new Authorization("SUCCESS", "200");
		String contentId = requestParam.get("contentid");

		Content content = contentService.getContent(contentId);
		
		try {
			authorization.setStreamingUrl(new URL("https://youtu.be/"+content.getVideoId()));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			authorization.setThumbnailUrl((new URL(content.getThumbnailLink())));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		authorization.setStreamDuration(10000000L);

		return authorization;
	}

}
