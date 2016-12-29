package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.UserPersistence;
import org.xjtusicd3.database.model.UserVisiualPersistence;

public interface UserPersistenceMapper extends IBaseDao<UserPersistence, String>{
	@Select("select * from user where userEmail=#{userEmail};")
	UserPersistence findByEmail(String userEmail);
	@Select("select * from user where userId=#{userId};")
	UserPersistence findById(int userId);
	@Select("select * from user;")
	UserPersistence findById2();
	@Select("select * from user where userId=#{0};")
	List<UserPersistence> findById3(int paramString);
	@Select("UPDATE user SET userImage=#{1} WHERE userId=#{0};")
	UserPersistence updateUserImage(int param2,String param1);
	
	
	@Select("UPDATE user SET userCardImage=#{1} WHERE userId=#{0};")
	UserPersistence updateUserCardImage(int param2,String param1);
	/*
	 * 查找贷申请的老师
	 */
	@Select("select * from user where userState='1' order by userApplicationDate")
	List<UserPersistence> findteacher();
	/*
	 * 查找已通过申请的老师
	 */
	@Select("select * from user where userState='2' order by userApplicationDate")
	List<UserPersistence> findteacher2();
	
	@Select("SELECT * from user,course WHERE course.userId=user.userId AND course.courseTitleId=#{0}")
	List<UserPersistence> teacher(int b);
	
	@Select("SELECT * from user WHERE userId=#{0}")
	List<UserPersistence> getlistuser(int u);
	
	@Select("SELECT  userJob,COUNT(userJob) as counts_userJob from user GROUP BY userJob ORDER BY counts_userJob DESC LIMIT 10")
	List<UserVisiualPersistence> selectUserVisiual();
}
