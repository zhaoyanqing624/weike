package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

public class QuestionContentPersistence2 {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName = "userId")
	private int userId;
	@TableField(columnName = "userName")
	private String userName;
	@TableField(columnName = "answerName")
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
	
	
}
