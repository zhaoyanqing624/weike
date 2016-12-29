package org.xjtusicd3.database.helper;

import java.util.List;

import javax.swing.text.StyledEditorKit.StyledTextAction;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.CourseAddPersistenceMapper;
import org.xjtusicd3.database.mapper.CourseListPersistenceMapper;
import org.xjtusicd3.database.mapper.CourseTitleAddPersistenceMapper;
import org.xjtusicd3.database.mapper.CourseportalPersistenceMapper;
import org.xjtusicd3.database.mapper.UserPersistenceMapper;
import org.xjtusicd3.database.model.CourseAddPersistence;
import org.xjtusicd3.database.model.CourseListPersistence;
import org.xjtusicd3.database.model.CourseTitleAddPersistence;
import org.xjtusicd3.database.model.CourseportalPersistence;
import org.xjtusicd3.database.model.UserPersistence;
import org.xjtusicd3.database.model.VideoContentPersistence;

public class CourseListHelper {
	/*
	 * 查看课程列表
	 */
	public static List<CourseListPersistence> selectCourseList(String c){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<CourseListPersistence> list = mapper.selectCourseList(c);
		session.close();
		return list;
		
	}
	/*
	 * 查看我的课程
	 */
	public static List<CourseListPersistence> selectMyCourse(int userId){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<CourseListPersistence> list = mapper.selectMyCourse(userId);
		session.close();
		return list;
		
	}
	public static List<CourseListPersistence> selectMyCourse1(int userId){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<CourseListPersistence> list = mapper.selectMyCourse1(userId);
		session.close();
		return list;
		
	}
	public static List<CourseListPersistence> selectMyCourse2(int userId){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<CourseListPersistence> list = mapper.selectMyCourse2(userId);
		session.close();
		return list;
		
	}
	/*
	 * search-查看课程列表
	 */
	public static List<CourseListPersistence> selectCourseList2(String c){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		String c1 = "%" + c + "%";
		List<CourseListPersistence> list = mapper.selectCourseList2(c1);
		session.close();
		return list;
		
	}
	public static int selectCourseList3(String c){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		String c1 = "%" + c + "%";
		int a = mapper.selectCourseList3(c1);
		session.close();
		return a;
		
	}
	/*
	 * 查看课程详情页面
	 */
	public static List<CourseListPersistence> selectCourse(int b){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<CourseListPersistence> list = mapper.selectCourse(b);
		session.close();
		return list;
	}
	/*
	 * 获取第一层分类信息
	 */
	public static List<CourseListPersistence> selectFirstClassify(int b){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<CourseListPersistence> list = mapper.selectFirstClassify(b);
		session.close();
		return list;
	}
	/*
	 * 查找出子标题以及视频  第二层
	 */
	public static List<CourseListPersistence> selectSecondTitle(int b){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<CourseListPersistence> list = mapper.selectSecondTitle(b);
		session.close();
		return list;
	}
	public static List<VideoContentPersistence> selectVideoContent(int b){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<VideoContentPersistence> list = mapper.selectVideoContent(b);
		session.close();
		return list;
	}
	/*
	 * 查找视频的URL 第三层
	 */
	public static List<VideoContentPersistence> selectVideoURL(int b){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<VideoContentPersistence> list = mapper.selectVideoURL(b);
		session.close();
		return list;
	}
	public static List<CourseListPersistence> selectVideoName3(int b){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseListPersistenceMapper mapper = session.getMapper(CourseListPersistenceMapper.class);
		List<CourseListPersistence> list = mapper.selectVideoName3(b);
		session.close();
		return list;
	}
	/*
	 * 添加课程的题目
	 */
	public static void addCourseTitle(CourseTitleAddPersistence courseListPersistence){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseTitleAddPersistenceMapper mapper = session.getMapper(CourseTitleAddPersistenceMapper.class);
		mapper.save(courseListPersistence);
		session.close();
	}
	/*
	 * 查询课程的题目
	 */
	public static CourseTitleAddPersistence selectCourseTitle(int b){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseTitleAddPersistenceMapper mapper = session.getMapper(CourseTitleAddPersistenceMapper.class);
		CourseTitleAddPersistence courseTitleAddPersistence = mapper.selectCourseTitle(b);
		session.close();
		return courseTitleAddPersistence;
	}
	/*
	 * 添加页面详细信息
	 */
	public static CourseTitleAddPersistence selectCourseTitle2(String coursetitle){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseTitleAddPersistenceMapper mapper = session.getMapper(CourseTitleAddPersistenceMapper.class);
		CourseTitleAddPersistence courseAddPersistence = mapper.selectCourseTitle2(coursetitle);
		session.close();
		return courseAddPersistence;
	}
	public static CourseAddPersistence selectCourseTitle3(String coursetitle){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseAddPersistenceMapper mapper = session.getMapper(CourseAddPersistenceMapper.class);
		CourseAddPersistence courseAddPersistence = mapper.selectCourseTitle3(coursetitle);
		session.close();
		return courseAddPersistence;
	}
	
