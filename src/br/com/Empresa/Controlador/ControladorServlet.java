package br.com.Empresa.Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.Empresa.AcaoServlets.RemoveEmpresas;
import br.com.Empresa.AcaoServlets.Acao;
import br.com.Empresa.AcaoServlets.AlteraEmpresa;
import br.com.Empresa.AcaoServlets.CadastroEmpresa;
import br.com.Empresa.AcaoServlets.CadastroEmpresaForm;
import br.com.Empresa.AcaoServlets.ListaEmpresas;
import br.com.Empresa.AcaoServlets.MostraEmpresas;

//PARA DEFINIR A ORDEM DE EXECU��O DOS FILTERS, � NECESS�RIO USAR O WEB.XML

//@WebServlet("/entrada")
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//ESSE M�TODO DO CONTROLADOR IR� PEGAR O PARAMETRO DO NAVEGADOR COMO VALOR O NOME DE UMA CLASSE E IR� CHAMAR A CLASSE PARA FAZER O QUE FOI SOLICITADO
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
//		String paramAcao= request.getParameter("acao"); //PEGA O PARAMETRO
//
//		String nomeClasse= "br.com.Empresa.AcaoServlets." + paramAcao;           					//Para capturar uma classe com o m�todo .forName da class Class, � necess�rio o Qualify Name, ou seja o nome da classe com seu pacote
//		String nome;
//		try {
//			Class classe= Class.forName(nomeClasse);                              				//Classe e m�todo para capturar uma classe pelo nome
//			Acao acao=(Acao) classe.newInstance(); 								 				// Interface Acao criada para formalizar o m�todo "executar" em todas as actions
//			nome= acao.executar(request, response);												//Cast necess�rio, pois o m�todo .newInstance retorna um Object.
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//			throw new ServletException(e);
//	    }
//		// IR� PEGAR O DIRECIONAMENTO DA ACTION(REDIRECT ou FORWARD) E EXECUTAR
//		String[] tipoEndere�o=nome.split(":");
//		
//		if(tipoEndere�o[0].equals("forward")) {
//		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoEndere�o[1]);
//		rd.forward(request, response);	
//
//	}else
//		response.sendRedirect(tipoEndere�o[1]);	
//		
		
		
//     PODE SER FEITO ASSIM TAMB�M, POR�M � UMA PROGRAMA��O PROCEDURAL	
		
//		if(paramAcao.equals("removeEmpresa")) {
//			
//			RemoveEmpresas remove= new RemoveEmpresas();
//			nome=remove.executar(request, response);
//			
//		}else if(paramAcao.equals("listaEmpresas")) {
//			
//			ListaEmpresas lista= new ListaEmpresas();
//			
//			nome=lista.executar(request, response);
//			
//		}else if(paramAcao.equals("mostraEmpresa")) {
//			
//			MostraEmpresa amostrar= new MostraEmpresa();
//			
//			nome=amostrar.executar(request, response);
//			
//		}else if(paramAcao.equals("alteraEmpresa")) {
//			
//			AlteraEmpresa altera= new AlteraEmpresa();
//			
//			nome=altera.executar(request, response);
//				
//		}else if(paramAcao.equals("cadastroEmpresa")) {
//			
//			CadastroEmpresa cadastro= new CadastroEmpresa();
//			
//			nome=cadastro.executar(request, response);
//			
//		}else if(paramAcao.equals("cadastroEmpresaForm")) {
//			
//			CadastroEmpresaForm novoCadastro= new CadastroEmpresaForm();
//			
//			nome=novoCadastro.executar(request, response);
//		}
			
	
	}

}


//C�DIGO DE CONFIGURA��O DE LOGIN E SENHA NO ARQUIVO XML
//<login-config>
//<auth-method>BASIC</auth-method>
//</login-config>
//
//<security-role>
//  <role-name>ADMINISTRADOR</role-name>
//</security-role>
//
//<security-role>
//  <role-name>USUARIO</role-name>
//</security-role>
//
//<security-constraint>
//  <web-resource-collection>
//      <web-resource-name>acesso controlador</web-resource-name>
//      <url-pattern>/entrada</url-pattern>
//  </web-resource-collection>
//  <auth-constraint>
//      <role-name>ADMINISTRADOR</role-name>
//  </auth-constraint>
//</security-constraint>
//
//<security-constraint>
//  <web-resource-collection>
//      <web-resource-name>acesso a paginas html</web-resource-name>
//      <url-pattern>*.html</url-pattern>
//  </web-resource-collection>
//  <auth-constraint>
//      <role-name>USUARIO</role-name>
//  </auth-constraint>
//</security-constraint>
//</web-app>