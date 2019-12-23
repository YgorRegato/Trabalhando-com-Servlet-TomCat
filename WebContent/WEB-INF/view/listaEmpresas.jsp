<%@ page import="java.util.List,br.com.Modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
<body>

	Usuário Logado: ${logado.login}<br>
	<br>
	<br>
	
	EMPRESAS CADASTRADAS:

	<ul>

		<c:forEach items="${listas}" var="empresas">
			<li>${empresas.nome}-Data:<fmt:formatDate value="${empresas.data}" pattern="dd/MM/yyyy" /> 
			<a href="/gerenciadorF/entrada?acao=RemoveEmpresas&id=${empresas.id}">Remover</a> 
			<a href="/gerenciadorF/entrada?acao=MostraEmpresas&id=${empresas.id}">Editar</a>
			</li>
		</c:forEach>

	</ul>
	<br>
	<br>
	<br>
	<a href="/gerenciadorF/entrada?acao=CadastroEmpresaForm">Adicionar Empresas</a><br>
	<br>
	<br>
	<a href="/gerenciadorF/entrada?acao=Logout"> Logout</a>
</html>
</body>