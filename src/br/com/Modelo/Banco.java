package br.com.Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static Integer chaveSequencial = 1;
	private static List<Empresa> empresas = new ArrayList();
	private static List<Usuario> login = new ArrayList<Usuario>();
	private Empresa nome;

	// Cadastro de empresas e usuários permanentes já que isso não é um banco de
	// verdade e os cadastros feitos pelo navegador somem
	static {

		Empresa empresa = new Empresa();
		Empresa empresa2 = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa2.setId(chaveSequencial++);
		empresa.setNome("Regatos Transportes");
		empresa2.setNome("Kelly Consultoria");
		empresas.add(empresa);
		empresas.add(empresa2);
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		usuario1.setLogin("Ygor");
		usuario1.setSenha("12345");
		usuario2.setLogin("Kelly");
		usuario2.setSenha("54321");
		login.add(usuario1);
		login.add(usuario2);

	}

	// Método usado para validar o login e senha do usuário;
	public boolean valida(String login, String senha) {
		Iterator<Usuario> listaUser = this.login.iterator();
		Usuario user = new Usuario();
		boolean teste = false;
		while (listaUser.hasNext()) {

			user = listaUser.next();

			if (user.getLogin().equalsIgnoreCase(login) && user.getSenha().equals(senha)) {

				teste = true;

				break;

			} else if (!user.getLogin().equalsIgnoreCase(login) && !user.getSenha().equals(senha)) {
				teste = false;
			}

		}
		return teste;

	}

	public void addEmpresa(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		Banco.empresas.add(empresa);
	}

	public Empresa getNome() {
		return this.nome;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = empresas.iterator(); // O método Iterator é usado, pois o FOR não funciona corretamente
													// com List

		while (it.hasNext()) {
			Empresa empresa = it.next();

			if (empresa.getId() == id) {
				it.remove();
			}
		}

//		for (Empresa empresa : empresas) {
//
//			if (empresa.getId() == id) {       NÃO FUNCIONA CORRETAMENTE
//				empresas.remove(empresa);
//			
//			}
//		}
	}

	public Empresa buscaPorEmpresas(Integer id) {
		Empresa empresa = new Empresa();
		Iterator<Empresa> it = empresas.iterator();
		while (it.hasNext()) {
			empresa = it.next();
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;

	}
}