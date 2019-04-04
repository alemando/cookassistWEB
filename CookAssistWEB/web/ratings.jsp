<%@ include file="header.jsp" %>
<div id="cuadro-order">
    <h4 id="cabeza-order" class="text-center">Hola! ${session_user.getName()}, este es tu historial de Calificaciones: </h4>
    <div id="cuerpo-order">
        <c:if test="${not empty user_rating}">
            <c:forEach items="${user_rating}" var="rates">
                <div id="cuerpo-producto" class="col-md-4 col-xs-12 col-sm-6 col-xl-3" style="margin-top: 2.5%;margin-left: 2.5%;margin-right: 2.5%;">
                    <div class="card" style="width: auto;">
                        <div class="card-body">
                            <h4 class="card-text-center">${rates.getProduct().getName()}</h4>
                            <p></p>
                            <p class="card-text-center">${rates.getProduct().getDescription()}</p>
                            <p> </p>
                            <h6 class="card-text">Tu Calificación: ${rates.getScore()} puntos</h6>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </c:if>


        <c:if test="${empty user_rating}">
            <div class="text-center">
                <img style="margin-top: 2.5%" src="./img/error.png" width="256" height="256" >
            </div>
            <h1 style="margin-bottom: 5%;text-align:  center;">¡Vaya, no tienes Calificaciones!</h1>
        </c:if>

</div>
</div>

<%@ include file="footer.jsp" %>