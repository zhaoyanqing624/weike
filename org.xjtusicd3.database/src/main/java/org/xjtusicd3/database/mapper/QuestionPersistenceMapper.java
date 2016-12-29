package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.QuestionContentPersistence;
import org.xjtusicd3.database.model.QuestionContentPersistence2;
import org.xjtusicd3.database.model.QuestionPersistence;

public interface QuestionPersistenceMapper extends IBaseDao<QuestionPersistence, String>{
	/*
	 * 查看最新问题的列表
	 */
	@Select({"SELECT * from question WHERE questionState=#{0} ORDER BY questionDate DESC"})
	List<QuestionPersistence> selectQuestion(int paramString);
	
	@Select({"SELECT * from question WHERE questionId=#{0}"})
	QuestionPersistence selectQuestion2(int paramString);
	
	@Select({"SELECT count(questionId) as questionNumber from answer where questionId=#{0}"})
	List<QuestionContentPersistence> selectAnswerNumber(int paramString);
	
	@Select({"UPDATE question set questionBestAnswer='1' WHERE questionId=#{0}"})
	void updateQuestion(int questionId);
	
	@Select({"SELECT user.userId,userName,answerName from user,answer where answer.questionId=#{0} AND answer.userId = user.userId AND answerBest='1'"})
	List<QuestionContentPersistence2> selectQuestionUser(int questionId);
	
	@Select({"select questionBestAnswer from question where questionId=#{0}"})
	int selectQuestionBestAnswer(int questionId);
	
	@Select("SELECT * from question WHERE questionText LIKE #{0} ")
	List<QuestionPersistence> questionList(String c1);

	@Select({"select count(questionId) as b from question WHERE questionText LIKE #{0}"})
	int questionList2(String c1);
	

}
