package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ������ ���ϰ��� ���� Ȯ���� �� �ֵ��� ������� interface
 * @author EK
 */
public interface ResultController {
	public String result(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
