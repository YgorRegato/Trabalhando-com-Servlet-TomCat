package br.com.Empresa.Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.Modelo.Banco;
import br.com.Modelo.Empresa;

//Servlet usado para rodar os formatos Json ou XML

@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Empresa> empresas = new Banco().getEmpresas(); //lista das empresas

		XStream xstream = new XStream(); 
		xstream.alias("empresa", Empresa.class); //m�todo usado para evitar o "full qualify name" quando aberto pelo navegador
		String xml = xstream.toXML(empresas);	//o m�todo toXML define o que ser� apresentado como resposta � requisi��o do cliente

		response.setContentType("application/xml"); //o m�todo setContentType define o aponta o formato que ser� usado
		response.getWriter().print(xml); 
		
		
		
		

//	Gson gson= new Gson();
//	
//	String json= gson.toJson(empresas);
//	
//	response.setContentType("application/json");
//	response.getWriter().print(json);

	}

}
