package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.ClassifyPersistence;

public interface ClassifyPersistenceMapper extends IBaseDao<ClassifyPersistence,String>{
	@Select("SELECT * FROM classify where classifyLevels=#{level};")
	List<ClassifyPersistence> getFirstLevel(int level);
	
	@Select("select * from classify where classifyParentId=#{classifyId};")
	List<ClassifyPersistence> getNextLevel(int classifyId);
	
	@Select("select * from classify where classifyId=#{classifyId};")
	ClassifyPersistence selectclassifybyid(int classifyId);

}
