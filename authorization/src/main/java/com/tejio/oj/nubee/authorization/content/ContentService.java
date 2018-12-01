package com.tejio.oj.nubee.authorization.content;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.tejio.oj.nubee.authorization.exception.NubeeApplicationException;
import com.tejio.oj.nubee.authorization.model.Content;
import com.tejio.oj.nubee.authorization.model.ContentRaw;

@Service
public class ContentService {

	Logger logger = LoggerFactory.getLogger(ContentService.class);

	@Autowired
	private ContentRepository contentRepository;

	@Autowired
	private ContentRawRepository contentRawRepository;

//	@PostConstruct
//	public void loadContents() {
//
//	}


	public List<Content> getAllContents() {
		List<Content> contents = new ArrayList<>();
		contentRepository.findAll().forEach(x -> contents.add(x));
		return contents;
	}

	public Content getContent(String contentId) {
		if (null != contentId && !contentId.isBlank()) {

			return contentRepository.findById(contentId).get();
		} else {
			throw new NubeeApplicationException(HttpStatus.NOT_FOUND,"content not found","00001",null,null);
		}
	}

	public void saveOrUpdateContent(Content content) {
		contentRepository.save(content);
	}

	public void loadData() {

		contentRawRepository.findAll().forEach(x -> refactorRawMetadata(x));
	}

	private void refactorRawMetadata(ContentRaw cnt2) {
		//                                          "2018-10-31T14:17:10.000Z"
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		Content content = new Content();

		content.setCategoryId(cnt2.getCategoryId());
		content.setChannelId(cnt2.getChannelId());
		content.setChannelTitle(cnt2.getChannelTitle());
		content.setCommentCount(cnt2.getCommentCount());
		content.setCommentsDisabled(Boolean.parseBoolean(cnt2.getCommentsDisabled()));
		content.setDescription(cnt2.getDescription());
		content.setDislikes(cnt2.getDislikes());
		content.setLikes(cnt2.getLikes());
		try {

			content.setPublishedAt(sdf.parse(cnt2.getPublishedAt()));

		} catch (java.text.ParseException e) {
			logger.error(e.toString());
			e.printStackTrace();
		}

		try {

			content.setTrendingDate(sdf.parse(cnt2.getTrendingDate()));
		} catch (java.text.ParseException e) {
			logger.error(e.toString());
		}

		content.setRatingsDisabled(Boolean.parseBoolean(cnt2.getRatingsDisabled()));
		content.setTags(cnt2.getTags());
		content.setThumbnailLink(cnt2.getThumbnailLink());
		content.setTitle(cnt2.getTitle());
		content.setVideoId(cnt2.getVideoId());
		content.setViewCount(cnt2.getViewCount());

		logger.info(content.toString());
		saveOrUpdateContent(content);

	}

}
