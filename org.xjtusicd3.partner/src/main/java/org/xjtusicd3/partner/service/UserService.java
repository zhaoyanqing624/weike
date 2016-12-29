package org.xjtusicd3.partner.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.xjtusicd3.database.helper.UserHelper;
import org.xjtusicd3.database.model.UserPersistence;
import org.xjtusicd3.database.model.UserpersonalPersistence;
import org.xjtusicd3.partner.view.UserView;
import org.xjtusicd3.partner.view.UserpersonalView;


public class UserService {

	/*
	 * 用户注册
	 */
	public static void save(UserView users) throws Exception{
		UserPersistence userPersistence = new UserPersistence();
		userPersistence.setUserId(users.getUserId());
		userPersistence.setUserEmail(users.getUserEmail());
		userPersistence.setUserPassword(users.getUserPassword());
		userPersistence.setUserPhone("");
		userPersistence.setUserAddress("");
		userPersistence.setUserSignature("");
		userPersistence.setUserImage("/org.xjtusicd3.partner/static/image/duo.png");
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		//int hour = calendar.get(Calendar.HOUR); 获得小时
		//int minute = calendar.get(Calendar.MINUTE); 获得分钟
		//int second = calendar.get(Calendar.SECOND); 获得秒
		Random random = new Random();
		int number = random.nextInt(999999);
		userPersistence.setUserName("游客"+year+month+day+number);
		userPersistence.setUserSex("0");
		userPersistence.setUserAccount(0);
		userPersistence.setUserJob("");
		userPersistence.setUserCardImage("/org.xjtusicd3.partner/static/image/card.png");
		userPersistence.setUserState(0);
		userPersistence.setUserTrueName("");
		userPersistence.setUserCardNumber("");
		userPersistence.setUserTrueJob("");
		userPersistence.setUserExperience("");
		long l = System.currentTimeMillis();
		Date date = new Date(l);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		userPersistence.setUserRegisterDate(dateFormat.format(date));
		userPersistence.setUserApplicationDate("0");
		
		UserHelper.save(userPersistence);
	}
	/*
	 * 用户登录
	 */
	public static UserView check(UserView user) throws Exception{
		UserPersistence userPersistence = UserHelper.logincheck(user.getUserEmail(), user.getUserPassword());
		if(userPersistence==null){
			return null;
		}
		UserView userView = new UserView(userPersistence);
		return userView;
		
	}
	public static UserView check2(int userId){
		UserPersistence userPersistence = UserHelper.getUser2(userId);
		if(userPersistence==null){
			return null;
		}
		UserView userView = new UserView(userPersistence);
		return userView;
	}
	public static UserView check3(){
		UserPersistence userPersistence = UserHelper.getUser3();
		if(userPersistence==null){
			return null;
		}
		UserView userView = new UserView(userPersistence);
		return userView;
	}

	/*
	 * 用户信息修改
	 */

	public static void update(UserView userView){
		UserPersistence userPersistence = convert(userView);
		UserHelper.update(userPersistence);
	}
	private static UserPersistence convert(UserView userView){
		UserPersistence userPersistence = new UserPersistence();
		userPersistence.setUserId(userView.getUserId());
		userPersistence.setUserName(userView.getUserName());
		userPersistence.setUserPassword(userView.getUserPassword());
		userPersistence.setUserImage(userView.getUserImage());
		userPersistence.setUserSex(userView.getUserSex());
		userPersistence.setUserAddress(userView.getUserAddress());
		userPersistence.setUserPhone(userView.getUserPhone());
		userPersistence.setUserSignature(userView.getUserSignature());
		userPersistence.setUserJob(userView.getUserJob());
		userPersistence.setUserEmail(userView.getUserEmail());
		userPersistence.setUserCardImage(userView.getUserCardImage());
		userPersistence.setUserTrueName(userView.getUserTrueName());
		userPersistence.setUserCardNumber(userView.getUserCardNumber());
		userPersistence.setUserTrueJob(userView.getUserTrueJob());
		userPersistence.setUserExperience(userView.getUserExperience());
		userPersistence.setUserState(1);
		userPersistence.setUserRegisterDate(userView.getUserRegisterDate());
		userPersistence.setUserApplicationDate(userView.getUserApplicationDate());

		return userPersistence;
		
	}
	
	public static void updateUserImage(int userId,String userImage){
		UserHelper.updateUserImage(userId, userImage);
	}
	public static void updateUserCardImage(int userId,String userCardImage){
		UserHelper.updateUserCardImage(userId, userCardImage);
	}
	public static List<UserpersonalView> listuser(int u) {
		List<UserpersonalView> userpersonalViews = new ArrayList<UserpersonalView>();
		List<UserpersonalPersistence> userpersonalPersistences = UserHelper.getlistuser(u);
		if(userpersonalPersistences==null){
			return null;
		}
		for(UserpersonalPersistence userpersonalPersistence2:userpersonalPersistences){
			UserpersonalView view = new UserpersonalView(userpersonalPersistence2);
			userpersonalViews.add(view);
		}
		return userpersonalViews;
	}


	

	
	
//	public static void update(ViewUser user) throws Exception{
//		PersistenceUser persistenceUser = convert(user);
//		UserHelper.update(persistenceUser);
//	}
//	private static PersistenceUser convert(ViewUser user){
//		PersistenceUser persistenceUser = new PersistenceUser();
//		persistenceUser.setPassword(user.getPassword());
//		persistenceUser.setEmail(user.getEmail());
//		persistenceUser.setPhone(user.getPhone());
//		return persistenceUser;
//		
//	}	

	/*
	 * �û��ĵ�¼
	 */
//	public static void apply(ViewUser user,String email) throws Exception{
//		PersistenceUser persistenceUser = UserHelper.getUser(email);
//		persistenceUser.setEmail(user.getEmail());
//		persistenceUser.setPassword(user.getPassword());
//		persistenceUser.setPhone(user.getPhone());
//		persistenceUser.setUsername(user.getUsername());
//		UserHelper.update(persistenceUser);
//	}
//	

}
