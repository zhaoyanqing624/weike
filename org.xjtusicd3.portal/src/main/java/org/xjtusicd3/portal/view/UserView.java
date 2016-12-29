package org.xjtusicd3.portal.view;

import org.xjtusicd3.database.model.UserPersistence;

public class UserView {
	private int userId;
	private String userTrueName;
	private String userCardImage;
	private String userPhone;
	private String userEmail;
	private String userTrueJob;
	private String userExperience;
	private String userApplicationDate;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserTrueName() {
		return userTrueName;
	}
	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}
	public String getUserCardImage() {
		return userCardImage;
	}
	public void setUserCardImage(String userCardImage) {
		this.userCardImage = userCardImage;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserTrueJob() {
		return userTrueJob;
	}
	public void setUserTrueJob(String userTrueJob) {
		this.userTrueJob = userTrueJob;
	}
	public String getUserExperience() {
		return userExperience;
	}
	public void setUserExperience(String userExperience) {
		this.userExperience = userExperience;
	}
	
	
	public String getUserApplicationDate() {
		return userApplicationDate;
	}
	public void setUserApplicationDate(String userApplicationDate) {
		this.userApplicationDate = userApplicationDate;
	}
	public UserView(UserPersistence userPersistence){
		this.userId = userPersistence.getUserId();
		this.userTrueName = userPersistence.getUserTrueName();
		this.userCardImage = userPersistence.getUserCardImage();
		this.userPhone = userPersistence.getUserPhone();
		this.userEmail = userPersistence.getUserEmail();
		this.userTrueJob = userPersistence.getUserTrueJob();
		this.userExperience = userPersistence.getUserExperience();
		this.userApplicationDate = userPersistence.getUserApplicationDate();
	}
	public UserView(){
		
	}
	
	
}
