<%--
  Created by IntelliJ IDEA.
  User: leobugoni
  Date: 13/06/18
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <link rel="stylesheet" type="text/css" href="../../../bootstrap/css/bootstrap.css">
    <head>
        <title>Novo Produto</title>
    </head>

    <form action="<c:url value='/produto/criar'/>">
        Nome: <label> <input type="text" name="produto.nome"/> </label>
        Valor: <label> <input type="text" name="produto.valor"/> </label>
        Quantidade: <label> <input type="text" name="produto.quantidade"/> </label>
        <input type="submit" value="criar">
    </form>

</html>
