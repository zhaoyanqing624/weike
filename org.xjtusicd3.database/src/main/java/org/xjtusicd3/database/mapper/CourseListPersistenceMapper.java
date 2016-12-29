package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.CourseListPersistence;
import org.xjtusicd3.database.model.VideoContentPersistence;

public interface CourseListPersistenceMapper extends IBaseDao<CourseListPersistence, String>{
	/*
	 * 查询课程目录
	 */
	@Select({"SELECT * from course,coursetitle,classify WHERE course.courseTitleId=coursetitle.courseTitleId AND course.classifyId=classify.classifyId AND classify.classifyDuo=#{c} AND course.courseState='1';"})
	public abstract List<CourseListPersistence> selectCourseList(String paramString);
	/*
	 * 查看我的课程
	 */
	@Select({"SELECT * from course,coursetitle,classify WHERE course.courseTitleId=coursetitle.courseTitleId AND course.classifyId=classify.classifyId AND course.userId=#{c} ORDER BY course.courseDate DESC;"})
	public abstract List<CourseListPersistence> selectMyCourse(int paramString);
	@Select({"SELECT * from course,coursetitle,classify WHERE course.courseTitleId=coursetitle.courseTitleId AND course.classifyId=classify.classifyId AND course.userId=#{c} AND course.courseState=0 ORDER BY course.courseDate DESC;"})
	public abstract List<CourseListPersistence> selectMyCourse1(int paramString);
	@Select({"SELECT * from course,coursetitle,classify WHERE course.courseTitleId=coursetitle.courseTitleId AND course.classifyId=classify.classifyId AND course.userId=#{c} AND course.courseState=1 ORDER BY course.courseDate DESC;"})
	public abstract List<CourseListPersistence> selectMyCourse2(int paramString);
	/*
	 * search查询课程目录
	 */
	@Select({"SELECT * from course,coursetitle,classify WHERE course.courseTitleId=coursetitle.courseTitleId AND course.classifyId=classify.classifyId AND coursetitle.courseTitle like #{0};"})
	public abstract List<CourseListPersistence> selectCourseList2(String paramString);
	
	@Select({"SELECT COUNT(courseId) as a from course,coursetitle,classify WHERE course.courseTitleId=coursetitle.courseTitleId AND course.classifyId=classify.classifyId AND coursetitle.courseTitle like #{0};"})
	int selectCourseList3(String paramString);
	/*
	 * 查看课程详情
	 */
	@Select({"SELECT * from course,coursetitle,classify WHERE course.courseTitleId=coursetitle.courseTitleId AND course.classifyId=classify.classifyId AND coursetitle.courseTitleId=#{b};"})
	public abstract List<CourseListPersistence> selectCourse(int paramString);
	/*
	 * 查找出第一层结构
	 */
	@Select({"SELECT classifyName from classify WHERE classifyId=(SELECT classifyParentId from classify WHERE classifyId=(SELECT classifyId FROM course WHERE courseTitleId=#{b}));"})
	public abstract List<CourseListPersistence> selectFirstClassify(int b);
	/*
	 * 查找出子标题以及视频   第二层界面
	 */
//	@Select({"SELECT * FROM coursetitle,video WHERE coursetitle.courseTitleId=video.courseTitleId AND coursetitle.courseTitleParentId=#{b};"})
//	public abstract List<CourseListPersistence>  selectCourseContent(int b);
	@Select({"SELECT * FROM coursetitle,video WHERE coursetitle.courseTitleId=video.courseTitleId AND coursetitle.courseTitleParentId=#{b} GROUP BY coursetitle ORDER BY coursetitle.courseTitleId;"})
	public abstract List<CourseListPersistence> selectSecondTitle(int b);
	@Select({"SELECT * FROM video WHERE courseTitleId=#{b}"})
	public abstract List<VideoContentPersistence> selectVideoContent(int b);
	/*
	 *查找视频的URL  第三层界面
	 */
	@Select({"SELECT * FROM video WHERE videoId=#{b}"})
	public abstract List<VideoContentPersistence> selectVideoURL(int b);
	@Select({"SELECT courseTitle,courseTitleId FROM coursetitle WHERE courseTitleId=(SELECT courseTitleId FROM course WHERE courseId=(SELECT courseId FROM video WHERE videoId=#{b}))"})
	public abstract List<CourseListPersistence> selectVideoName3(int b);
}
	
	

	