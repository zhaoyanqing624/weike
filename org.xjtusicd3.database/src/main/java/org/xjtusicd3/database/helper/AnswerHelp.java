package org.xjtusicd3.database.helper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.AnswerPersistenceMapper;
import org.xjtusicd3.database.mapper.AnswerportalPersistenceMapper;
import org.xjtusicd3.database.mapper.GoodsPersistenceMapper;
import org.xjtusicd3.database.model.AnswerPersistence;
import org.xjtusicd3.database.model.AnswerportalPersistence;
import org.xjtusicd3.database.model.GoodsPersistence;

public class AnswerHelp {

	public static void addAnswer(AnswerPersistence answerPersistence) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		mapper.save(answerPersistence);
		session.close();
	}

	public static List<AnswerPersistence> selectAnswer(int questionId) {
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		List<AnswerPersistence> list = mapper.selectAnswer(questionId);
		session.close();
		return list;
	}

	public static int selectAnswerNumber(int questionId) {
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		int a = mapper.selectAnswerNumber(questionId);
		return a;
	}

	public static void updateAnswer(int a) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		mapper.updateAnswer(a);
		session.close();
	}

	public static List<AnswerPersistence> selectBestAnswer(int i) {
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		List<AnswerPersistence> list = mapper.selectBestAnswer(i);
		session.close();
		return list;
	}

	public static int selectBestAnswer2(int i) {
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		int a = mapper.selectBestAnswer2(i);
		return a;
	}

	public static List<AnswerPersistence> selectOtherAnswer(int questionId) {
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		List<AnswerPersistence> list = mapper.selectOtherAnswer(questionId);
		session.close();
		return list;
	}

	public static int selectAnswerId(int q) {
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		int a = mapper.selectAnswerId(q);
		return a;
	}

	public static List<AnswerportalPersistence> getAnswer(int questionId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerportalPersistenceMapper mapper = session.getMapper(AnswerportalPersistenceMapper.class);
		List<AnswerportalPersistence> list = mapper.getAnswer(questionId);
		session.close();
		return list;
	}


	public static void updateAnswer2(int a) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		mapper.updateAnswer2(a);
		session.close();
	}

	public static Integer selectGoods(int a, int userid) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		GoodsPersistenceMapper mapper = session.getMapper(GoodsPersistenceMapper.class);
		Integer b = mapper.selectGoods(a,userid);
		return b;
	}

	public static void addGoods(int a, int userid) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		GoodsPersistenceMapper mapper = session.getMapper(GoodsPersistenceMapper.class);
		mapper.addGoods(a,userid);
	}

	public static void deleteGoods(int goodsId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		GoodsPersistenceMapper mapper = session.getMapper(GoodsPersistenceMapper.class);
		mapper.deleteGoods(goodsId);
	}

	public static int selectAnswer2(int a) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AnswerPersistenceMapper mapper = session.getMapper(AnswerPersistenceMapper.class);
		int b = mapper.selectAnswer2(a);
		return b;
	}

	public static List<GoodsPersistence> selectGoodsNumber(int answerId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		GoodsPersistenceMapper mapper = session.getMapper(GoodsPersistenceMapper.class);
		List<GoodsPersistence> list = mapper.selectGoodsNumber(answerId);
		return list;
	}


}
