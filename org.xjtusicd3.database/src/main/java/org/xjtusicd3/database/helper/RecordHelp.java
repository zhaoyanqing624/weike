package org.xjtusicd3.database.helper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.LastCoursePersistenceMapper;
import org.xjtusicd3.database.mapper.RecordPersistenceMapper;
import org.xjtusicd3.database.model.LastCoursePersistence;
import org.xjtusicd3.database.model.RecordPersistence;

public class RecordHelp {

	public static void addRecord(RecordPersistence recordPersistence) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		RecordPersistenceMapper mapper = session.getMapper(RecordPersistenceMapper.class);
		mapper.save(recordPersistence);
		session.close();
	}

	public static RecordPersistence selectRecord(int userId, int courseId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		RecordPersistenceMapper mapper = session.getMapper(RecordPersistenceMapper.class);
		RecordPersistence recordPersistence = mapper.selectRecord(userId,courseId);
		session.close();
		return recordPersistence;
	}

	public static int selectRecord2(int userId, int courseId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		RecordPersistenceMapper mapper = session.getMapper(RecordPersistenceMapper.class);
		int a = mapper.selectRecord2(userId,courseId);
		return a;
		
	}
	public static int selectRecord3(int userId, int courseId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		RecordPersistenceMapper mapper = session.getMapper(RecordPersistenceMapper.class);
		int a = mapper.selectRecord3(userId,courseId);
		return a;
		
	}

	public static void updateRecord(int recordId, int c, String recordDate) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		RecordPersistenceMapper mapper = session.getMapper(RecordPersistenceMapper.class);
		RecordPersistence recordPersistence = mapper.updateRecord(recordId,c,recordDate);
		session.close();
	}
	/*
	 * 查询学习记录
	 */

	public static List<LastCoursePersistence> selectMyCourse(int userid) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		LastCoursePersistenceMapper mapper = session.getMapper(LastCoursePersistenceMapper.class);
		List<LastCoursePersistence> list = mapper.selectLastCourse(userid);
		session.close();
		return list;
	}
	public static List<LastCoursePersistence> selectMyCourse2(int userid) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		LastCoursePersistenceMapper mapper = session.getMapper(LastCoursePersistenceMapper.class);
		List<LastCoursePersistence> list = mapper.selectLastCourse2(userid);
		session.close();
		return list;
	}
	
}
