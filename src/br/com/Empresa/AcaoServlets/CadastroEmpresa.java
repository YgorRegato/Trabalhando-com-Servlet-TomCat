package br.com.Empresa.AcaoServlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Modelo.Banco;
import br.com.Modelo.Empresa;

public class CadastroEmpresa implements Acao {
	
	
	public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeEmpresa = request.getParameter("nome");
		String paramData = request.getParameter("data");
		Date data = null;
		try {
			SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
			data=sdt.parse(paramData);
		} catch (ParseException e) {

			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setData(data);
		Banco banco = new Banco();
		banco.addEmpresa(empresa);
		
		System.out.println(data);

		return "redirect:entrada?acao=ListaEmpresas";
	}

}
