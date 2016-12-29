package org.xjtusicd3.partner.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.RecordHelp;
import org.xjtusicd3.database.model.LastCoursePersistence;
import org.xjtusicd3.database.model.RecordPersistence;
import org.xjtusicd3.partner.view.LastCourseView;
import org.xjtusicd3.partner.view.RecordView;

public class RecordService {

	public static void addRecord(RecordView recordView) {
		RecordPersistence recordPersistence = new RecordPersistence();
		recordPersistence.setRecordId(recordView.getRecordId());
		recordPersistence.setUserId(recordView.getUserId());
		recordPersistence.setCourseId(recordView.getCourseId());
		recordPersistence.setVideoId(recordView.getVideoId());
		recordPersistence.setRecordDate(recordView.getRecordDate());
		RecordHelp.addRecord(recordPersistence);
	}
	/*
	 * 判断记录是否存在
	 */
	public static RecordView selectRecord(int userId,int courseId){
		RecordPersistence recordPersistence = RecordHelp.selectRecord(userId,courseId);
		if(recordPersistence==null){
			return null;
		}
		RecordView recordView = new RecordView(recordPersistence);
		return recordView;
	}
	public static int selectRecord2(int userId,int courseId){
		int a = RecordHelp.selectRecord2(userId, courseId);
		return a;
	}
	public static int selectRecord3(int userId,int courseId){
		int a = RecordHelp.selectRecord3(userId, courseId);
		return a;
	}
	public static void updateRecord(int recordId, int c, String recordDate) {
		RecordHelp.updateRecord(recordId,c,recordDate);
	}
	
	/*
	 * 查找最近学习记录
	 */
	public static List<LastCourseView> lastCourse(int userid) {
		List<LastCourseView> courseListViews = new ArrayList<LastCourseView>();
		List<LastCoursePersistence> courseListPersistences = RecordHelp.selectMyCourse(userid);
		if(courseListPersistences == null){
			return null;
			}
		for(LastCoursePersistence courseListPersistence2:courseListPersistences){
			LastCourseView view = new LastCourseView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}
	//查找最新的一条记录
	public static List<LastCourseView> lastCourse2(int userid) {
		List<LastCourseView> courseListViews = new ArrayList<LastCourseView>();
		List<LastCoursePersistence> courseListPersistences = RecordHelp.selectMyCourse2(userid);
		if(courseListPersistences == null){
			return null;
			}
		for(LastCoursePersistence courseListPersistence2:courseListPersistences){
			LastCourseView view = new LastCourseView(courseListPersistence2);
			courseListViews.add(view);
		}
		return courseListViews;
	}

}
