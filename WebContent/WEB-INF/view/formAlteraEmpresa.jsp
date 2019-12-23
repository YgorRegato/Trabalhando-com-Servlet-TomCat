<%@page import="java.util.List,br.com.Modelo.Empresa"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>

<body>

	<form action="/gerenciadorF/entrada?acao=AlteraEmpresa" method="post">

		Nome da empresa:<input type="text" name="nome" value="${alteracao.nome}" /> 
		Data:<input type="text" name="data" value="<fmt:formatDate value= "${alteracao.data}" pattern= "dd/MM/yyyy"/>" />
			 <input type="hidden" name="id" value="${alteracao.id}" /> 
			 <input type="submit" />





	</form>


</body>
</html>