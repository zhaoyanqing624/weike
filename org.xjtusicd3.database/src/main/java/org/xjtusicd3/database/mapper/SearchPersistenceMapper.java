package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.SearchPersistence;
import org.xjtusicd3.database.model.SearchVisiualPersistence;

public interface SearchPersistenceMapper extends IBaseDao<SearchPersistence, String>{
	/*
	 * 热门搜索标签
	 */
	@Select({"SELECT searchName,count(searchName) as number from search GROUP BY searchName ORDER BY number DESC LIMIT 8"})
	public List<SearchPersistence> selectHotSearch();
	
	
	/*
	 * 搜索虚拟化
	 */
	@Select("SELECT searchName,count(searchName) as counts_searchName from search GROUP BY searchName ORDER BY counts_searchName DESC LIMIT 10")
	public List<SearchVisiualPersistence> selectHotSearch2();
}
