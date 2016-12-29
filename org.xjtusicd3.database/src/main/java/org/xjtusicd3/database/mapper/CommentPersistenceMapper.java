package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.CommentPersistence;

public interface CommentPersistenceMapper extends IBaseDao<CommentPersistence, String>{
	
	@Select("select * from comment where videoId=#{0} order by commentDate DESC")
	List<CommentPersistence> selectComment(int videoid);

}
