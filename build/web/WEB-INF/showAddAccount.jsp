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
        <title>Новый покупатель</title>
    </head>
    <body>
        <h1>Мода и одежда online</h1>
        <from action="addProduct" method="POST">
            Имя:<br>
            <input type="text"  name="name"><br>
            Фамилия:<br>
            <input type="text"  name="lastname"><br>
            Электронная почта:<br>
            <input type="text"  name="email"><br>
            сумма денег:<br>
            <input type="text"  name="money"><br>
            
            <br>
            <input type="submit" value="Добавить покупателя"><br>
    </from>
    </body>
</html>
