<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>                        
<c:url value="/entrada" var="linkEntradaServlet" />                                      
 
<html>

<body>

CENTRO EMPRESARIAL ONLINE<br>
------------------------------------------------<br>
<br>
<br>
FAÇA O LOGIN<br>
<br>

	<form action="${linkEntradaServlet}" method="post">

		Login:<input type="text" name="nome" />                               
		Senha:<input type=password name="senha" /> 
		<input type="hidden" name="acao" value="Login" />                         
			
		    <input type="submit" />





	</form>


</body>
</html>