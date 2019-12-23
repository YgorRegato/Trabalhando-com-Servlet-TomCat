package br.com.Empresa.AcaoServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.Modelo.Banco;
import br.com.Modelo.Usuario;

public class Login implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("nome");
		String senha = request.getParameter("senha");

		Banco banco = new Banco();
		Usuario usuario= new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		boolean validacao=banco.valida(login, senha);

		if (validacao == true) {
			
			HttpSession sessao= request.getSession();
			sessao.setAttribute("logado", usuario);
			return "redirect:entrada?acao=ListaEmpresas";
		}else
			return "forward:UsuarioNegado.jsp";

			
		
		

	}
}
