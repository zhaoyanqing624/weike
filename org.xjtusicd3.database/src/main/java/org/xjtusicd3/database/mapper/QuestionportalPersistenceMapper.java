package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.QuestionportalPersistence;

public interface QuestionportalPersistenceMapper  extends IBaseDao<QuestionportalPersistence, String>{
	
	/*
	 * 查找问题列表
	 */
	@Select("SELECT * from question,user,classify WHERE question.userId=user.userId AND question.classifyId=classify.classifyId AND questionState='1' order by question.questionDate")
	List<QuestionportalPersistence> getQuestion();
	
	
	@Update("update question set questionState='0' where questionId=#{0}")
	void updateQuestion2(int q);
	
	
	
	
}
