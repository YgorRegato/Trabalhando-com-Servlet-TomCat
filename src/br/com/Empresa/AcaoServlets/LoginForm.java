package br.com.Empresa.AcaoServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm implements Acao{

	public String executar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		return "forward:LoginForm.jsp";
	}
}
