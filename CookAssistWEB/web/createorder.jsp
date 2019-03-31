<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang='es'>
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
        <div id="cuadro-total">
            <div id="cuadro-login">
                <div id="cabeza-login">¿Quieres Agregarlo(s) a tu Carrito ${session_user.getName()}?</div>
                <div id ="total-producto">
                    <c:choose>
                        <c:when test="${not empty product_code}">
                            <form method="GET" action="./processingOrders">
                                <div class="card text-center">
                                    <div class="card-header">
                                        Confirmar Pedido
                                    </div>

                                    <div class="card-body">
                                        <h5 class="card-title">${product_code.getName()}</h5>
                                        <p class="card-text">${product_code.getDescription()}</p>
                                        <label>Cantidad: </label>
                                        <input type="number" name="quantity" placeholder="Cantidad" min="1" max="10" value="1">
                                        <p></p>
                                        <label>Precio: </label>
                                        <font size="5">${product_code.getPrice()}$ </font> <label class="text-muted">por Unidad</label>
                                        <p></p>
                                        <input type="hidden" name="code_order" value="${product_code.getCode()}"/>
                                        <button type="submit" class="btn btn-success"><i class="fas fa-cart-plus"></i> Añadir </button> 

                                        <a href="javascript:history.back(-1);" title="Ir la página anterior" class="btn btn-danger"><i class="fas fa-ban"></i> Cancelar</a>

                                    </div>
                                    <div class="card-footer text-muted">
                                        ID: ${product_code.getCode()}
                                    </div>
                                </div>
                            </form>
                        </c:when>
                        <c:otherwise>
                            <h1>¡Error!, no se encontro producto</h1>
                        </c:otherwise>
                    </c:choose>
                </div>




            </div>

        </div>
        <script src="./js/jquery-3.3.1.min.js"></script>
        <script src="./js/bootstrap.min.js"></script>


    </body>
</html>