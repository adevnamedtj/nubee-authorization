package com.tejio.oj.nubee.authorization.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejio.oj.nubee.authorization.content.ContentService;

@Service
public class ConsoleServiceImpl implements ConsoleService {

	@Autowired
	private ContentService contentService;

	@Override
	public Boolean refreshDataFromRawSource() {
		contentService.loadData();
		return Boolean.TRUE;
	}

}
