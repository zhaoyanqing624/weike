package org.xjtusicd3.partner.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.QuestionHelp;
import org.xjtusicd3.database.model.QuestionContentPersistence;
import org.xjtusicd3.database.model.QuestionContentPersistence2;
import org.xjtusicd3.database.model.QuestionPersistence;
import org.xjtusicd3.partner.view.QuestionContentView;
import org.xjtusicd3.partner.view.QuestionContentView2;
import org.xjtusicd3.partner.view.QuestionView;
import org.xjtusicd3.partner.view.UserView;

public class QuestionService {
	/*
	 * 添加问题
	 */
	public static void addQuestion(QuestionView recordView){
		QuestionPersistence questionPersistence = new QuestionPersistence();
		questionPersistence.setQuestionId(recordView.getQuestionId());
		questionPersistence.setUserId(recordView.getUserId());
		questionPersistence.setClassifyId(recordView.getClassifyId());
		questionPersistence.setQuestionState(1);
		questionPersistence.setQuestionBestAnswer(0);
		questionPersistence.setQuestionDate(recordView.getQuestionDate());
		questionPersistence.setQuestionTitle(recordView.getQuestionTitle());
		questionPersistence.setQuestionText(recordView.getQuestionText());
		QuestionHelp.addQuestion(questionPersistence);
	}
	/*
	 * 查询问题--按照时间更新的顺序
	 */
	public static List<QuestionView> selectQuestion(int questionState){
		List<QuestionView> questionViews = new ArrayList<QuestionView>();
		List<QuestionPersistence> questionPersistences = QuestionHelp.selectQuestion(questionState);
		if(questionPersistences==null){
			return null;
		}
		for(QuestionPersistence questionPersistence2:questionPersistences){
			List<QuestionContentView> questionContentViews = new ArrayList<>();
			List<QuestionContentView2> questionContentView2s = new ArrayList<>();
			List<QuestionContentPersistence> questionContentPersistences = QuestionHelp.selectQuestionNumber(questionPersistence2.getQuestionId());
			List<QuestionContentPersistence2> questionContentPersistence2s = QuestionHelp.selectQuestionUser(questionPersistence2.getQuestionId());
			for(QuestionContentPersistence persistence:questionContentPersistences){
				QuestionContentView questionContentView = new QuestionContentView(persistence);
				questionContentViews.add(questionContentView);
			}
			for(QuestionContentPersistence2 persistence2:questionContentPersistence2s){
				QuestionContentView2 questionContentView2 = new QuestionContentView2(persistence2);
				questionContentView2s.add(questionContentView2);
			}
			QuestionView view = new QuestionView(questionPersistence2);
			view.setQuestionNumberContent(questionContentViews);
			view.setQuestionUserContent(questionContentView2s);
			questionViews.add(view);
		}
		
//		for(QuestionPersistence questionPersistence3:questionPersistences){
//			List<QuestionContentView2> questionContentView2s = new ArrayList<>();
//			List<QuestionContentPersistence2> questionContentPersistence2s = QuestionHelp.selectQuestionUser(questionPersistence3.getQuestionId());
//			for(QuestionContentPersistence2 persistence2:questionContentPersistence2s){
//				QuestionContentView2 questionContentView2 = new QuestionContentView2(persistence2);
//				questionContentView2s.add(questionContentView2);
//			}
//			QuestionView view = new QuestionView(questionPersistence3);
//			view.setQuestionUserContent(questionContentView2s);
//			questionViews.add(view);
//		}
		return questionViews;
	}
	public static QuestionView selectQuestion2(int questionId){
		QuestionPersistence questionPersistences = QuestionHelp.selectQuestion2(questionId);
		if(questionPersistences==null){
			return null;
		}
		QuestionView questionView = new QuestionView(questionPersistences);
		return questionView;
	}
	public static void updateQuestion(int questionId) {
		QuestionHelp.updateQuestion(questionId);
	}
	
	public static int selectQuestionBestAnswer(int questionId){
		int a  = QuestionHelp.selectQuestionBestAnswer(questionId);
		return a;
	}
	public static List<QuestionView> questionList(String searchName) {
		List<QuestionView> questionViews = new ArrayList<QuestionView>();
		List<QuestionPersistence> questionPersistences = QuestionHelp.questionList(searchName);
		if(questionPersistences == null){
			return null;
		}
		for(QuestionPersistence questionPersistence2:questionPersistences){
			QuestionView view = new QuestionView(questionPersistence2);
			questionViews.add(view);
		}
		return questionViews;
	}
	public static int questionList2(String searchName) {
		int a = QuestionHelp.questionList2(searchName);
		return a;
	}
	
	
	
	
}




