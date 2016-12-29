package org.xjtusicd3.database.model;

import org.xjtusicd3.database.ann.TableField;
import org.xjtusicd3.database.ann.TableKey;
import org.xjtusicd3.database.ann.TableKey.Strategy;

public class GoodsPersistence {
	@TableKey(strategy = Strategy.NORMAL)
	@TableField(columnName="goodsId")
	private int goodsId;
	@TableField(columnName="answerId")
	private int answerId;
	@TableField(columnName="goodsUserId")
	private int goodsuserId;
	@TableField(columnName="goodsNumber")
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
	
	
}
