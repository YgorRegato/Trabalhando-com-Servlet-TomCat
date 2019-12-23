package br.com.Empresa.AcaoServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Modelo.Banco;
import br.com.Modelo.Empresa;

public class MostraEmpresas implements Acao {
	
	public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String parametro= request.getParameter("id");
		Integer id= Integer.parseInt(parametro);
		
		Empresa empresa= new Empresa();
		Banco banco= new Banco();
		
		empresa= banco.buscaPorEmpresas(id);
		
		request.setAttribute("alteracao", empresa);
		
		return "forward:formAlteraEmpresa.jsp";
	}
}
