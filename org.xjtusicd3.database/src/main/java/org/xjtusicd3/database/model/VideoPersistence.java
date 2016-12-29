package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

@Table(tablename="video")
public class VideoPersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName="videoId")
	public int videoId;
	@TableField(columnName="courseId")
	public int courseId;
	@TableField(columnName="courseTitleId")
	public int courseTitleId;
	@TableField(columnName="videoName")
	public String videoName;
	@TableField(columnName="videoTime")
	public double videoTime;
	@TableField(columnName="videoSize")
	public long videoSize;
	@TableField(columnName="videoURL")
	public String videoURL;
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
	
	
	
	
}
