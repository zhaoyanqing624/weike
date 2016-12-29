package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.VideoPersistence;

public class VideoView {
	private int videoId;
	private int courseId;
	private int courseTitleId;
	private String videoName;
	private double videoTime;
	private long videoSize;
	private String videoURL;
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getCourseTitleId() {
		return courseTitleId;
	}
	public void setCourseTitleId(int courseTitleId) {
		this.courseTitleId = courseTitleId;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	
	public double getVideoTime() {
		return videoTime;
	}
	public void setVideoTime(double videoTime) {
		this.videoTime = videoTime;
	}
	public long getVideoSize() {
		return videoSize;
	}
	public void setVideoSize(long videoSize) {
		this.videoSize = videoSize;
	}
	public String getVideoURL() {
		return videoURL;
	}
	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}
	
	public VideoView(VideoPersistence videoPersistence){
		this.videoId = videoPersistence.getVideoId();
		this.courseId = videoPersistence.getCourseId();
		this.courseTitleId = videoPersistence.getCourseTitleId();
		this.videoName = videoPersistence.getVideoName();
		this.videoTime = videoPersistence.getVideoTime();
		this.videoSize = videoPersistence.getVideoSize();
		this.videoURL = videoPersistence.getVideoURL();
	}
	public VideoView(){
		
	}
}
