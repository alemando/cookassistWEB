<%@ include file="header.jsp" %>
<div id="cuadro-total">
    <div id="cuadro-login">
        <div id="cabeza-login">Iniciar sesion</div>
        <div id ="cuerpo-login">
            <form method="POST" action="./loginServlet">
                <div class="form-group row">
                    <label for="inputEmail" class="col-sm-2 col-form-label">Correo</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" name="email" placeholder="Correo">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">Contraseña</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" name="pass" placeholder="Password">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Acceder</button>
                    </div>
                </div>
            </form>
        </div>

    </div>
    <div id = "cuadro-registro">
        <div id ="cabeza-login">¿No registrado?</div>
        <div id="enlaces-registro">
            <a href="registry.jsp">Registrese aquí</a>
        </div>

    </div>
    <div id = "cuadro-registro">
        <div id ="cabeza-login">¿Problemas con el registro?</div>
        <div id="enlaces-registro">
            <a href="login.jsp">Contactenos aquí</a>
        </div>

    </div>
</div>

<%@ include file="footer.jsp" %>
