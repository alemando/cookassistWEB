<%@ include file="header.jsp" %>
<div id="cuadro-login-total">
<div id="cuadro-login">
    <div id="cabeza-login">Iniciar sesion</div>
    <div id ="cuerpo-login">
        <form>
            <div class="form-group row">
                <label for="inputEmail3" class="col-sm-2 col-form-label">Correo</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="email" placeholder="Correo">
                </div>
            </div>
            <div class="form-group row">
                <label for="inputPassword3" class="col-sm-2 col-form-label">Contraseña</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="pass" placeholder="Password">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-secondary">Acceder</button>
                </div>
            </div>
        </form>
    </div>

</div>
<div id = "cuadro-enlaces-registro">
    <div id ="cabeza-login">¿No registrado?</div>
    <div id="enlaces-registro">
        <a href="login.jsp">Registrese aquí</a>
    </div>

</div>
<div id = "cuadro-enlaces-registro">
    <div id ="cabeza-login">¿Problemas con el registro?</div>
    <div id="enlaces-registro">
        <a href="login.jsp">Contactenos aquí</a>
    </div>

</div>
</div>
<%@ include file="footer.jsp" %>
