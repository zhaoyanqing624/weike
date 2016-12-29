package org.xjtusicd3.database.helper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.PersistenceUserMapper;
import org.xjtusicd3.database.mapper.UserPersistenceMapper;
import org.xjtusicd3.database.mapper.UserpersonalPersistenceMapper;
import org.xjtusicd3.database.model.PersistenceUser;
import org.xjtusicd3.database.model.UserPersistence;
import org.xjtusicd3.database.model.UserVisiualPersistence;
import org.xjtusicd3.database.model.UserpersonalPersistence;



public class UserHelper {
	/*
	 * 用户的注册
	 */
	public static void save(UserPersistence userPersistence){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		mapper.save(userPersistence);
		session.close();
	}

	/*
	 * 用户登录
	 */
	public static UserPersistence logincheck(String userEmail,String userPassword){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		UserPersistence userPersistence = mapper.findByEmail(userEmail);
		session.close();
		if(userPersistence == null){
			return null;
		}else if(userPersistence.getUserPassword().equals(userPassword)){
			return userPersistence;
		}else {
			return null;
		}
	}
	/*
	 * 用户信息查询
	 */
	public static UserPersistence getUser(String userEmail){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		UserPersistence userPersistence = mapper.findByEmail(userEmail);
		session.close();
		return userPersistence;
	}
	public static UserPersistence getUser2(int userId){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		UserPersistence userPersistence = mapper.findById(userId);
		session.close();
		return userPersistence;
	}
	public static UserPersistence getUser3(){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		UserPersistence userPersistence = mapper.findById2();
		session.close();
		return userPersistence;
	}
	public static List<UserPersistence> getUser4(int userId){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		List<UserPersistence> list = mapper.findById3(userId);
		session.close();
		return list;
	}
	public static List<UserPersistence> getUser5(){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		List<UserPersistence> list = mapper.findteacher();
		session.close();
		return list;
	}
	public static List<UserPersistence> getUser6(){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		List<UserPersistence> list = mapper.findteacher2();
		session.close();
		return list;
	}
	
	/*
	 * 用户信息的更新
	 */
	public static void update(UserPersistence userPersistence){
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session .getMapper(UserPersistenceMapper.class);
		mapper.update(userPersistence);
		session.close();
	}
	public static void updateUserImage(int userId,String userImage){
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session .getMapper(UserPersistenceMapper.class);
		mapper.updateUserImage(userId, userImage);
		session.close();
	}
	
	public static void updateUserCardImage(int userId,String userCardImage){
		SqlSession session  = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session .getMapper(UserPersistenceMapper.class);
		mapper.updateUserCardImage(userId, userCardImage);
		session.close();
	}
//	public static void update(PersistenceUser puser) throws Exception{
//		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
//		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
//		mapper.update(puser);
//		session.close();
//		
//	}

	@SuppressWarnings("rawtypes")
	public List searchUser() {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		return mapper.searchUser();
	}


	public List<PersistenceUser> searchUser1(String name) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		String name1="%"+name+"%";
		return mapper.searchUser1(name1);
	}

	
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public List<PersistenceUser> blackSearch() {
		List ls;
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		ls=mapper.blackSearch();
		return ls;
	}

	public void defriend(String userId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		mapper.defriend(userId);
	}

	public void userRecover(String userId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		mapper.userRecover(userId);
	}

	public PersistenceUser searchUserById(String userId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		return mapper.searchUserById(userId);
	}

	public void pswAlter(String userId, String psw) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		mapper.pswAlter(userId,psw);
	}

	public static int getCount(String name) {
	
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		 String userName = "%" + name + "%";
		int count =  mapper.selectByNameCount(userName);
		session.close();
		return count;
	}

	public static List<PersistenceUser> getPageList(int i, int pageSize, String name) {
	    
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		String name1="%"+name+"%";
		return mapper.searchUser3(name1,i,pageSize);
	}
	/*
	 * 申请成为老师
	 */
	public static void updateTeacher(int userId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		mapper.updateTeacher(userId);
		session.close();
	}
	public static void updateTeacher2(int userId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistenceUserMapper mapper = session.getMapper(PersistenceUserMapper.class);
		mapper.updateTeacher2(userId);
		session.close();
	}
	
	public static List<UserPersistence> teacher(int b) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		List<UserPersistence> list = mapper.teacher(b);
		session.close();
		return list;
	}

	public static List<UserpersonalPersistence> getlistuser(int u) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserpersonalPersistenceMapper mapper = session.getMapper(UserpersonalPersistenceMapper.class);
		List<UserpersonalPersistence> list = mapper.getlistuser(u);
		session.close();
		return list;
	}

	public static List<UserVisiualPersistence> selectUserVisiual() {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		UserPersistenceMapper mapper = session.getMapper(UserPersistenceMapper.class);
		List<UserVisiualPersistence> list = mapper.selectUserVisiual();
		session.close();
		return list;
	}






	
	

}
