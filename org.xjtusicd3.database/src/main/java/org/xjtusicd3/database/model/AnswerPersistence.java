package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

@Table(tablename="answer")
public class AnswerPersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName = "answerId")
	private int answerId;
	@TableField(columnName = "questionId")
	private int questionId;
	@TableField(columnName = "userId")
	private int userId;
	@TableField(columnName = "answerName")
	private String answerName;
	@TableField(columnName = "answerDate")
	private String answerDate;
	@TableField(columnName = "answerState")
	private int answerState;
	@TableField(columnName = "answerBest")
	private int answerBest;
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
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
	public int getAnswerState() {
		return answerState;
	}
	public void setAnswerState(int answerState) {
		this.answerState = answerState;
	}
	public int getAnswerBest() {
		return answerBest;
	}
	public void setAnswerBest(int answerBest) {
		this.answerBest = answerBest;
	}
	
	
}	
