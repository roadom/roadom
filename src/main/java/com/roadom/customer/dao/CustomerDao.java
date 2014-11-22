package com.roadom.customer.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;

import com.roadom.base.dao.BaseDao;
import com.roadom.base.dao.DBAccess;
import com.roadom.customer.model.Customer;

public class CustomerDao implements BaseDao{
	private static final Logger log = LogManager.getLogger(CustomerDao.class);
	
	List<Customer> findAll(){
		log.trace(123123);
		List<Customer> result = new ArrayList<Customer>();
		SqlSession sqlSession = null;
		try {
			sqlSession = DBAccess.getSqlSession();
			result = sqlSession.selectList("Customer.findAll");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=sqlSession){
				sqlSession.close();
			}
		}
		
		return result;
	}
	
	
	
	@Test
	public void testName() throws Exception {
		CustomerDao dao = new CustomerDao();
		List<Customer> a = dao.findAll();
		
		System.out.println(a);
		
	}
	
}
