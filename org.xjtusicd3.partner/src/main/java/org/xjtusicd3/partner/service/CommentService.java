package org.xjtusicd3.partner.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.CommentHelper;
import org.xjtusicd3.database.helper.UserHelper;
import org.xjtusicd3.database.model.AnswerPersistence;
import org.xjtusicd3.database.model.CommentPersistence;
import org.xjtusicd3.database.model.UserPersistence;
import org.xjtusicd3.partner.view.CommentView;
import org.xjtusicd3.partner.view.UserView;

public class CommentService {
	public static void addComment(int videoId,CommentView commentView){
		CommentPersistence commentPersistence = new CommentPersistence();
		commentPersistence.setCommentId(commentView.getCommentId());
		commentPersistence.setUserId(commentView.getUserId());
		commentPersistence.setVideoId(commentView.getVideoId());
		commentPersistence.setCommentName(commentView.getCommentName());
		commentPersistence.setCommentDate(commentView.getCommentDate());
		commentPersistence.setCommentState(1);
		
		CommentHelper.addComment(commentPersistence);
		
		
	}

	public static List<CommentView> selectComment(int videoid) {
		List<CommentView> commentViews = new ArrayList<CommentView>();
		List<CommentPersistence> commentPersistences = CommentHelper.selectComment(videoid);
		if(commentPersistences==null){
			return null;
		}
		for(CommentPersistence commentPersistence2:commentPersistences){
			List<UserView> userViews = new ArrayList<>();
			List<UserPersistence> userPersistences = UserHelper.getUser4(commentPersistence2.getUserId());
			for(UserPersistence persistence:userPersistences){
				UserView userView = new UserView(persistence);
				userViews.add(userView);
			}
			CommentView view = new CommentView(commentPersistence2);
			view.setUserViews(userViews);
			commentViews.add(view);
		}
		return commentViews;
	}
}
