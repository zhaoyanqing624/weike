package org.xjtusicd3.database.logic;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;



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
			
			
			configuration.addInterceptor(new BasePlugin());
			bizSqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
		
		return bizSqlSessionFactory;
	}
}
