<%@ include file="header.jsp" %>
<div id="total-registro">
    <div id="cabeza-registro">Registro</div>
    <div id="cuerpo-registro">
        <form method="POST" action="./registryServlet">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputName">Nombres</label>
                    <input type="text" class="form-control" name="first-name" placeholder="Nombres">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputLastName">Apellidos</label>
                    <input type="text" class="form-control" name="last-name" placeholder="Apellidos">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputEmail">Email</label>
                    <input type="email" class="form-control" name="email" placeholder="Email">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputPassword">Password</label>
                    <input type="password" class="form-control" name="password" placeholder="Password">
                </div>
            </div>
            <div>
                Fecha nacimiento: <input type="date" name="birthday" step="1" min="1980-01-01">
            </div>



            <div id="boton-registro" class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">Registrarme</button>
                </div>
            </div>

        </form>


    </div>

</div>
<c:if test="${not empty users}">
    <table class="tg">
        <tr>
            <th width="80">Nombre</th>
            <th width="120">Correo</th>
            <th width="120">Pass</th>
        </tr>
        <c:forEach items="${users}" var="pro">
            <tr>
                <td>${pro.getName()}</td>
                <td>${pro.getEmail()}</td>
                <td>${pro.getPassword()}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<%@ include file="footer.jsp" %>