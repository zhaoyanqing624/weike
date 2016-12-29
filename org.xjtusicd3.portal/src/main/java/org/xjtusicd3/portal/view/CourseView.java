package org.xjtusicd3.portal.view;

import org.xjtusicd3.database.model.CourseportalPersistence;

public class CourseView {
	private int courseId;
	private String courseTitle;
	private int courseTitleId;
	private String courseImage;
	private String classifyName;
	private String userTrueName;
	private String courseIntroduce;
	private String courseDate;
	
	
	
	public int getCourseTitleId() {
		return courseTitleId;
	}
	public void setCourseTitleId(int courseTitleId) {
		this.courseTitleId = courseTitleId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseImage() {
		return courseImage;
	}
	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}
	public String getClassifyName() {
		return classifyName;
	}
	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}
	public String getUserTrueName() {
		return userTrueName;
	}
	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}
	public String getCourseIntroduce() {
		return courseIntroduce;
	}
	public void setCourseIntroduce(String courseIntroduce) {
		this.courseIntroduce = courseIntroduce;
	}
	public String getCourseDate() {
		return courseDate;
	}
	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}
	
	public CourseView(CourseportalPersistence courseportalPersistence){
		this.courseId = courseportalPersistence.getCourseId();
		this.courseImage = courseportalPersistence.getCourseImage();
		this.classifyName = courseportalPersistence.getClassifyName();
		this.userTrueName = courseportalPersistence.getUserTrueName();
		this.courseIntroduce = courseportalPersistence.getCourseIntroduce();
		this.courseDate = courseportalPersistence.getCourseDate();
		this.courseTitle =courseportalPersistence.getCourseTitle();
		this.courseTitleId = courseportalPersistence.getCourseTitleId();
		
	}
	public CourseView(){
		
	}
}
