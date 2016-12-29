package org.xjtusicd3.database.logic;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.xjtusicd3.database.mapper.AdminPersistenceMapper;
import org.xjtusicd3.database.mapper.AnswerPersistenceMapper;
import org.xjtusicd3.database.mapper.AnswerportalPersistenceMapper;
import org.xjtusicd3.database.mapper.ClassifyPersistenceMapper;
import org.xjtusicd3.database.mapper.CommentPersistenceMapper;
import org.xjtusicd3.database.mapper.CourseAddPersistenceMapper;
import org.xjtusicd3.database.mapper.CourseListPersistenceMapper;
import org.xjtusicd3.database.mapper.CourseTitleAddPersistenceMapper;
import org.xjtusicd3.database.mapper.CourseportalPersistenceMapper;
import org.xjtusicd3.database.mapper.GoodsPersistenceMapper;
import org.xjtusicd3.database.mapper.LastCoursePersistenceMapper;
import org.xjtusicd3.database.mapper.PersistenceDictionaryMapper;
import org.xjtusicd3.database.mapper.PersistenceForumListMapper;
import org.xjtusicd3.database.mapper.PersistenceForumReplyMapper;
import org.xjtusicd3.database.mapper.PersistenceLogMapper;
import org.xjtusicd3.database.mapper.PersistencePatentMapper;
import org.xjtusicd3.database.mapper.PersistenceUserMapper;
import org.xjtusicd3.database.mapper.QuestionPersistenceMapper;
import org.xjtusicd3.database.mapper.QuestionportalPersistenceMapper;
import org.xjtusicd3.database.mapper.RecordPersistenceMapper;
import org.xjtusicd3.database.mapper.SearchPersistenceMapper;
import org.xjtusicd3.database.mapper.UserPersistenceMapper;
import org.xjtusicd3.database.mapper.UserpersonalPersistenceMapper;
import org.xjtusicd3.database.mapper.VideoPersistenceMapper;
import org.xjtusicd3.database.model.AnswerportalPersistence;
import org.xjtusicd3.database.model.CourseTitleAddPersistence;
import org.xjtusicd3.database.model.QuestionportalPersistence;
import org.xjtusicd3.database.model.SearchPersistence;




public class SqlSessionManager {
	private static SqlSessionFactory bizSqlSessionFactory;
	public static SqlSessionFactory getSqlSessionFactory()  {
		if (bizSqlSessionFactory==null) {
			try {
				bizSqlSessionFactory = convertSqlSession(new Dbconfig("/databaseconfig.properties"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bizSqlSessionFactory;
	}
	
	private static SqlSessionFactory convertSqlSession(Dbconfig dbConfig) throws Exception { 
		
			DataSource dataSource = ConnectionManager.getProxoolDataSource(dbConfig.getDriver(), dbConfig.getUrl(), dbConfig.getUsername(),
					dbConfig.getPassword(), dbConfig.getAlias(), dbConfig.getMaxConnection(), dbConfig.getMinConnection(),
					dbConfig.getSimultaneousBuildThrottle());
			TransactionFactory transactionFactory = new JdbcTransactionFactory();
			Environment environment = new Environment("development", transactionFactory, dataSource);
			Configuration configuration = new Configuration(environment);
			configuration.addMapper(IBaseDao.class);
			configuration.addMapper(UserPersistenceMapper.class);
			configuration.addMapper(CourseListPersistenceMapper.class);
			configuration.addMapper(ClassifyPersistenceMapper.class);
			configuration.addMapper(CourseTitleAddPersistenceMapper.class);
			configuration.addMapper(CourseAddPersistenceMapper.class);
			configuration.addMapper(VideoPersistenceMapper.class);
			configuration.addMapper(SearchPersistenceMapper.class);
			configuration.addMapper(LastCoursePersistenceMapper.class);
			configuration.addMapper(RecordPersistenceMapper.class);
			configuration.addMapper(QuestionPersistenceMapper.class);
			configuration.addMapper(AnswerPersistenceMapper.class);
			configuration.addMapper(CommentPersistenceMapper.class);
			
			
			configuration.addMapper(AdminPersistenceMapper.class);
			configuration.addMapper(CourseportalPersistenceMapper.class);
			configuration.addMapper(QuestionportalPersistenceMapper.class);
			configuration.addMapper(AnswerportalPersistenceMapper.class);
			configuration.addMapper(UserpersonalPersistenceMapper.class);
			configuration.addMapper(GoodsPersistenceMapper.class);
			configuration.addMapper(PersistencePatentMapper.class);
			configuration.addMapper(PersistenceUserMapper.class);
			configuration.addMapper(PersistenceLogMapper.class);
			configuration.addMapper(PersistenceDictionaryMapper.class);
			configuration.addMapper(PersistenceForumReplyMapper.class);
			configuration.addMapper(PersistenceForumListMapper.class);
			configuration.addInterceptor(new BasePlugin());
			
			bizSqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
		
		return bizSqlSessionFactory;
	}
}
