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

public class AlteraEmpresa implements Acao{
	
	public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nomeParam = request.getParameter("nome");
		String dataParam = request.getParameter("data");
		String idParam = request.getParameter("id");
		Integer id= Integer.parseInt(idParam);

		Date data = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = sdf.parse(dataParam);
		} catch (ParseException e) {
			throw new ServletException(e);

		}
		
		Banco banco= new Banco();
		Empresa empresa= banco.buscaPorEmpresas(id);
		
		empresa.setNome(nomeParam);
		empresa.setData(data);
		
		return "redirect:entrada?acao=ListaEmpresas";
	}

}
