package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.QuestionContentPersistence;

public class QuestionContentView {
	private int questionId;
	private int questionNumber;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	
	public QuestionContentView(QuestionContentPersistence questionContentPersistence){
		this.questionId = questionContentPersistence.getQuestionId();
		this.questionNumber = questionContentPersistence.getQuestionNumber();
	}
	public QuestionContentView(){
		
	}
}
