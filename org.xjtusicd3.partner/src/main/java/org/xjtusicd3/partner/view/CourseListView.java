package org.xjtusicd3.partner.view;

import java.util.List;

import org.xjtusicd3.database.model.CourseListPersistence;

public class CourseListView {
	private int courseId;
	private int TitleId;
	private int classifyId;
	private String courseShortIntroduce;
	private String courseIntroduce;
	private String courseDifficulty;
	private double courseTime;
	private float courseScore;
	private String courseNeedkonw;
	private String courseWilllearn;
	private String courseImage;
	private int courseTitleId;
	private String courseTitle;
	private int courseTitleParentId;
	private int courseTitleLevels;
	private String classifyName;
	private int classifyParentId;
	private int classifyLevels;
	private String classifyDuo;
	private int videoId;
	private String videoName;
	private double videoTime;
	private long videoSize;
	private String videoURL;
	private int courseState;
	private String courseDate;
	
	private List<VideoContentView> videocontent;
	
	
	
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
	public List<VideoContentView> getVideocontent() {
		return videocontent;
	}
	public void setVideocontent(List<VideoContentView> videocontent) {
		this.videocontent = videocontent;
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
	public int getClassifyLevels() {
		return classifyLevels;
	}
	public void setClassifyLevels(int classifyLevels) {
		this.classifyLevels = classifyLevels;
	}
	public String getClassifyDuo() {
		return classifyDuo;
	}
	public void setClassifyDuo(String classifyDuo) {
		this.classifyDuo = classifyDuo;
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
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getTitleId() {
		return TitleId;
	}
	public void setTitleId(int titleId) {
		TitleId = titleId;
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
	public void setCourseWilllearn(String courseWillearn) {
		this.courseWilllearn = courseWillearn;
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
	public  CourseListView(CourseListPersistence listPersistence) {
		if (listPersistence==null) {
			return;
		}
		this.courseId = listPersistence.getCourseId();
		this.courseTitleId = listPersistence.getCourseTitleId();
		this.classifyId = listPersistence.getClassifyId();
		this.courseShortIntroduce = listPersistence.getCourseShortIntroduce();
		this.courseIntroduce = listPersistence.getCourseIntroduce();
		this.courseDifficulty = listPersistence.getCourseDifficulty();
		this.courseTime = listPersistence.getCourseTime();
		this.courseScore = listPersistence.getCourseScore();
		this.courseNeedkonw = listPersistence.getCourseNeedkonw();
		this.courseWilllearn = listPersistence.getCourseWilllearn();
		this.courseTitle = listPersistence.getCourseTitle();
		this.courseTitleParentId = listPersistence.getCourseTitleParentId();
		this.courseTitleLevels = listPersistence.getCourseTitleLevels();
		this.classifyName = listPersistence.getClassifyName();
		this.classifyParentId = listPersistence.getClassifyParentId();
		this.classifyDuo = listPersistence.getClassifyDuo();
		this.classifyLevels = listPersistence.getClassifyLevels();
		this.videoId = listPersistence.getVideoId();
		this.videoName = listPersistence.getVideoName();
		this.videoTime = listPersistence.getVideoTime();
		this.videoSize = listPersistence.getVideoSize();
		this.videoURL = listPersistence .getVideoURL();
		this.courseImage = listPersistence.getCourseImage();
		this.courseDate = listPersistence.getCourseDate();
		this.courseState = listPersistence.getCourseState();
	}
	public CourseListView(){
		
	}
		
	
}
