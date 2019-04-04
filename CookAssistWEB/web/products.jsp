<%@ include file="header.jsp" %>
<div id="total-producto">
    <div  class="row">
        <c:if test="${not empty Products}">
            <c:forEach items="${Products}" var="pro">
                <div id="cuerpo-producto" class="col-md-4 col-xs-12 col-sm-6 col-xl-3">
                    <div class="card" style="width: auto;">
                        <div class="card-body">
                            <h5 class="card- text-center">${pro.getName()}</h5>
                            <p> </p>
                            <p class="card-text">Descripción: ${pro.getDescription()}</p>
                            <p class="card-text">Distribuidor: ${pro.getAdmin()}</p>
                            <p class="card-text">ID: ${pro.getCode()}</p>
                            <form method="GET" action="./createorder">
                                <input type="hidden" name="code_order" value="${pro.getCode()}"/>
                                <c:if test="${loged}">
                                    <div class="text-center">
                                    <button type="submit" class="btn btn-success"><i class="fas fa-cart-plus"></i> Añadir al Carrito: ${pro.getPrice()}$</button>
                                    </div>
                                </c:if>
                                <c:if test="${not loged}">
                                    <div class="text-center">
                                        <button class="btn btn-danger" disabled><i class="fa fa-exclamation-circle"></i> Inicia sesión para poder comprar </button>
                                    </div>
                                </c:if>
                                    
                            </form>
                        </div>
                    </div>


                </div>
            </c:forEach>

        </c:if>
    </div>
</div>

<%@ include file="footer.jsp" %>