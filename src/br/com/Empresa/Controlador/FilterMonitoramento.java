package br.com.Empresa.Controlador;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//PARA DEFINIR A ORDEM DE EXECUÇÃO DOS FILTERS, É NECESSÁRIO USAR O WEB.XML


@WebFilter("/entrada") //note que o mapeamento do Filter é o mesmo do controlador

public class FilterMonitoramento implements javax.servlet.Filter {
	

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("FilterMonitoramento");

		
		long inicio= System.currentTimeMillis();
		
		String acao= request.getParameter("acao"); //pega o parâmetro do navegador
		
		
		chain.doFilter(request, response); // joga o fluxo pra frente, ou seja, passa para o próximo filter
		
		long depois= System.currentTimeMillis();
		
		System.out.println("Tempo de execução da ação "+acao+" -> " + (depois-inicio));
		
		

	}

}
