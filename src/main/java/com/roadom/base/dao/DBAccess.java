package com.roadom.base.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class DBAccess {
	
	/**
	 * 获得sqlSession
	 * @return
	 * @author roadom
	 * @throws IOException
	 */
	public static SqlSession getSqlSession() throws IOException{
		SqlSession result = null;
		Reader reader = Resources.getResourceAsReader("myBatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		result = factory.openSession();
		return result;
	}
	
	
	@Test
	public void testName() throws Exception {
		getSqlSession();
	}
	
}
