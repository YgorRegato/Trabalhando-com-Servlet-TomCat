package br.com.Empresa.AcaoServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Acao {

	
	String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
