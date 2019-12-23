package br.com.Empresa.Controlador;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Empresa.AcaoServlets.Acao;



@WebFilter("/entrada") //note que o mapeamento do Filter � o mesmo do controlador

public class FilterControlador implements Filter {

  
	public void doFilter(ServletRequest request2, ServletResponse response2, FilterChain chain) throws IOException, ServletException {

		System.out.println("FilterControlador");

		HttpServletRequest request=(HttpServletRequest) request2; 
		HttpServletResponse response=(HttpServletResponse)response2;
		
		String paramAcao= request.getParameter("acao"); //PEGA O PARAMETRO
		
		String nomeClasse= "br.com.Empresa.AcaoServlets." + paramAcao;           					//Para capturar uma classe com o m�todo .forName da class Class, � necess�rio o Qualify Name, ou seja o nome da classe com seu pacote
		String nome;
		try {
			Class classe= Class.forName(nomeClasse);                              				//Classe e m�todo para capturar uma classe pelo nome
			Acao acao=(Acao) classe.newInstance(); 								 				// Interface Acao criada para formalizar o m�todo "executar" em todas as actions
			nome= acao.executar(request, response);												//Cast necess�rio, pois o m�todo .newInstance retorna um Object.
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
	    }
		// IR� PEGAR O DIRECIONAMENTO DA ACTION(REDIRECT ou FORWARD) E EXECUTAR
		String[] tipoEndere�o=nome.split(":");
		
		if(tipoEndere�o[0].equals("forward")) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoEndere�o[1]);
		rd.forward(request, response);	
		
	}else
		response.sendRedirect(tipoEndere�o[1]);	
		
		
	}

}
