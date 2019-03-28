<%@ include file="header.jsp" %>
<div id="total-registro">
    <div id="cabeza-registro">Registro</div>
    <div id="cuerpo-registro">
        <form method="POST" action="./registry">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputName">Nombre(s)</label>
                    <input type="text" class="form-control" name="first-name" placeholder="Nombre(s)">
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
                    <label for="inputPassword">Contraseña</label>
                    <input type="password" class="form-control" name="pass" placeholder="Contraseña">
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

    <c:if test = "${succes_registry eq 1}">
        <div class="alert alert-success text-center" role="alert">
            Registro Completado Correctamente
        </div>
    </c:if>
    <c:if test = "${succes_registry eq 0}">
        <div class="alert alert-danger text-center" role="alert">
            Campos Incompletos
        </div>
    </c:if>
    
</div>


<%@ include file="footer.jsp" %>
