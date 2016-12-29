package org.xjtusicd3.database.mapper;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.AdminPersistence;

public interface AdminPersistenceMapper extends IBaseDao<AdminPersistence, String>{
	@Select("select * from admin where adminNumber=#{adminNumber};")
	AdminPersistence findByNumber(String param1);
	
	@Select("select * from admin where adminId=#{adminId}")
	AdminPersistence getAdmin(int param1);

}
