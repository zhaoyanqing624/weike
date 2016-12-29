package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

public class UserpersonalPersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName="recordId")
	private int recordId;
	@TableField(columnName="recordDate")
	private String recordDate;
	@TableField(columnName="courseTitle")
	private String courseTitle;
	@TableField(columnName="courseTitleId")
	private int courseTitleId;
	@TableField(columnName="videoId")
	private int videoId;
	@TableField(columnName="videoName")
	private String videoName;
	@TableField(columnName="userId")
	private int userId;
	@TableField(columnName="userImage")
	private String userImage;
	@TableField(columnName="userAccount")
	private int userAccount;
	@TableField(columnName="userSignature")
	private String userSignature;
	@TableField(columnName="userJob")
	private String userJob;
	@TableField(columnName="userName")
	private String userName;
	@TableField(columnName="courseImage")
	private String courseImage;
	@TableField(columnName="courseShortIntroduce")
	private String courseShortIntroduce;
	
	
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
	public int getCourseTitleId() {
		return courseTitleId;
	}
	public void setCourseTitleId(int courseTitleId) {
		this.courseTitleId = courseTitleId;
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
	
	
}
