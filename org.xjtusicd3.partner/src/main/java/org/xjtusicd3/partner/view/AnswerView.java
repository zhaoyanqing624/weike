package org.xjtusicd3.partner.view;

import java.util.List;

import org.xjtusicd3.database.model.AnswerPersistence;

public class AnswerView {
	private int answerId;
	private int userId;
	private int questionId;
	private String answerName;
	private String answerDate;
	private int answerState;
	private int answerBest;
	
	private List<UserView> userViews;
	private List<GoodsView> goodsViews;
	
	
	
	public List<GoodsView> getGoodsViews() {
		return goodsViews;
	}
	public void setGoodsViews(List<GoodsView> goodsViews) {
		this.goodsViews = goodsViews;
	}
	public List<UserView> getUserViews() {
		return userViews;
	}
	public void setUserViews(List<UserView> userViews) {
		this.userViews = userViews;
	}
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
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
	
	public AnswerView(AnswerPersistence answerPersistence){
		if(answerPersistence==null){
			return;
		}
		this.answerId = answerPersistence.getAnswerId();
		this.questionId = answerPersistence.getQuestionId();
		this.userId = answerPersistence.getUserId();
		this.answerName = answerPersistence.getAnswerName();
		this.answerDate = answerPersistence.getAnswerDate();
		this.answerState = answerPersistence.getAnswerState();
		this.answerBest = answerPersistence.getAnswerBest();
	}
	public AnswerView(){
		
	}
}
