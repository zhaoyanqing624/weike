package org.xjtusicd3.database.helper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.QuestionPersistenceMapper;
import org.xjtusicd3.database.mapper.QuestionportalPersistenceMapper;
import org.xjtusicd3.database.model.QuestionContentPersistence;
import org.xjtusicd3.database.model.QuestionContentPersistence2;
import org.xjtusicd3.database.model.QuestionPersistence;
import org.xjtusicd3.database.model.QuestionportalPersistence;

public class QuestionHelp {
	
	public static void addQuestion(QuestionPersistence questionPersistence){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionPersistenceMapper mapper = session.getMapper(QuestionPersistenceMapper.class);
		mapper.save(questionPersistence);
		session.close();
	}

	public static List<QuestionPersistence> selectQuestion(int questionState) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionPersistenceMapper mapper = session.getMapper(QuestionPersistenceMapper.class);
		List<QuestionPersistence> list = mapper.selectQuestion(questionState);
		session.close();
		return list;
	}
	public static QuestionPersistence selectQuestion2(int questionId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionPersistenceMapper mapper = session.getMapper(QuestionPersistenceMapper.class);
		QuestionPersistence list = mapper.selectQuestion2(questionId);
		session.close();
		return list;
	}
	
	public static List<QuestionContentPersistence> selectQuestionNumber(int questionId){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionPersistenceMapper mapper = session.getMapper(QuestionPersistenceMapper.class);
		List<QuestionContentPersistence> list = mapper.selectAnswerNumber(questionId);
		session.close();
		return list;
	}
	public static List<QuestionContentPersistence2> selectQuestionUser(int questionId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionPersistenceMapper mapper = session.getMapper(QuestionPersistenceMapper.class);
		List<QuestionContentPersistence2> list = mapper.selectQuestionUser(questionId);
		session.close();
		return list;
	}

	public static void updateQuestion(int questionId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionPersistenceMapper mapper = session.getMapper(QuestionPersistenceMapper.class);
		mapper.updateQuestion(questionId);
		session.close();
	}

	public static int selectQuestionBestAnswer(int questionId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionPersistenceMapper mapper = session.getMapper(QuestionPersistenceMapper.class);
		int a =  mapper.selectQuestionBestAnswer(questionId);
		return a;
	}
	/*
	 * 查找问题列表
	 */
	public static List<QuestionportalPersistence> getQuestion() {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionportalPersistenceMapper mapper = session.getMapper(QuestionportalPersistenceMapper.class);
		List<QuestionportalPersistence> list = mapper.getQuestion();
		session.close();
		return list;
	}

	public static void updateQuestion2(int q) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionportalPersistenceMapper mapper = session.getMapper(QuestionportalPersistenceMapper.class);
		mapper.updateQuestion2(q);
		session.close();
	}

	public static List<QuestionPersistence> questionList(String searchName) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionPersistenceMapper mapper = session.getMapper(QuestionPersistenceMapper.class);
		String c1 = "%" + searchName + "%";
		List<QuestionPersistence> list = mapper.questionList(c1);
		session.close();
		return list;
	}

	public static int questionList2(String searchName) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		QuestionPersistenceMapper mapper = session.getMapper(QuestionPersistenceMapper.class);
		String c1 = "%" + searchName + "%";
		int a  = mapper.questionList2(c1);
		session.close();
		return a;
	}

	
	
}
