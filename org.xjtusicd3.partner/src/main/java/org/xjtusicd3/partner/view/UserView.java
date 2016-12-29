package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.UserPersistence;

public class UserView {
	private int userId;
	private String userEmail;
	private String userPassword;
	private String userPassword2;
	private String userPassword3;
	private String userImage;
	private String userSex;
	private String userAddress;
	private String userPhone;
	private int userAccount;
	private String userRegisterDate;
	private String userApplicationDate;
	private String userSignature;
	private String userJob;
	private String userName;
	private String userCardImage;	
	private String userTrueName;
	private String userCardNumber;
	private String userTrueJob;
	private String userExperience;
	private int userState;
	
	
	
	
	public String getUserApplicationDate() {
		return userApplicationDate;
	}
	public void setUserApplicationDate(String userApplicationDate) {
		this.userApplicationDate = userApplicationDate;
	}
	public String getUserRegisterDate() {
		return userRegisterDate;
	}
	public void setUserRegisterDate(String userRegisterDate) {
		this.userRegisterDate = userRegisterDate;
	}
	public String getUserCardImage() {
		return userCardImage;
	}
	public void setUserCardImage(String userCardImage) {
		this.userCardImage = userCardImage;
	}
	public String getUserTrueName() {
		return userTrueName;
	}
	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}
	public String getUserCardNumber() {
		return userCardNumber;
	}
	public void setUserCardNumber(String userCardNumber) {
		this.userCardNumber = userCardNumber;
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
	public int getUserState() {
		return userState;
	}
	public void setUserState(int userState) {
		this.userState = userState;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public int getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(int userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserSignature() {
		return userSignature;
	}
	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}
	public String getUserJob() {
		return userJob;
	}
	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword2() {
		return userPassword2;
	}
	public void setUserPassword2(String userPassword2) {
		this.userPassword2 = userPassword2;
	}
	public String getUserPassword3() {
		return userPassword3;
	}
	public void setUserPassword3(String userPassword3) {
		this.userPassword3 = userPassword3;
	}
	
	
	public UserView(UserPersistence userPersistence){
		this.userId = userPersistence.getUserId();
		this.userEmail = userPersistence.getUserEmail();
		this.userPassword = userPersistence.getUserPassword();
		this.userName = userPersistence.getUserName();
		this.userImage = userPersistence.getUserImage();
		this.userSex = userPersistence.getUserSex();
		this.userAddress = userPersistence.getUserAddress();
		this.userPhone = userPersistence.getUserPhone();
		this.userAccount = userPersistence.getUserAccount();
		this.userSignature = userPersistence.getUserSignature();
		this.userJob = userPersistence.getUserJob();
		this.userCardImage = userPersistence.getUserCardImage();
		this.userTrueName = userPersistence.getUserTrueName();
		this.userCardNumber = userPersistence.getUserCardNumber();
		this.userTrueJob = userPersistence.getUserTrueJob();
		this.userExperience = userPersistence.getUserExperience();
		this.userState = userPersistence.getUserState();
		this.userRegisterDate = userPersistence.getUserRegisterDate();
		this.userApplicationDate = userPersistence.getUserApplicationDate();

	}
	
	public UserView(){
		
	}
}

