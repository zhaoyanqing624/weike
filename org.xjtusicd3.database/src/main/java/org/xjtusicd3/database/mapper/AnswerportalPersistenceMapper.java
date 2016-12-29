package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.AnswerportalPersistence;

public interface AnswerportalPersistenceMapper extends IBaseDao<AnswerportalPersistence, String>{
	
	@Select("SELECT * FROM answer,user,question WHERE answer.questionId=question.questionId AND answer.userId=user.userId AND answer.questionId=#{0} AND answer.answerState='1' ORDER BY answerDate")
	List<AnswerportalPersistence> getAnswer(int questionId);

}
