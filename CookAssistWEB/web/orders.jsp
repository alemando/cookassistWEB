
<%@ include file="header.jsp" %>

<div id="cuadro-order">
    <h4 id="cabeza-order" class="text-center">Hola! ${session_user.getName()}, estos son tus productos en carrito: </h4>
    <div id="cuerpo-order">

        <div  class="row">
            <c:if test="${not empty user_orders}">
                <c:forEach items="${user_orders}" var="ord">
                    <c:if test="${not ord.getFinish()}">
                        <div id="cuerpo-producto" class="col-md-4 col-xs-12 col-sm-6 col-xl-3">
                            <div class="card" style="width: auto;">
                                <img src="./img/CookAssistLogo-3.png" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <h5 class="card- text-center">${ord.getProduct().getName()}</h5>
                                    <p class="card-text">Descripción: ${ord.getDescription()}</p>
                                    <p class="card-text">ID: ${ord.getCode()}</p>
                                    <p class="card-text">Comprador: ${ord.getUser().getName()}</p>
                                    <p class="card-text">Vendedor: CookAssist</p>    
                                    <p class="card-text">Precio Total: ${ord.getPrice()}</p>
                                    <form method="POST" action="./createBill">
                                        <input type="hidden" name="code_order_2" value="${ord.getCode()}"/>
                                        <button class="btn btn-success"><i class="fas fa-check"></i> Finalizar Compra</button>
                                    </form>
                                </div>
                            </div>


                        </div>
                    </c:if>
                </c:forEach>
                
            </c:if>
        </div>
        
    </div>    
</div>    

<%@ include file="footer.jsp" %>
=======
<%@ include file="header.jsp" %>

<div id="cuadro-order">
    <h4 id="cabeza-order" class="text-center">Hola! ${session_user.getName()}, estos son tus productos en carrito: </h4>
    <div id="cuerpo-order">

        <div  class="row">
            <c:if test="${not empty user_orders}">
                <c:forEach items="${user_orders}" var="ord">
                    <c:if test="${not ord.getFinish()}">
                        <div id="cuerpo-producto" class="col-md-4 col-xs-12 col-sm-6 col-xl-3">
                            <div class="card" style="width: auto;">
                                <div class="card-body">
                                    <h5 class="card- text-center">${ord.getProduct().getName()}</h5>
                                    <p> </p>
                                    <p class="card-text">Descripción: ${ord.getDescription()}</p>
                                    <p class="card-text">ID: ${ord.getCode()}#${ord.getUser().getName()}</p>
                                    <p class="card-text">Precio Total: ${ord.getPrice()}</p>
                                    <form method="POST" action="./createBill">
                                        <input type="hidden" name="code_order_2" value="${ord.getCode()}"/>
                                        <button class="btn btn-success"><i class="fas fa-check"></i> Finalizar Compra</button>
                                    </form>
                                </div>
                            </div>


                        </div>
                    </c:if>
                </c:forEach>

            </c:if>
        </div>
        <c:if test="${empty user_orders}">
            <div class="text-center">
                <img style="margin-top: 2.5%" src="./img/error.png" width="256" height="256" >
            </div>
            <h1 style="margin-bottom: 5%;text-align:  center;">¡Vaya, no tienes Pedidos!</h1>
        </c:if> 
    </div>    
</div>


<%@ include file="footer.jsp" %>
