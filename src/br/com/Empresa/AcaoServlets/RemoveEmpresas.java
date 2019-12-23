package br.com.Empresa.AcaoServlets;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Modelo.Banco;

public class RemoveEmpresas implements Acao {
	

	public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId= request.getParameter("id");
		
		Integer removedor=Integer.parseInt(paramId);
		
		Banco banco= new Banco();
		
		banco.removeEmpresa(removedor);
			
		return "redirect:entrada?acao=ListaEmpresas";
	
	}

}
