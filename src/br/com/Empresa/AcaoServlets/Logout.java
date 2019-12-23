package br.com.Empresa.AcaoServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		HttpSession sessao= request.getSession(); // essa classe serve para capturar a SessionId
		//sessao.removeAttribute("logado"); não é muito usada
		sessao.invalidate();
		return "redirect:entrada?acao=LoginForm";
	}
	
	

}
