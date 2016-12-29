package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

@Table(tablename="course")
public class CourseListPersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName = "courseId")
	public int courseId;
	@TableField(columnName = "courseTitleId")
	public int courseTitleId;
	@TableField(columnName = "classifyId")
	public int classifyId;
	@TableField(columnName = "courseShortIntroduce")
	public String courseShortIntroduce;
	@TableField(columnName = "courseIntroduce")
	public String courseIntroduce;
	@TableField(columnName = "courseDifficulty")
	public String courseDifficulty;
	@TableField(columnName = "courseTime")
	public double courseTime;
	@TableField(columnName = "courseScore")
	public float courseScore;
	@TableField(columnName = "courseNeedkonw")
	public String courseNeedkonw;
	@TableField(columnName = "courseWilllearn")
	public String courseWilllearn;
	@TableField(columnName = "courseImage")
	public String courseImage;
	@TableField(columnName = "courseTitle")
	public String courseTitle;
	@TableField(columnName = "courseState")
	public int courseState;
	@TableField(columnName = "courseDate")
	public String courseDate;
	@TableField(columnName = "courseTitleParentId")
	public int courseTitleParentId;
	@TableField(columnName = "courseTitleLevels")
	public int courseTitleLevels;
	@TableField(columnName = "classifyName")
	public String classifyName;
	@TableField(columnName = "classifyParentId")
	public int classifyParentId;
	@TableField(columnName = "classifyDuo")
	public String classifyDuo;
	@TableField(columnName = "classifyLevels")
	public int classifyLevels;
	@TableField(columnName = "videoId")
	public int videoId;
	@TableField(columnName = "videoName")
	public String videoName;
	@TableField(columnName = "videoTime")
	public double videoTime;
	@TableField(columnName = "videoSize")
	public long videoSize;
	@TableField(columnName = "videoURL")
	public String videoURL;
	
	
	
	public int getCourseState() {
		return courseState;
	}
	public void setCourseState(int courseState) {
		this.courseState = courseState;
	}
	public String getCourseDate() {
		return courseDate;
	}
	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}
	public String getCourseImage() {
		return courseImage;
	}
	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}
	public double getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(double courseTime) {
		this.courseTime = courseTime;
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

	public String getVideoURL() {
		return videoURL;
	}
	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}
	public int getClassifyLevels() {
		return classifyLevels;
	}
	public void setClassifyLevels(int classifyLevels) {
		this.classifyLevels = classifyLevels;
	}
	public String getClassifyName() {
		return classifyName;
	}
	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}
	public int getClassifyParentId() {
		return classifyParentId;
	}
	public void setClassifyParentId(int classifyParentId) {
		this.classifyParentId = classifyParentId;
	}
	public String getClassifyDuo() {
		return classifyDuo;
	}
	public void setClassifyDuo(String classifyDuo) {
		this.classifyDuo = classifyDuo;
	}
	public int getCourseTitleParentId() {
		return courseTitleParentId;
	}
	public void setCourseTitleParentId(int courseTitleParentId) {
		this.courseTitleParentId = courseTitleParentId;
	}
	public int getCourseTitleLevels() {
		return courseTitleLevels;
	}
	public void setCourseTitleLevels(int courseTitleLevels) {
		this.courseTitleLevels = courseTitleLevels;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
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
	public int getClassifyId() {
		return classifyId;
	}
	public void setClassifyId(int classifyId) {
		this.classifyId = classifyId;
	}
	public String getCourseShortIntroduce() {
		return courseShortIntroduce;
	}
	public void setCourseShortIntroduce(String courseShortIntroduce) {
		this.courseShortIntroduce = courseShortIntroduce;
	}
	public String getCourseIntroduce() {
		return courseIntroduce;
	}
	public void setCourseIntroduce(String courseIntroduce) {
		this.courseIntroduce = courseIntroduce;
	}
	public String getCourseDifficulty() {
		return courseDifficulty;
	}
	public void setCourseDifficulty(String courseDifficulty) {
		this.courseDifficulty = courseDifficulty;
	}

	public float getCourseScore() {
		return courseScore;
	}
	public void setCourseScore(float courseScore) {
		this.courseScore = courseScore;
	}
	public String getCourseNeedkonw() {
		return courseNeedkonw;
	}
	public void setCourseNeedkonw(String courseNeedkonw) {
		this.courseNeedkonw = courseNeedkonw;
	}
	public String getCourseWilllearn() {
		return courseWilllearn;
	}
	public void setCourseWilllearn(String courseWilllearn) {
		this.courseWilllearn = courseWilllearn;
	}
	
	
	
	

}
