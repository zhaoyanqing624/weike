package org.xjtusicd3.portal.service;

import org.xjtusicd3.database.helper.AdminHelper;
import org.xjtusicd3.database.helper.UserHelper;
import org.xjtusicd3.database.model.AdminPersistence;
import org.xjtusicd3.database.model.UserPersistence;
import org.xjtusicd3.portal.view.AdminView;

public class AdminService {
	public static AdminView check(AdminView adminView){
		AdminPersistence adminPersistence = AdminHelper.logincheck(adminView.getAdminNumber(),adminView.getAdminPassword(),adminView.getAdminYanzhengma());
		if(adminPersistence==null){
			return null;
		}
		AdminView adminView2 = new AdminView(adminPersistence);
		return adminView2;
	}

	public static AdminView check(int adminId) {
		AdminPersistence adminPersistence = AdminHelper.getAdmin(adminId);
		if(adminPersistence==null){
			return null;
		}
		AdminView adminView = new AdminView(adminPersistence);
		return adminView;
	}
	/*
	 * 密码修改
	 */
	public static void update(AdminView adminView){
		AdminPersistence adminPersistence = convert(adminView);
		AdminHelper.update(adminPersistence);
	}
	private static AdminPersistence convert(AdminView adminView){
		AdminPersistence adminPersistence = new AdminPersistence();
		adminPersistence.setAdminId(adminView.getAdminId());
		adminPersistence.setAdminNumber(adminView.getAdminNumber());
		adminPersistence.setAdminPassword(adminView.getAdminPassword());
		adminPersistence.setAdminYanzhengma(adminView.getAdminYanzhengma());
		return adminPersistence;
		
	}
}
