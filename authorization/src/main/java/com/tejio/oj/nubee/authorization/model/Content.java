package com.tejio.oj.nubee.authorization.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contentmetadata")
public class Content {
	@Id
	private String videoId;
	@Column(columnDefinition = "TINYTEXT")
	private String title;
	private Date publishedAt;
	private String channelId;
	@Column(columnDefinition = "TINYTEXT")
	private String channelTitle;
	private Integer categoryId;
	private Date trendingDate;
	@Column(columnDefinition = "TEXT")
	private String tags;
	private Integer viewCount;
	private Integer likes;
	private Integer dislikes;
	private Integer commentCount;
	private String thumbnailLink;
	private Boolean commentsDisabled;
	private Boolean ratingsDisabled;
	@Column(columnDefinition = "TEXT")
	private String description;

	public Content() {
	}

	public Content(String videoId, String title, Date publishedAt, String channelId, String channelTitle,
			Integer categoryId, Date trendingDate, String tags, Integer viewCount, Integer likes, Integer dislikes,
			Integer commentCount, String thumbnailLink, Boolean commentsDisabled, Boolean ratingsDisabled,
			String description) {
		super();
		this.videoId = videoId;
		this.title = title;
		this.publishedAt = publishedAt;
		this.channelId = channelId;
		this.channelTitle = channelTitle;
		this.categoryId = categoryId;
		this.trendingDate = trendingDate;
		this.tags = tags;
		this.viewCount = viewCount;
		this.likes = likes;
		this.dislikes = dislikes;
		this.commentCount = commentCount;
		this.thumbnailLink = thumbnailLink;
		this.commentsDisabled = commentsDisabled;
		this.ratingsDisabled = ratingsDisabled;
		this.description = description;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelTitle() {
		return channelTitle;
	}

	public void setChannelTitle(String channelTitle) {
		this.channelTitle = channelTitle;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Date getTrendingDate() {
		return trendingDate;
	}

	public void setTrendingDate(Date trendingDate) {
		this.trendingDate = trendingDate;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getDislikes() {
		return dislikes;
	}

	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public String getThumbnailLink() {
		return thumbnailLink;
	}

	public void setThumbnailLink(String thumbnailLink) {
		this.thumbnailLink = thumbnailLink;
	}

	public Boolean getCommentsDisabled() {
		return commentsDisabled;
	}

	public void setCommentsDisabled(Boolean commentsDisabled) {
		this.commentsDisabled = commentsDisabled;
	}

	public Boolean getRatingsDisabled() {
		return ratingsDisabled;
	}

	public void setRatingsDisabled(Boolean ratingsDisabled) {
		this.ratingsDisabled = ratingsDisabled;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Content [videoId=" + videoId + ", title=" + title + ", publishedAt=" + publishedAt + ", channelId="
				+ channelId + ", channelTitle=" + channelTitle + ", categoryId=" + categoryId + ", trendingDate="
				+ trendingDate + ", tags=" + tags + ", viewCount=" + viewCount + ", likes=" + likes + ", dislikes="
				+ dislikes + ", commentCount=" + commentCount + ", thumbnailLink=" + thumbnailLink
				+ ", commentsDisabled=" + commentsDisabled + ", ratingsDisabled=" + ratingsDisabled + ", description="
				+ description + "]";
	}

	

}