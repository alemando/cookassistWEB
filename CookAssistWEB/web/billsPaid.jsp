<%@ include file="header.jsp" %>

<div id="cuadro-order">
    <h4 id="cabeza-order" class="text-center">Hola! ${session_user.getName()}, estas son tus facturas: </h4>
    <div id="cuerpo-order">

        <div  class="row">
            <c:if test="${not empty user_bills}">
                <c:forEach items="${user_bills}" var="bill">
                    <c:if test="${ bill.getCancelled()}">
                        <div id="cabeza-producto" class="col-md-4 col-xs-12 col-sm-6 col-xl-3">
                            <div class="card" style="width: auto;">
                                <img src="./img/CAlogo.png" width="250" height="44" class="container" >
                                <i class="text-center">Nit:12345678</i>
                                <i class="text-center">Tel:654321</i>
                                <p class="card- text container-fluid">Cliente: ${session_user.getName()}</p>
                                <p class="card- text container-fluid">Codigo ${bill.getCode()}</p>
                                <p class="card- text container-fluid">Fecha: ${bill.getDate()}</p>                
                                <div class="card-body">
                                    <h5 class="card_title">Detalles</h5>
                                    <div id="cuerpo-producto" class="">
                                        <div class="card-text-center" style="width: auto;">
                                            <div class="card-body">
                                                <p class="card-text"> Producto: ${bill.getOrder().getProduct().getName()}</p>
                                                <p class="card-text">Cantidad: ${bill.getOrder().getQuantity()}</p>
                                                <p class="card-text">Precio Total: ${bill.getOrder().getPrice()}</p>                                    
                                            </div>    
                                        </div>
                                    </div>
                                </div>            
                            </div>
                        </div>
                    </c:if>                
                </c:forEach>

            </c:if>

        </div> 
        <c:if test="${empty user_bills}">
            <div class="text-center">
                <img style="margin-top: 2.5%" src="./img/error.png" width="256" height="256" >
            </div>
            <h1 style="margin-bottom: 5%;text-align:  center;">¡Vaya, no tienes Facturas!</h1>
        </c:if> 
    </div>
</div>
<%@ include file="footer.jsp" %>
