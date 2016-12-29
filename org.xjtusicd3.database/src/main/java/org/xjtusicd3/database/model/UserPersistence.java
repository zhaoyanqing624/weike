package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

@Table(tablename="user")
public class UserPersistence {
	@TableKey(strategy=Strategy.NORMAL)
	@TableField(columnName="userId")
	private int userId;
	@TableField(columnName="userEmail")
	private String userEmail;
	@TableField(columnName="userPassword")
	private String userPassword;
	@TableField(columnName="userName")
	private String userName;
	@TableField(columnName="userImage")
	private String userImage;
	@TableField(columnName="userSex")
	private String userSex;
	@TableField(columnName="userAddress")
	private String userAddress;
	@TableField(columnName="userPhone")
	private String userPhone;
	@TableField(columnName="userAccount")
	private int userAccount;
	@TableField(columnName="userSignature")
	private String userSignature;
	@TableField(columnName="userJob")
	private String userJob;
	@TableField(columnName="userCardImage")
	private String userCardImage;
	@TableField(columnName="userTrueName")
	private String userTrueName;
	@TableField(columnName="userCardNumber")
	private String userCardNumber;
	@TableField(columnName="userTrueJob")
	private String userTrueJob;
	@TableField(columnName="userExperience")
	private String userExperience;
	@TableField(columnName="userState")
	private int userState;
	@TableField(columnName="userRegisterDate")
	private String userRegisterDate;
	@TableField(columnName="userApplicationDate")
	private String userApplicationDate;
	
	
	
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	
	
}
