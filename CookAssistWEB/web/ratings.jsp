<%@ include file="header.jsp" %>
<div id="total-producto" >
    <div  class="row" >
        <c:if test="${not empty user_rating}">
            <c:forEach items="${user_rating}" var="rates">
                <div id="cuerpo-producto" class="col-md-4 col-xs-12 col-sm-6 col-xl-3" style="margin-top: 2.5%;margin-left: 2.5%;margin-right: 2.5%;">
                    <div class="card" style="width: auto;">
                        <div class="card-body">
                            <h5 class="card- text-center">${rates.getProduct().getName()}</h5>
                            <p> </p>
                            <h4 class="card-text">Tu Calificación: ${rates.getScore()} puntos</h4>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </c:if>

    </div>
</div>
<c:if test="${empty user_rating}">
    <h1 style="margin-top: 100px;margin-bottom: 300px;text-align:  center;">¡Vaya, no tienes Calificaciones aun!</h1>
</c:if>

<%@ include file="footer.jsp" %>