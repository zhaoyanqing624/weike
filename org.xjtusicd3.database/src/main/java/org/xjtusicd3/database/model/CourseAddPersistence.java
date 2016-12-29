package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

@Table(tablename="course")
public class CourseAddPersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName = "courseId")
	public int courseId;
	@TableField(columnName = "userId")
	public int userId;
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
	@TableField(columnName = "courseNeedkonw")
	public String courseNeedkonw;
	@TableField(columnName = "courseWilllearn")
	public String courseWilllearn;
	@TableField(columnName = "courseImage")
	public String courseImage;
	@TableField(columnName = "courseState")
	public int courseState;
	@TableField(columnName = "courseDate")
	public String courseDate;
	@TableField(columnName = "courseTime")
	public double courseTime;
	@TableField(columnName = "courseScore")
	public int courseScore;
	
	
	
	

	public double getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(double courseTime) {
		this.courseTime = courseTime;
	}
	public int getCourseScore() {
		return courseScore;
	}
	public void setCourseScore(int courseScore) {
		this.courseScore = courseScore;
	}
	public String getCourseDate() {
		return courseDate;
	}
	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}
	public int getCourseState() {
		return courseState;
	}
	public void setCourseState(int courseState) {
		this.courseState = courseState;
	}
	public String getCourseImage() {
		return courseImage;
	}
	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}
	public int getCourseId() {
		return courseId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
