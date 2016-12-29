package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.CourseAddPersistence;

public class CourseAddView {
	private int courseId;
	private int userId;
	private int courseTitleId;
	private int classifyId;
	private String classifyName;
	private String courseShortIntroduce;
	private String courseIntroduce;
	private String courseDifficulty;
	private String courseNeedkonw;
	private String courseWilllearn;
	private String courseTitle;
	private String courseImage;
	private int courseState;
	private String courseDate;
	private double courseTime;
	private int courseScore;
	
	
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
	public String getClassifyName() {
		return classifyName;
	}
	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
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
	
	public CourseAddView(CourseAddPersistence courseAddView){
		if(courseAddView==null){
			return;
		}
		this.courseId = courseAddView.getCourseId();
		this.userId = courseAddView.getUserId();
		this.courseTitleId = courseAddView.getCourseTitleId();
		this.classifyId = courseAddView.getClassifyId();
		this.courseShortIntroduce = courseAddView.getCourseShortIntroduce();
		this.courseIntroduce = courseAddView.getCourseIntroduce();
		this.courseDifficulty = courseAddView.getCourseDifficulty();
		this.courseNeedkonw = courseAddView.getCourseNeedkonw();
		this.courseWilllearn = courseAddView.getCourseWilllearn();
		this.courseImage = courseAddView.getCourseImage();
		this.courseState = courseAddView.getCourseState();
		this.courseDate = courseAddView.getCourseDate();
		this.courseTime = courseAddView.getCourseTime();
		this.courseScore = courseAddView.getCourseScore();
	}
	public CourseAddView(){}
	
}
