package org.xjtusicd3.database.mapper;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.RecordPersistence;

public interface RecordPersistenceMapper extends IBaseDao<RecordPersistence, String>{
	@Select("select * from record where userId=#{0} AND courseId=#{1}")
	RecordPersistence  selectRecord(int param1, int param2);
	
	@Select("select recordId from record where userId=#{0} AND courseId=#{1}")
	int selectRecord2(int param1, int param2);
	
	@Select("select videoId from record where userId=#{0} AND courseId=#{1}")
	int selectRecord3(int param1, int param2);
	
	@Select("update record set videoId=#{1},recordDate=#{2} where recordId=#{0}")
	RecordPersistence updateRecord(int param1, int param2, String param3);

	
}
