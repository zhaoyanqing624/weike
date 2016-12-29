package org.xjtusicd3.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.xjtusicd3.database.logic.IBaseDao;
import org.xjtusicd3.database.model.AnswerPersistence;

public interface AnswerPersistenceMapper extends IBaseDao<AnswerPersistence, String>{
	/*
	 * 查看问题的回复列表
	 */
	@Select({"SELECT * FROM answer where questionId=#{0} ORDER BY answerDate"})
	List<AnswerPersistence> selectAnswer(int paramString);
	@Select({"SELECT count(*) as count from answer where questionId=#{0}"})
	int selectAnswerNumber(int paramString);
	@Select({"UPDATE answer set answerBest='1' WHERE answerId=#{0}"})
	void updateAnswer(int paramString);
	@Select({"SELECT * from answer WHERE answerId=#{0} and answerBest='1'"})
	List<AnswerPersistence> selectBestAnswer(int paramString);
	
	@Select({"Select questionId FROM answer where answerId=#{0}"})
	int selectBestAnswer2(int paramString);
	
	@Select({"SELECT * from answer WHERE questionId=#{0} and answerBest='0' ORDER BY answerDate"})
	List<AnswerPersistence> selectOtherAnswer(int paramString);
	
	@Select({"select answerId from answer where questionId=#{0} and answerBest='1'"})
	int selectAnswerId(int paramString);
	
	
	@Update("UPDATE answer set answerState='0' WHERE answerId=#{0}")
	void updateAnswer2(int a);
	
	@Select("select questionId from answer where answerId=#{0}")
	int selectAnswer2(int paramString);
	
}