	public static void CourseAdd(CourseAddPersistence userPersistence){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseAddPersistenceMapper mapper = session.getMapper(CourseAddPersistenceMapper.class);
		mapper.save(userPersistence);
		session.close();
	}
	/*
	 * 上传课程的缩略图
	 */
	public static void updateCourseImage(int courseId,String courseImage){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseAddPersistenceMapper mapper = session.getMapper(CourseAddPersistenceMapper.class);
		mapper.updateCourseImage(courseId, courseImage);
		session.close();
	}
	public static void updateCourseTime(int courseId,double courseTime){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseAddPersistenceMapper mapper = session.getMapper(CourseAddPersistenceMapper.class);
		mapper.updateCourseTime(courseId, courseTime);
		session.close();
	}
	/*
	 * 查找课程图片
	 */
	public static CourseAddPersistence selectCourseImage(int courseTitleId){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseAddPersistenceMapper mapper = session.getMapper(CourseAddPersistenceMapper.class);
		CourseAddPersistence courseAddPersistence = mapper.selectCourseImage(courseTitleId);
		session.close();
		return courseAddPersistence;
	}
	/*
	 * ajax查看章节题目
	 */
	public static List<CourseTitleAddPersistence> getFirstTitle(int b){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseTitleAddPersistenceMapper mapper = session.getMapper(CourseTitleAddPersistenceMapper.class);
		List<CourseTitleAddPersistence> list = mapper.getFirstTitle(b);
		session.close();
		return list;
	}
	/*
	 * 添加课程的章节题目
	 */
	public static void addcourseTitle2(CourseTitleAddPersistence courseTitleAddPersistence){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseTitleAddPersistenceMapper mapper = session.getMapper(CourseTitleAddPersistenceMapper.class);
		mapper.save(courseTitleAddPersistence);
		session.close();
	}
	public static void updateCourse(int courseTitleId, String courseShortIntroduce, String courseIntroduce,
			String courseNeedkonw, String courseWilllearn) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseAddPersistenceMapper mapper = session.getMapper(CourseAddPersistenceMapper.class);
		mapper.updateCourse(courseTitleId, courseShortIntroduce,courseIntroduce,courseNeedkonw,courseWilllearn);
		session.close();
	}
	public static List<CourseportalPersistence> getCourse() {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseportalPersistenceMapper mapper = session.getMapper(CourseportalPersistenceMapper.class);
		List<CourseportalPersistence> list = mapper.getCourse();
		session.close();
		return list;
	}
	public static List<CourseportalPersistence> getCourse2() {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseportalPersistenceMapper mapper = session.getMapper(CourseportalPersistenceMapper.class);
		List<CourseportalPersistence> list = mapper.getCourse2();
		session.close();
		return list;
	}
	public static void updateCourse(int c) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseportalPersistenceMapper mapper = session.getMapper(CourseportalPersistenceMapper.class);
		mapper.updateCourse(c);
		session.close();
	}
	public static void updateCourse2(int c) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CourseportalPersistenceMapper mapper = session.getMapper(CourseportalPersistenceMapper.class);
		mapper.updateCourse2(c);
		session.close();
	}

}	
