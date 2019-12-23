package br.com.Empresa.AcaoServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.Modelo.Banco;
import br.com.Modelo.Empresa;

public class ListaEmpresas implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = new Banco();

		List<Empresa> empresas = banco.getEmpresas();

		request.setAttribute("listas", empresas);

		return "forward:listaEmpresas.jsp";

	}
}
