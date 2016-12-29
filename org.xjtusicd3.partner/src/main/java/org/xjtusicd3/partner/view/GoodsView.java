package org.xjtusicd3.partner.view;

import org.xjtusicd3.database.model.GoodsPersistence;

public class GoodsView {
	private int goodsId;
	private int answerId;
	private int goodsuserId;
	private int goodsNumber;
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public int getGoodsuserId() {
		return goodsuserId;
	}
	public void setGoodsuserId(int goodsuserId) {
		this.goodsuserId = goodsuserId;
	}
	public int getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	
	public GoodsView(GoodsPersistence goodsPersistence){
		this.goodsId = goodsPersistence.getGoodsId();
		this.answerId = goodsPersistence.getAnswerId();
		this.goodsuserId = goodsPersistence.getGoodsuserId();
		this.goodsNumber = goodsPersistence.getGoodsNumber();
	}
	
	public GoodsView(){
		
	}
}
