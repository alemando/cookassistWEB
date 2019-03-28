<%@ include file="header.jsp" %>
<div id="cuadro-total">
    <div id="cuadro-login">
        <div id="cabeza-login">Iniciar sesion</div>
        <div id ="cuerpo-login">
            <form method="POST" action="./loginServlet">
                <div class="form-group row">
                    <label for="inputEmail" class="col-sm-2 col-form-label">Correo</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="email" placeholder="Correo">
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
                        <button type="submit" class="btn btn-info">Acceder</button>
                    </div>
                </div>
            </form>
        </div>



    </div>
    <c:if test = "${error eq 2}">
        <div class="alert alert-danger" role="alert">
            Datos Incorrectos
        </div>
    </c:if>
    <c:if test = "${loged}">
        <script type="text/javascript">
            window.location = "./Index";
        </script>
    </c:if>
    <div id = "cuadro-registro">
        <div id ="cabeza-login">¿No registrado?</div>
        <div id="enlaces-registro">
            <a href="./registryServlet">Registrese aquí</a>
        </div>

    </div>
    <div id = "cuadro-registro">
        <div id ="cabeza-login">¿Problemas con el registro?</div>
        <div id="enlaces-registro">
            <a href="./Index">Contactenos aquí</a>
        </div>

    </div>
</div>

<%@ include file="footer.jsp" %>
