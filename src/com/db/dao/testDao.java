package com.db.dao;


import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.db.bean.TestBean;
=======

import org.apache.ibatis.session.SqlSession;

import com.db.bean.UserBean;
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
import com.db.settings.MybatisConnector;

public class testDao extends MybatisConnector{
	
	private static testDao instance = new testDao();
	
	public static testDao getInstance() {
		return instance;
	}
	
	/**
<<<<<<< HEAD
	 * user list ��������
	 * @return
	 */
	public ArrayList<TestBean> getUserList(){
		ArrayList<TestBean> list= new ArrayList<TestBean>();
=======
	 * user list ��������
	 * @return
	 */
	public ArrayList<UserBean> getUserList(){
		ArrayList<UserBean> list= new ArrayList<UserBean>();
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
		
		SqlSession session = getSqlSessionFactory().openSession();
		
		try{
			list = (ArrayList)session.selectList("mappers.test.selectUser");
<<<<<<< HEAD
			
=======
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
		}finally{
			session.close();
		}
		
		return list;
	}
<<<<<<< HEAD
	
	/**
	 * password�� �����ͼ� ���ô�.
	 */
/*	public String getUserPass(){
		String pass="";
		try{
			pass = (String) .......;
		}finally{
			
		}
		return pass;
	}*/
=======
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
}
