<%@ include file="header.jsp" %>
<div id="cuadro-order" style="text-align: center;margin-left: 5%;margin-right: 5%;">
    <h4 id="cabeza-order" class="text-center">Estos son los usuarios actualmente: </h4>
    <div style="margin-bottom: 10px;" class="table-responsive table-striped" >
        <c:if test="${not empty admin_users}">
            <table class="tg">
                <tr >
                    <th width="20%">Nombre</th>
                    <th width="20%">Correo</th>
                    <th width="15%">Contraseña</th>
                    <th width="10%">Fecha de Nacimiento</th>
                    <th width="15%">Estado de cuenta</th>
                </tr>
                
                <c:forEach items="${admin_users}" var="pro">
                    <tr>
                        <td>${pro.getName()}</td>
                        <td>${pro.getEmail()}</td>
                        <td>${pro.getPassword()}</td>
                        <td>${pro.getBornDate()}</td>
                        <td><c:if test="${pro.getStatus()}">Administrador</c:if><c:if test="${not pro.getStatus()}">Corriente</c:if></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </div>
</div>
<%@ include file="footer.jsp" %>