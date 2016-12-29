package org.xjtusicd3.portal.view;

import org.xjtusicd3.database.model.AnswerportalPersistence;

public class AnswerView {
	private int answerId;
	private String questionTitle;
	private String userName;
	private String answerName;
	private String answerDate;
	private int answerBest;
	
	
	public int getAnswerBest() {
		return answerBest;
	}
	public void setAnswerBest(int answerBest) {
		this.answerBest = answerBest;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
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
	public String getAnswerDate() {
		return answerDate;
	}
	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate;
	}
	
	public AnswerView(AnswerportalPersistence answerportalPersistence){
		this.answerId = answerportalPersistence.getAnswerId();
		this.questionTitle = answerportalPersistence.getQuestionTitle();
		this.userName = answerportalPersistence.getUserName();
		this.answerName = answerportalPersistence.getAnswerName();
		this.answerDate = answerportalPersistence.getAnswerDate();
		this.answerBest = answerportalPersistence.getAnswerBest();
	}
	public AnswerView(){
		
	}
}
