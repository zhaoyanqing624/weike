package org.xjtusicd3.portal.view;

import org.xjtusicd3.database.model.QuestionportalPersistence;

public class QuestionView {
	private int questionId;
	private String userName;
	private String classifyName;
	private String questionDate;
	private String questionTitle;
	private String questionText;
	private int questionBestAnswer;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getClassifyName() {
		return classifyName;
	}
	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}
	public String getQuestionDate() {
		return questionDate;
	}
	public void setQuestionDate(String questionDate) {
		this.questionDate = questionDate;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public int getQuestionBestAnswer() {
		return questionBestAnswer;
	}
	public void setQuestionBestAnswer(int questionBestAnswer) {
		this.questionBestAnswer = questionBestAnswer;
	}
	
	public QuestionView(QuestionportalPersistence questionportalPersistence){
		this.questionId = questionportalPersistence.getQuestionId();
		this.userName = questionportalPersistence.getUserName();
		this.classifyName = questionportalPersistence.getClassifyName();
		this.questionDate = questionportalPersistence.getQuestionDate();
		this.questionTitle = questionportalPersistence.getQuestionTitle();
		this.questionText = questionportalPersistence.getQuestionText();
		this.questionBestAnswer = questionportalPersistence.getQuestionBestAnswer();
	}
	public QuestionView(){
	}
}
