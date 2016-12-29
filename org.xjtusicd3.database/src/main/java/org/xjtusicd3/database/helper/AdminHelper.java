package org.xjtusicd3.database.helper;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.AdminPersistenceMapper;
import org.xjtusicd3.database.mapper.PersistenceAdminMapper;
import org.xjtusicd3.database.model.AdminPersistence;
import org.xjtusicd3.database.model.PersistenceAdmin;



public class AdminHelper {
	public static PersistenceAdmin getAdmin(String adminName) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession();
		PersistenceAdminMapper mapper = session.getMapper(PersistenceAdminMapper.class);
		PersistenceAdmin admin = mapper.selectByName(adminName);
		return admin;
	}
	
	public static void main(String[] args) {
		PersistenceAdmin admin = getAdmin("aa");
		System.out.println(admin.getAdminpassword());
	}

	public static AdminPersistence logincheck(String adminNumber, String adminPassword, int adminYanzhengma) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AdminPersistenceMapper mapper = session.getMapper(AdminPersistenceMapper.class);
		AdminPersistence adminPersistence = mapper.findByNumber(adminNumber);
		session.close();
		if(adminPersistence==null){
			return null;
		}else if(adminPersistence.getAdminPassword().equals(adminPassword)){
			return adminPersistence;
		}
		return null;
	}

	public static AdminPersistence getAdmin(int adminId) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AdminPersistenceMapper mapper = session.getMapper(AdminPersistenceMapper.class);
		AdminPersistence adminPersistence = mapper.getAdmin(adminId);
		session.close();
		return adminPersistence;
	}
	/*
	 * 管理员密码修改
	 */
	public static void update(AdminPersistence adminPersistence){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		AdminPersistenceMapper mapper = session.getMapper(AdminPersistenceMapper.class);
		mapper.update(adminPersistence);
		session.close();
	}
}
