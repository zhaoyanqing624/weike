package org.xjtusicd3.database.helper;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.VideoPersistenceMapper;
import org.xjtusicd3.database.model.VideoPersistence;

public class VideoHelper {
	/*
	 * 添加视频信息
	 */
	public static void addVideo(VideoPersistence videoPersistence){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		VideoPersistenceMapper mapper = session.getMapper(VideoPersistenceMapper.class);
		mapper.save(videoPersistence);
		session.close();
	}
	public static void addVideo1(int courseId,int courseTitleId,String videoName){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		VideoPersistenceMapper mapper = session.getMapper(VideoPersistenceMapper.class);
		mapper.addVideo(courseId, courseTitleId, videoName);
		session.close();
	}
	
	/*
	 * 视频上传
	 */
	public static void updateVideo(int videoId,String videoURL){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		VideoPersistenceMapper mapper = session.getMapper(VideoPersistenceMapper.class);
		mapper.updateVideo(videoId,videoURL);
		session.close();
	}
	public static void updateVideo2(int videoId,double videoTime,long videoSize){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		VideoPersistenceMapper mapper = session.getMapper(VideoPersistenceMapper.class);
		mapper.updateVideo2(videoId,videoTime,videoSize);
		session.close();
	}

	/*
	 * 视频查找
	 */
	public static VideoPersistence selectvideo(String videoName){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		VideoPersistenceMapper mapper = session.getMapper(VideoPersistenceMapper.class);
		VideoPersistence videoPersistence =mapper.selectvideo(videoName);
		session.close();
		return videoPersistence;
	}
	/*
	 * 查找一个课程的总时间
	 */
	public static double selectTotalVideoTime(int courseId){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		VideoPersistenceMapper mapper = session.getMapper(VideoPersistenceMapper.class);
		double totalTime = mapper.selectTotalVideoTime(courseId);
		session.close();
		return totalTime;
	}
	public static int selectCourseId(int videoId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		VideoPersistenceMapper mapper = session.getMapper(VideoPersistenceMapper.class);
		int a = mapper.selectCourseId(videoId);
		session.close();
		return a;
	}
	public static String selectVideoName(int videoId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		VideoPersistenceMapper mapper = session.getMapper(VideoPersistenceMapper.class);
		String a = mapper.selectVideoName(videoId);
		session.close();
		return a;
	}
}
