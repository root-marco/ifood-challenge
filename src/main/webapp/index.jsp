<!DOCTYPE html>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import="br.com.ifood.dao.RestauranteDAO" %>
<%@ page import="br.com.ifood.entities.Restaurante" %>
<html lang="pt-BR">

<head>
    <title>Restaurantes</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

<h1>Cadastrar restaurante:</h1>

<form action="RestauranteServlet" method="post">
    <table>
        <tr><td>CPNJ:</td><td><input type="text" name="cnpj"/></td></tr>
        <tr><td>Raz?o Social:</td><td><input type="text" name="razaoSocial"/></td></tr>
        <tr><td>Nome do Restaurante:</td><td><input type="text" name="nomeRestaurante"/></td></tr>
        <tr><td>Telefone do Restaurante:</td><td><input type="text" name="telefoneRestaurante"/></td></tr>
        <tr><td>Especialidade:</td><td><input type="text" name="especialidade"/></td></tr>

        <tr><td>Email:</td><td><input type="email" name="email"/></td></tr>
        <tr><td>Celular:</td><td><input type="text" name="celular"/></td></tr>
        <tr><td>Nome Completo:</td><td><input type="text" name="nomeCompleto"/></td></tr>
        <tr><td>CPF:</td><td><input type="text" name="CPF"/></td></tr>
        <tr><td>RG:</td><td><input type="text" name="RG"/></td></tr>

        <tr><td colspan="2"><input type="submit" value="Enviar"/></td></tr>
    </table>
</form>

<table>
    <c:forEach var="restaurante" items="$(restaurantes)">
        RestauranteDAO restauranteDAO = new RestauranteDAO();
        List<Restaurante> restaurantes = restauranteDAO.getAll();
        for (Restaurante restaurante : restaurantes) {

    <tr>
        <td><% restaurante.getNomeRestaurante(); %></td>
        <td>Especialidade</td>
        <td>Telefone</td>
    </tr>
    </c:forEach>



    <tr>
        <td></td>
    </tr>
        %>
</table>

</body>
</html>