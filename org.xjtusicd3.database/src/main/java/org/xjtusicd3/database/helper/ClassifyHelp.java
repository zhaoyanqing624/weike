package org.xjtusicd3.database.helper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.ClassifyPersistenceMapper;
import org.xjtusicd3.database.model.ClassifyPersistence;

public class ClassifyHelp {
	/*
	 * 得到第一层分类
	 */
	public static List<ClassifyPersistence> getFirstLevel(int level) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		ClassifyPersistenceMapper mapper = session.getMapper(ClassifyPersistenceMapper.class);
	
		List<ClassifyPersistence> list = mapper.getFirstLevel(level);
		session.close();
		return list;
	}
	/*
	 * 得到第二层分类
	 */
	public static List<ClassifyPersistence> getNextLevel(int classifyId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		ClassifyPersistenceMapper mapper = session.getMapper(ClassifyPersistenceMapper.class);
	
		List<ClassifyPersistence> list = mapper.getNextLevel(classifyId);
		session.close();
		return list;
	}
	/*
	 * 
	 */
	public static  ClassifyPersistence selectClassifyById(int b){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		ClassifyPersistenceMapper mapper = session.getMapper(ClassifyPersistenceMapper.class);
		ClassifyPersistence classifyPersistence = mapper.selectclassifybyid(b);
		session.close();
		return classifyPersistence;
	}
}
