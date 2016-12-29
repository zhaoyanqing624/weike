package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.RecordPersistence;

public class RecordView {
	private int recordId;
	private int userId;
	private int courseId;
	private int videoId;
	private String recordDate;
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
	
	public RecordView(RecordPersistence recordPersistence){
		if(recordPersistence==null){
			return;
		}
		this.recordId = recordPersistence.getRecordId();
		this.userId = recordPersistence.getUserId();
		this.courseId = recordPersistence.getCourseId();
		this.videoId = recordPersistence.getVideoId();
		this.recordDate = recordPersistence.getRecordDate();
	}
	
	public RecordView(){
		
	}
}
