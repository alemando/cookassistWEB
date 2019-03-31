<%-- 
    Document   : processingorders
    Created on : 31/03/2019, 10:42:31 AM
    Author     : pipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang='es'>
    <script LANGUAGE="JavaScript">
        function redireccionar(page)
        {
            location.href = page
        }

    </script>
    <head>
        <meta charset="utf-8">
        <title>CookAssist</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel=icon href=./img/favicon.png sizes="32x32" type="image/png">
        <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="./css/style.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    </head>
    <body>

        <div class="text-center"><h1>¡AGREGADO A TUS PEDIDOS!</h1><h2>Puedes concluir la compra en "Mis Carrito"</h2><h3>¿Que deseas seguir haciendo?</h3></div>

        <p></p>
        <p></p>

        <div class="text-center">
            <button onclick='return redireccionar("./orders");' class="btn btn-info btn-lg"><i class="fas fa-shopping-cart"></i>  Ir a mi Carrito</button> 
            <button onclick='return redireccionar("./products");' class="btn btn-success btn-lg"><i class="fas fa-cart-plus"></i>  Seguir Comprando</button> 
        </div>








        <script src="./js/jquery-3.3.1.min.js"></script>
        <script src="./js/bootstrap.min.js"></script>


    </body>
</html>