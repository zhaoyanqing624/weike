package org.xjtusicd3.partner.view;

import java.util.List;

import org.xjtusicd3.database.model.QuestionPersistence;

public class QuestionView {
	private int questionId;
	private int userId;
	private int classifyId;
	private int questionState;
	private String questionDate;
	private String questionText;
	private String questionTitle;
	private int questionBestAnswer;
	private List<QuestionContentView> questionNumberContent;
	private List<QuestionContentView2> questionUserContent;
	
	
	
	

	public List<QuestionContentView2> getQuestionUserContent() {
		return questionUserContent;
	}
	public void setQuestionUserContent(List<QuestionContentView2> questionUserContent) {
		this.questionUserContent = questionUserContent;
	}
	public int getQuestionBestAnswer() {
		return questionBestAnswer;
	}
	public void setQuestionBestAnswer(int questionBestAnswer) {
		this.questionBestAnswer = questionBestAnswer;
	}
	public List<QuestionContentView> getQuestionNumberContent() {
		return questionNumberContent;
	}
	public void setQuestionNumberContent(List<QuestionContentView> questionNumberContent) {
		this.questionNumberContent = questionNumberContent;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getClassifyId() {
		return classifyId;
	}
	public void setClassifyId(int classifyId) {
		this.classifyId = classifyId;
	}
	public int getQuestionState() {
		return questionState;
	}
	public void setQuestionState(int questionState) {
		this.questionState = questionState;
	}
	public String getQuestionDate() {
		return questionDate;
	}
	public void setQuestionDate(String questionDate) {
		this.questionDate = questionDate;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	
	public QuestionView(QuestionPersistence questionPersistence){
		if(questionPersistence==null){
			return;
		}
		this.questionId = questionPersistence.getQuestionId();
		this.userId = questionPersistence.getUserId();
		this.classifyId = questionPersistence.getClassifyId();
		this.questionState = questionPersistence.getQuestionState();
		this.questionDate = questionPersistence.getQuestionDate();
		this.questionText = questionPersistence.getQuestionText();
		this.questionTitle = questionPersistence.getQuestionTitle();
		this.questionBestAnswer = questionPersistence.getQuestionBestAnswer();
	}
	public QuestionView(){
		
	}
}
