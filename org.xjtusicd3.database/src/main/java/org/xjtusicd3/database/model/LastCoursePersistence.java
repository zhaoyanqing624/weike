package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

public class LastCoursePersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName = "recordId")
	private int recordId;
	@TableField(columnName = "userId")
	private int userId;
	@TableField(columnName = "courseId")
	private int courseId;
	@TableField(columnName = "videoId")
	private int videoId;
	@TableField(columnName = "recordDate")
	private String recordDate;
	@TableField(columnName = "courseTitleId")
	private int courseTitleId;
	@TableField(columnName = "courseTitle")
	private String courseTitle;
	@TableField(columnName = "videoName")
	private String videoName;
	
	
	@TableField(columnName = "courseImage")
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
	
	
}
