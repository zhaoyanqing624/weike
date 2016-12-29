package org.xjtusicd3.portal.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.CourseListHelper;
import org.xjtusicd3.database.model.CourseportalPersistence;
import org.xjtusicd3.portal.view.CourseView;

public class CourseService {
	/*
	 * 查询待批准的课程
	 */
	public static List<CourseView> course() {
		List<CourseView> courseViews = new ArrayList<CourseView>();
		List<CourseportalPersistence> courseportalPersistences = CourseListHelper.getCourse();
		if(courseportalPersistences==null){
			return null;
		}
		for(CourseportalPersistence courseportalPersistence2:courseportalPersistences){
			CourseView view = new CourseView(courseportalPersistence2);
			courseViews.add(view);
		}
		return courseViews;
	}
	public static List<CourseView> course2() {
		List<CourseView> courseViews = new ArrayList<CourseView>();
		List<CourseportalPersistence> courseportalPersistences = CourseListHelper.getCourse2();
		if(courseportalPersistences==null){
			return null;
		}
		for(CourseportalPersistence courseportalPersistence2:courseportalPersistences){
			CourseView view = new CourseView(courseportalPersistence2);
			courseViews.add(view);
		}
		return courseViews;
	}
	public static void updateCourse(int c) {
		CourseListHelper.updateCourse(c);
	}
	public static void updateCourse2(int c) {
		CourseListHelper.updateCourse2(c);
	}

}
