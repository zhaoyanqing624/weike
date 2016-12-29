package org.xjtusicd3.database.helper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.SearchPersistenceMapper;
import org.xjtusicd3.database.model.SearchPersistence;
import org.xjtusicd3.database.model.SearchVisiualPersistence;

public class SearchHelp {
	/*
	 * 
	 */
	public static void addSearch(SearchPersistence searchPersistence){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		SearchPersistenceMapper mapper = session.getMapper(SearchPersistenceMapper.class);
		mapper.save(searchPersistence);
		session.close();
	}
	
	public static List<SearchPersistence> selectHotSearch(){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		SearchPersistenceMapper mapper = session.getMapper(SearchPersistenceMapper.class);
		List<SearchPersistence> searchPersistences = mapper.selectHotSearch();
		session.close();
		return searchPersistences;
	}

	public static List<SearchVisiualPersistence> selectHotSearch2() {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		SearchPersistenceMapper mapper = session.getMapper(SearchPersistenceMapper.class);
		List<SearchVisiualPersistence> searchVisiualPersistences = mapper.selectHotSearch2();
		session.close();
		return searchVisiualPersistences;
	}
}
