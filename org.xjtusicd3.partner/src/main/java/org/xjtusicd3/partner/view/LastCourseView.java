package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.LastCoursePersistence;

public class LastCourseView {
	private int recordId;
	private int userId;
	private int courseId;
	private int videoId;
	private String recordDate;
	private int courseTitleId;
	private String courseTitle;
	private String videoName;
	private String courseImage;
	
	
	
	public String getCourseImage() {
		return courseImage;
	}
	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}
	public int getCourseTitleId() {
		return courseTitleId;
	}
	public void setCourseTitleId(int courseTitleId) {
		this.courseTitleId = courseTitleId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	
	public LastCourseView(LastCoursePersistence lastCoursePersistence){
		if(lastCoursePersistence==null){
			return;
		}
		this.recordId = lastCoursePersistence.getRecordId();
		this.userId = lastCoursePersistence.getUserId();
		this.courseId = lastCoursePersistence.getCourseId();
		this.videoId = lastCoursePersistence.getVideoId();
		this.recordDate = lastCoursePersistence.getRecordDate();
		this.courseTitleId = lastCoursePersistence.getCourseTitleId();
		this.courseTitle = lastCoursePersistence.getCourseTitle();
		this.videoName = lastCoursePersistence.getVideoName();
		this.courseImage = lastCoursePersistence.getCourseImage();
	}
	public LastCourseView(){
		
	}
	
}
