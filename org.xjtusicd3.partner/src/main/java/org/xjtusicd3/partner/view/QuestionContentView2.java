package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.QuestionContentPersistence2;

public class QuestionContentView2 {
	private int userId;
	private String userName;
	private String answerName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	
	public QuestionContentView2(QuestionContentPersistence2 questionContentPersistence2){
		this.userId = questionContentPersistence2.getUserId();
		this.userName = questionContentPersistence2.getUserName();
		this.answerName = questionContentPersistence2.getAnswerName();
	}
	public QuestionContentView2(){
		
	}
}
