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
        
    </div>    
</div>    

<%@ include file="footer.jsp" %>
