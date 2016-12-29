package org.xjtusicd3.portal.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.QuestionHelp;
import org.xjtusicd3.database.model.QuestionportalPersistence;
import org.xjtusicd3.portal.view.QuestionView;

public class QuestionService {
		public static List<QuestionView> question(){
			List<QuestionView> questionViews = new ArrayList<QuestionView>();
			List<QuestionportalPersistence> questionportalPersistences = QuestionHelp.getQuestion();
			if(questionportalPersistences==null){
				return null;
			}
			for(QuestionportalPersistence questionportalPersistence2:questionportalPersistences){
				QuestionView view = new QuestionView(questionportalPersistence2);
				questionViews.add(view);
			}
			return questionViews;
		}



		public static void updatequestion(int q) {
			QuestionHelp.updateQuestion2(q);
		}
}
