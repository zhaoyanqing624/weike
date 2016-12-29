package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.GoodsPersistence;

public interface GoodsPersistenceMapper extends IBaseDao<GoodsPersistence, String>{
	
	@Select("select goodsId from goods where answerId=#{0} and goodsUserId=#{1}")
	Integer selectGoods(int a, int userid);
	
	@Select("INSERT INTO goods(answerId,goodsUserId) VALUES (#{0},#{1})")
	void addGoods(int a, int userid);
	
	
	@Select("delete  from goods where goodsId=#{0}")
	void deleteGoods(int goodsId);
	
	@Select("SELECT *,count(goodsUserId) as goodsNumber from goods WHERE answerId=#{0}")
	List<GoodsPersistence> selectGoodsNumber(int answerId);
	
}
