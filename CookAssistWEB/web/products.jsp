<%@ include file="header.jsp" %>
<div id="total-registro">
    <div id="cabeza-registro">Todos los Productos</div>
    <div id="cuerpo-registro">

        <c:if test="${not empty Products}">
            <c:forEach items="${Products}" var="pro">
                <div class="card" style="width: 12rem;">
                    <img src="./img/pc.png" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">${pro.getName()}</h5>
                        <p class="card-text">${pro.getDescription()}</p>
                        <p class="card-text">${pro.getUser()}</p>
                        <p class="card-text">${pro.getCode()}</p>
                        <a href="#" class="btn btn-primary">Comprar</a>
                    </div>
                </div>



            </c:forEach>
        </c:if>

    </div>
</div>
<%@ include file="footer.jsp" %>