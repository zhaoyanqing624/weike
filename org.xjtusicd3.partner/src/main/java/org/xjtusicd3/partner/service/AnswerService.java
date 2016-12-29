package org.xjtusicd3.partner.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.AnswerHelp;
import org.xjtusicd3.database.helper.QuestionHelp;
import org.xjtusicd3.database.helper.UserHelper;
import org.xjtusicd3.database.model.AnswerPersistence;
import org.xjtusicd3.database.model.GoodsPersistence;
import org.xjtusicd3.database.model.UserPersistence;
import org.xjtusicd3.partner.view.AnswerView;
import org.xjtusicd3.partner.view.GoodsView;
import org.xjtusicd3.partner.view.UserView;

public class AnswerService {

	public static void addQuestion(int questionId, AnswerView answerView) {
		AnswerPersistence answerPersistence = new AnswerPersistence();
		answerPersistence.setAnswerId(answerView.getAnswerId());
		answerPersistence.setUserId(answerView.getUserId());
		answerPersistence.setAnswerDate(answerView.getAnswerDate());
		answerPersistence.setAnswerName(answerView.getAnswerName());
		answerPersistence.setAnswerState(1);
		answerPersistence.setAnswerBest(0);
		answerPersistence.setQuestionId(questionId);
		
		AnswerHelp.addAnswer(answerPersistence);
		
	}

	public static List<AnswerView> selectAnswer(int questionId) {
		List<AnswerView> answerViews = new ArrayList<AnswerView>();
		List<AnswerPersistence> answerPersistences = AnswerHelp.selectAnswer(questionId);
		if(answerPersistences==null){
			return null;
		}
		for(AnswerPersistence answerPersistence2:answerPersistences){
			List<UserView> userViews = new ArrayList<>();
			List<GoodsView> goodsViews = new ArrayList<>();
			List<UserPersistence> userPersistences = UserHelper.getUser4(answerPersistence2.getUserId());
			List<GoodsPersistence> goodsPersistences = AnswerHelp.selectGoodsNumber(answerPersistence2.getAnswerId());
			for(UserPersistence persistence:userPersistences){
				UserView userView = new UserView(persistence);
				userViews.add(userView);
			}
			for(GoodsPersistence goodsPersistence2:goodsPersistences){
				GoodsView goodsView = new GoodsView(goodsPersistence2);
				goodsViews.add(goodsView);
			}
			AnswerView view = new AnswerView(answerPersistence2);
			view.setUserViews(userViews);
			view.setGoodsViews(goodsViews);
			answerViews.add(view);
		}
		return answerViews;
	}
	
	public static int selectAnswerNumber(int questionId){
		int a = AnswerHelp.selectAnswerNumber(questionId);
		return a;
		
	}

	public static void updateAnswer(int a) {
		AnswerHelp.updateAnswer(a);
	}
	/*
	 * 查找最好的回复
	 */
	public static List<AnswerView> selectBestAnswer(int i) {
		List<AnswerView> answerViews = new ArrayList<AnswerView>();
		List<AnswerPersistence> answerPersistences = AnswerHelp.selectBestAnswer(i);
		if(answerPersistences==null){
			return null;
		}
		for(AnswerPersistence answerPersistence2:answerPersistences){
			List<UserView> userViews = new ArrayList<>();
			List<GoodsView> goodsViews = new ArrayList<>();
			List<UserPersistence> userPersistences = UserHelper.getUser4(answerPersistence2.getUserId());
			List<GoodsPersistence> goodsPersistences = AnswerHelp.selectGoodsNumber(i);
			for(UserPersistence persistence:userPersistences){
				UserView userView = new UserView(persistence);
				userViews.add(userView);
			}
			for(GoodsPersistence goodsPersistence2:goodsPersistences){
				GoodsView goodsView = new GoodsView(goodsPersistence2);
				goodsViews.add(goodsView);
			}
			AnswerView view = new AnswerView(answerPersistence2);
			view.setUserViews(userViews);
			view.setGoodsViews(goodsViews);
			answerViews.add(view);
		}
		return answerViews;
	}	
	public static int selectBestAnswer2(int i) {
		int a = AnswerHelp.selectBestAnswer2(i);
		return a;
	}
	/*
	 * 查询除了最好回复的其他回复
	 */
	public static List<AnswerView> selectOtherAnswer(int questionId) {
		List<AnswerView> answerViews = new ArrayList<AnswerView>();
		List<AnswerPersistence> answerPersistences = AnswerHelp.selectOtherAnswer(questionId);
		if(answerPersistences==null){
			return null;
		}
		for(AnswerPersistence answerPersistence2:answerPersistences){
			List<UserView> userViews = new ArrayList<>();
			List<GoodsView> goodsViews = new ArrayList<>();
			List<UserPersistence> userPersistences = UserHelper.getUser4(answerPersistence2.getUserId());
			List<GoodsPersistence> goodsPersistences = AnswerHelp.selectGoodsNumber(answerPersistence2.getAnswerId());
			for(UserPersistence persistence:userPersistences){
				UserView userView = new UserView(persistence);
				userViews.add(userView);
			}
			for(GoodsPersistence goodsPersistence2:goodsPersistences){
				GoodsView goodsView = new GoodsView(goodsPersistence2);
				goodsViews.add(goodsView);
			}
			AnswerView view = new AnswerView(answerPersistence2);
			view.setUserViews(userViews);
			view.setGoodsViews(goodsViews);
			answerViews.add(view);
		}
		return answerViews;
	}

	public static int selectAnswerId(int q) {
		int a =  AnswerHelp.selectAnswerId(q);
		return a;
	}
	/*
	 * 点赞
	 */
	public static Integer selectGoods(int a, int userid) {
		Integer b  = AnswerHelp.selectGoods(a,userid);
		return b;
	}

	public static void addGoods(int a, int userid) {
		AnswerHelp.addGoods(a,userid);
	}

	public static void deleteGoods(int goodsId) {
		AnswerHelp.deleteGoods(goodsId);
	}

	public static int selectAnswer2(int a) {
		int b = AnswerHelp.selectAnswer2(a);
		return b;
	}	
	
	

}
