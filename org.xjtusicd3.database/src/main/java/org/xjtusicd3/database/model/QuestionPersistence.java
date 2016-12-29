package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.Table;
import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

@Table(tablename="question")
public class QuestionPersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName = "questionId")
	public int questionId;
	@TableField(columnName = "userId")
	public int userId;
	@TableField(columnName = "classifyId")
	public int classifyId;
	@TableField(columnName = "questionState")
	public int questionState;
	@TableField(columnName = "questionDate")
	public String questionDate;
	@TableField(columnName = "questionText")
	public String questionText;
	@TableField(columnName = "questionTitle")
	public String questionTitle;
	@TableField(columnName = "questionBestAnswer")
	public int questionBestAnswer;
	
	
	
	public int getQuestionBestAnswer() {
		return questionBestAnswer;
	}
	public void setQuestionBestAnswer(int questionBestAnswer) {
		this.questionBestAnswer = questionBestAnswer;
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
	
	
}
