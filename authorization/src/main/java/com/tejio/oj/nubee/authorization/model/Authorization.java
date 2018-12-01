package com.tejio.oj.nubee.authorization.model;

import java.net.URL;
import java.util.Calendar;
import java.util.Date;

public class Authorization {

	//Authorization info
	private String status;
	private String code;
	private Date authorizedDate;
	
	//Stream metadata
	private URL streamingUrl;
	private URL thumbnailUrl;
	private Long streamDuration;
	



	public Authorization() {

	}

	public Authorization(String status, String code) {
		this.setCode(code);
		this.setStatus(status);
		this.authorizedDate = Calendar.getInstance().getTime();

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public URL getStreamingUrl() {
		return streamingUrl;
	}

	public void setStreamingUrl(URL streamingUrl) {
		this.streamingUrl = streamingUrl;
	}

	public Date getAuthorizedDate() {
		return authorizedDate;
	}

	public void setAuthorizedDate(Date authorizedDate) {
		this.authorizedDate = authorizedDate;
	}
	public Long getStreamDuration() {
		return streamDuration;
	}

	public void setStreamDuration(Long streamDuration) {
		this.streamDuration = streamDuration;
	}

	public URL getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(URL thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
}
