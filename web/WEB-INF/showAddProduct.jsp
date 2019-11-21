<%-- 
    Document   : showAddProduct
    Created on : 13.11.2019, 22:55:48
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавление товара</title>
    </head>
    <body>
        <h1>Мода и одежда online</h1>
        <from action="addProduct" method="POST">
            Название товара:<br>
            <input type="text"  name="produktTitle"><br>
            Категория:<br>
            <input type="text"  name="categoria"><br>
            Размеры:<br>
            <input type="text"  name="size"><br>
            Цена товара:<br>
            <input type="text"  name="price"><br>
            Колличество:<br>
            <input type="text"  name="quantity"><br>
            <br>
            <input type="submit" value="Добавить товар"><br>
        </from>
    </body>
</html>
