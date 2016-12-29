package org.xjtusicd3.partner.view;

import java.util.List;

import org.xjtusicd3.database.model.CommentPersistence;

public class CommentView {
	private int commentId;
	private int userId;
	private int videoId;
	private String commentName;
	private String commentDate;
	private int commentState;
	
	private List<UserView> userViews;

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getCommentName() {
		return commentName;
	}

	public void setCommentName(String commentName) {
		this.commentName = commentName;
	}

	public String getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}

	public int getCommentState() {
		return commentState;
	}

	public void setCommentState(int commentState) {
		this.commentState = commentState;
	}

	public List<UserView> getUserViews() {
		return userViews;
	}

	public void setUserViews(List<UserView> userViews) {
		this.userViews = userViews;
	}
	
	public CommentView(CommentPersistence commentPersistence){
		if(commentPersistence==null){
			return;
		}
		this.commentId = commentPersistence.getCommentId();
		this.userId = commentPersistence.getUserId();
		this.videoId = commentPersistence.getUserId();
		this.commentName = commentPersistence.getCommentName();
		this.commentDate = commentPersistence.getCommentDate();
		this.commentState = commentPersistence.getCommentState();
	}
	public CommentView(){
		
	}
	
}
