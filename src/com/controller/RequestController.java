package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
<<<<<<< HEAD
 * ��û�� ��Ƽ� �з��Ѵ�.
=======
 * ��û�� ��Ƽ� �з��Ѵ�.
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
 * @author EK
 */
public abstract class RequestController extends HttpServlet implements ResultController{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
			reqProcess(req, res);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
			reqProcess(req, res);
	}
	
	public void reqProcess(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String resultView = "";
		try{
<<<<<<< HEAD
			// 요청된 서블릿의 클래스 명을 받아온다.
			Class c = Class.forName(super.getServletName());
			// 그 클래스로 ResultController 클래스의 객체를 동적으로 생성
			ResultController servlet = (ResultController) c.newInstance();
		
			if(servlet != null){
				// 리턴 페이지 반환
				resultView = servlet.result(req, res);
			}else{
				// 오류시
=======
			// ��û�� Ŭ������ ��θ� �Ű������� �޾� Ŭ���� ��ü ����
			Class c = Class.forName(super.getServletName());
			// Ŭ������ inteface ��ü�� �������� ����
			ResultController servlet = (ResultController) c.newInstance();
		
			if(servlet != null){
				// ���ȭ���� �ɾ��ش�.
				resultView = servlet.result(req, res);
			}else{
				// ���н� URL ������
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
				System.out.println(req.getServletPath());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
<<<<<<< HEAD
		// 오버로딩 된 Result 메소드의 결과 페이지를 Dispatcher 해준다.
=======
		// ��û�� Ŭ������ Overload�� Result �Լ����� ��ȯ���� ���� ��� ������ ������
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
		if(resultView!=null){
			RequestDispatcher rd = req.getRequestDispatcher(resultView);
			rd.forward(req, res);
		}
	}
}
