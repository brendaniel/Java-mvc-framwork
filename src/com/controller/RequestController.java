package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��û�� ��Ƽ� �з��Ѵ�.
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
			// ��û�� Ŭ������ ��θ� �Ű������� �޾� Ŭ���� ��ü ����
			Class c = Class.forName(super.getServletName());
			// Ŭ������ inteface ��ü�� �������� ����
			ResultController servlet = (ResultController) c.newInstance();
		
			if(servlet != null){
				// ���ȭ���� �ɾ��ش�.
				resultView = servlet.result(req, res);
			}else{
				// ���н� URL ������
				System.out.println(req.getServletPath());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// ��û�� Ŭ������ Overload�� Result �Լ����� ��ȯ���� ���� ��� ������ ������
		if(resultView!=null){
			RequestDispatcher rd = req.getRequestDispatcher(resultView);
			rd.forward(req, res);
		}
	}
}
