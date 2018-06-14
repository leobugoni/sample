<%--
  Created by IntelliJ IDEA.
  User: leobugoni
  Date: 13/06/18
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <link rel="stylesheet" type="text/css" href="../../../bootstrap/css/bootstrap.css">
    <head>
        <title>Todos os Produtos</title>
    </head>
    <body>
        <h1>Lista de Produtos</h1>


    <table class="table table-striped table-hover table-bordered">
        <thead>
            <tr>
                <th>Nome</th>
                <th>Valor</th>
                <th>Quantidade</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${produtoList}" var="produto">
            <tr>
                <td>${produto.nome}</td>
                <td>${produto.valor}</td>
                <td>${produto.quantidade}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    </body>
</html>
