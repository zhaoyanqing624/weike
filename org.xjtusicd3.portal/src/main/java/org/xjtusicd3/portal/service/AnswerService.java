package org.xjtusicd3.portal.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.AnswerHelp;
import org.xjtusicd3.database.model.AnswerPersistence;
import org.xjtusicd3.database.model.AnswerportalPersistence;
import org.xjtusicd3.portal.view.AnswerView;

public class AnswerService {

	public static List<AnswerView> answer(int questionId) {
		List<AnswerView> answerViews = new ArrayList<AnswerView>();
		List<AnswerportalPersistence> answerportalPersistences = AnswerHelp.getAnswer(questionId);
		if(answerportalPersistences==null){
			return null;
		}
		for(AnswerportalPersistence answerportalPersistence2:answerportalPersistences){
			AnswerView view = new AnswerView(answerportalPersistence2);
			answerViews.add(view);
		}
		return answerViews;
	}

	public static void updateanswer(int a) {
		AnswerHelp.updateAnswer(a);
	}

	public static void updateanswer2(int a) {
		AnswerHelp.updateAnswer2(a);
	}
	
}
