package org.xjtusicd3.database.helper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.CommentPersistenceMapper;
import org.xjtusicd3.database.model.CommentPersistence;

public class CommentHelper {
	public static void addComment(CommentPersistence commentPersistence){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CommentPersistenceMapper mapper = session.getMapper(CommentPersistenceMapper.class);
		mapper.save(commentPersistence);
		session.close();
	}

	public static List<CommentPersistence> selectComment(int videoid) {
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		CommentPersistenceMapper mapper = session.getMapper(CommentPersistenceMapper.class);
		List<CommentPersistence> list = mapper.selectComment(videoid);
		session.close();
		return list;
	}
}
