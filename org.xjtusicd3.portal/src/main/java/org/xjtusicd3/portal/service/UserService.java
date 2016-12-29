package org.xjtusicd3.portal.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.UserHelper;
import org.xjtusicd3.database.model.UserPersistence;
import org.xjtusicd3.portal.view.UserView;

public class UserService {
	/*
	 * 查询贷申请的教师
	 */
	public static List<UserView> teacher(){
		List<UserView> userViews = new ArrayList<UserView>();
		List<UserPersistence> userPersistences = UserHelper.getUser5();
		if(userPersistences == null){
			return null;
		}
		for(UserPersistence userPersistence2:userPersistences){
			UserView view = new UserView(userPersistence2);
			userViews.add(view);
		}
		return userViews;
	}
	/*
	 * 查询已经通过申请的教师
	 */
	public static List<UserView> teacher2(){
		List<UserView> userViews = new ArrayList<UserView>();
		List<UserPersistence> userPersistences = UserHelper.getUser6();
		if(userPersistences == null){
			return null;
		}
		for(UserPersistence userPersistence2:userPersistences){
			UserView view = new UserView(userPersistence2);
			userViews.add(view);
		}
		return userViews;
	}
	/*
	 * 申请成为老师
	 */
	public static void updateTeacher(int userId){
		UserHelper.updateTeacher(userId);
	}
	public static void updateTeacher2(int userId){
		UserHelper.updateTeacher2(userId);
	}
}

