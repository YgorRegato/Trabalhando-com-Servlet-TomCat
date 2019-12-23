package br.com.Empresa.Controlador;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//PARA DEFINIR A ORDEM DE EXECUÇÃO DOS FILTERS, É NECESSÁRIO USAR O WEB.XML

@WebFilter("/entrada") //note que o mapeamento do Filter é o mesmo do controlador

public class FilterLogin implements Filter { 

	// IRÁ FAZER A VERIFICAÇÃO DO LOGIN
	public void doFilter(ServletRequest request2, ServletResponse response2, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("FilterLogin");
		
		HttpServletRequest request=(HttpServletRequest) request2; // É NECESSÁRIO FAZER O CAST, POIS A CLASSE HTTPSERVLET É MAIS ESPECÍFICA QUE A SERVLETREQUEST/RESPONSE
		HttpServletResponse response=(HttpServletResponse) response2; //E A CLASSE SERVLETREQUEST/RESPONSE NÃO TEM O MÉTODO GETSESSION
		
		String acao= request.getParameter("acao");
		HttpSession sessao= request.getSession(); // essa classe serve para capturar a SessionId
		boolean naoLogado= (sessao.getAttribute("logado")==null);
		boolean protegida= !(acao.equals("LoginForm") || acao.equals("Login"));
		
		if (naoLogado && protegida) {
			
			response.sendRedirect("entrada?acao=LoginForm");
		}
		
		chain.doFilter(request, response);
		
		
		
	}

	

}
