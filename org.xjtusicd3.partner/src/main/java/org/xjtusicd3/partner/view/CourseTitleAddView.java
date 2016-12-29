package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.CourseTitleAddPersistence;

public class CourseTitleAddView {
	private int courseTitleId;
	private int userId;
	private String courseTitle;
	private int courseTitleParentId;
	private int courseTitleLevels;
	
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	
	
	public CourseTitleAddView(CourseTitleAddPersistence courseTitleAddPersistence){
		if(courseTitleAddPersistence==null){
			return;
		}
		this.courseTitleId = courseTitleAddPersistence.getCourseTitleId();
		this.userId = courseTitleAddPersistence.getUserId();
		this.courseTitle  =courseTitleAddPersistence.getCourseTitle();
		this.courseTitleParentId = courseTitleAddPersistence.getCourseTitleParentId();
		this.courseTitleLevels = courseTitleAddPersistence.getCourseTitleLevels();
	}
	public CourseTitleAddView(){
		
	}
	
}
