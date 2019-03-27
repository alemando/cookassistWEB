<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css"></link>
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<%@ include file="header.jsp" %>


<div class="container-fluid">
    <h2 class="text-center"><b>Lista de Productos</b><p>
        </p>
        <small>Aquí podrás ver la lista de todos nuestros productos</small></h2>
        <c:if test="${not empty products}">
        <table class="table table-striped table-condensed ">
            <thead>
                <tr>  
                    <th>Código</th>
                    <th>Nombre del Producto</th>
                    <th>Descripción del Producto</th>
                    <th>Categoría</th>
                    <th>Activo</th>
                </tr>
            </thead>
            <c:forEach items="${products}" var="pro">
                <tr>
                    <td>${pro.getCode()}</td>
                    <td>${pro.getName()}</td>
                    <td>${pro.getDescription()}</td>
                    <td>${pro.getCategory()}</td>
                    <td>${pro.getAvaliable()}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>

<%@ include file="footer.jsp" %>