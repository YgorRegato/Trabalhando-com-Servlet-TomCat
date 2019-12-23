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

public class CadastroEmpresaForm implements Acao {
	
	
	public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		return "forward:formEmpresas.jsp";
	}

}
