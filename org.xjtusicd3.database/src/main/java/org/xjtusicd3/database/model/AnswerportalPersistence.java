package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

public class AnswerportalPersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName = "answerId")
	private int answerId;
	@TableField(columnName = "questionTitle")
	private String questionTitle;
	@TableField(columnName = "userName")
	private String userName;
	@TableField(columnName = "answerName")
	private String answerName;
	@TableField(columnName = "answerDate")
	private String answerDate;
	@TableField(columnName = "answerBest")
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
	
	
}
