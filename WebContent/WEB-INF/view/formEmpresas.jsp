<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>                        
<c:url value="/entrada" var="linkEntradaServlet" />                                      
 
<html>

<body>

	<form action="${linkEntradaServlet}" method="post">

		Nome da empresa:<input type="text" name="nome" />                               
		Data:<input type="text" name="data" /> 
		<input type="hidden" name="acao" value="CadastroEmpresa" />                         
			
		    <input type="submit" />





	</form>


</body>
</html>