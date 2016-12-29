package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.UserpersonalPersistence;

public class UserpersonalView {
	
	private int recordId;
	private String recordDate;
	private String courseTitle;
	private String courseImage;
	private String courseShortIntroduce;
	private int courseTitleId;
	private int videoId;
	private String videoName;
	
	private int userId;
	private String userImage;
	private int userAccount;
	private String userSignature;
	private String userJob;
	private String userName;

	
	
	public String getCourseShortIntroduce() {
		return courseShortIntroduce;
	}
	public void setCourseShortIntroduce(String courseShortIntroduce) {
		this.courseShortIntroduce = courseShortIntroduce;
	}
	public String getCourseImage() {
		return courseImage;
	}
	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public int getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(int userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserSignature() {
		return userSignature;
	}
	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}
	public String getUserJob() {
		return userJob;
	}
	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getCourseTitleId() {
		return courseTitleId;
	}
	public void setCourseTitleId(int courseTitleId) {
		this.courseTitleId = courseTitleId;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public String getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	
	
	public UserpersonalView(UserpersonalPersistence userpersonalPersistence){
		this.recordId = userpersonalPersistence.getRecordId();
		this.recordDate = userpersonalPersistence.getRecordDate();
		this.courseTitle = userpersonalPersistence.getCourseTitle();
		this.courseTitleId = userpersonalPersistence.getCourseTitleId();
		this.videoId = userpersonalPersistence.getVideoId();
		this.videoName = userpersonalPersistence.getVideoName();
		this.userId = userpersonalPersistence.getUserId();
		this.userImage = userpersonalPersistence.getUserImage();
		this.userAccount = userpersonalPersistence.getUserAccount();
		this.userSignature = userpersonalPersistence.getUserSignature();
		this.userJob = userpersonalPersistence.getUserJob();
		this.userName = userpersonalPersistence.getUserName();
		this.courseImage = userpersonalPersistence.getCourseImage();
		this.courseShortIntroduce = userpersonalPersistence.getCourseShortIntroduce();
		
	}
	public UserpersonalView(){
		
	}
	
}
