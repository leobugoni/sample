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
        <title>Página inicial</title>
    </head>
    <body>
        <div class="col-sm-12 col-md-12 col-lg-12">
            ${hello}
        </div
        <div class="col-sm-12 col-md-12 col-lg-12">
            <table>
                <tbody>
                    <tr>
                        <td><a class="btn btn-info" role="button" href="../produto/lista">Listar Produtos</a></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
