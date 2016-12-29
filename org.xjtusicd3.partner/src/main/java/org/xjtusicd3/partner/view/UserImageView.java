package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.UserPersistence;

public class UserImageView {
	private int userId;
	private String userImage;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	
	public UserImageView(UserPersistence userPersistence){
		this.userId = userPersistence.getUserId();
		this.userImage = userPersistence.getUserImage();
	}
	public UserImageView(){
		
	}
}
