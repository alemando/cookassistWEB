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
                            <p> </p>
                            <c:if test="${loged}">
                                <p> </p>
                                <p> </p>
                                <div class="text-center">
                                    <form method="GET" action="./rateProducts">
                                        <label class="my-1 mr-2" for="inlineFormCustomSelectPref">¿Quieres dar una Calificacion a este Producto?</label>
                                        <select class="custom-select my-1 mr-sm-2" name="calification">
                                            <option value="0" selected>Sin Calificación</option>
                                            <option value="1">Malo</option>
                                            <option value="2">Bueno</option>
                                            <option value="3">Excelente</option>
                                        </select>
                                        <p> </p>
                                        <input type="hidden" name="code_prod" value="${pro.getCode()}">
                                        <button type="submit" class="btn btn-warning"><i class="fas fa-star"></i> Calificar</button>
                                    </form>
                                </div>
                            </c:if>


                        </div>
                    </div>


                </div>
            </c:forEach>

        </c:if>
    </div>
</div>

<%@ include file="footer.jsp" %>