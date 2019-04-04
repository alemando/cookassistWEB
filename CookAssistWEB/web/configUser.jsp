<%@ include file="header.jsp" %>
<div id="cuadro-total-config-user">

    <div class="row">
        <div class="col-4" id="cuadro-selectores">
            <div class="list-group" id="list-tab" role="tablist">
                <a class="list-group-item list-group-item-action active" id="list-home-list" data-toggle="list" href="#list-home" role="tab" aria-controls="home">Cambiar Nombre</a>
                <a class="list-group-item list-group-item-action" id="list-profile-list" data-toggle="list" href="#list-profile" role="tab" aria-controls="profile">Cambiar Correo</a>
                <a class="list-group-item list-group-item-action" id="list-messages-list" data-toggle="list" href="#list-messages" role="tab" aria-controls="messages">Cambiar Contraseña</a>
                <a class="list-group-item list-group-item-action" id="list-settings-list" data-toggle="list" href="#list-settings" role="tab" aria-controls="settings">Volverse Admin</a>
            </div>
        </div>
        <div class="col-8" id="cuadro-config-user">
            <div >
                <div class="tab-content" id="nav-tabContent">
                    <div class="tab-pane fade show active" id="list-home" role="tabpanel" aria-labelledby="list-home-list">
                        <form method="POST" action="./configUser">
                            <p>Nombre Actual: ${session_user.getName()}</p>
                            <p>Apellido Actual: ${session_user.getLName()}</p>

                            <label>Cambiar Nombre: </label>
                            <input type="text" name="name" placeholder="Nombre" />
                            <label>Cambiar Apellido: </label>
                            <input type="text" name="lname" placeholder="Apellido"/>
                            <p></p>
                            <p></p>
                            <label>Confirmar Contraseña Actual: </label>
                            <input type="password" name="pass_n"/>
                            <p></p>
                            <input type="hidden" name="confirm_1" value="true"/>
                            <button type="submit" class="btn btn-success">Confirmar Cambios</button>                                    
                        </form>
                    </div>
                    <div class="tab-pane fade" id="list-profile" role="tabpanel" aria-labelledby="list-profile-list">
                        <form method="POST" action="./configUser">
                            <p>Correo Actual: ${session_user.getEmail()}</p>

                            <label>Cambiar Correo: </label>
                            <input type="email" name="email" placeholder="Correo"/>
                            <p></p>
                            <p></p>
                            <label>Confirmar Contraseña Actual: </label>
                            <input type="password" name="pass_e"/>
                            <p></p>
                            <input type="hidden" name="confirm_2" value="true"/>
                            <button type="submit" class="btn btn-success">Confirmar Cambios</button>                                    
                        </form>
                    </div>
                    <div class="tab-pane fade" id="list-messages" role="tabpanel" aria-labelledby="list-messages-list">
                        <form method="POST" action="./configUser">

                            <label>Nueva Contraseña: </label>
                            <input type="password" name="change_pass" placeholder="Nueva Contraseña"/>
                            <p></p>
                            <label>Confirmar Nueva Contraseña: </label>
                            <input type="password" name="change_pass_2" placeholder="Confirmar Nueva Contraseña"/>
                            <p></p>
                            <p></p>
                            <label>Confirmar Contraseña Actual: </label>
                            <input type="password" name="pass_c"/>
                            <p></p>
                            <input type="hidden" name="confirm_3" value="true"/>
                            <button type="submit" class="btn btn-success">Confirmar Cambios</button>                                    
                        </form>
                    </div>
                    <div class="tab-pane fade" id="list-settings" role="tabpanel" aria-labelledby="list-settings-list">
                        <form method="POST" action="./configUser">
                            <label>Introducir Codigo: </label>
                            <input type="password" name="code_admin" />
                            <input type="hidden" name="confirm_4" value="true"/>
                            <button type="submit" class="btn btn-success">Confirmar</button>                                    
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <c:if test="${error_config}">
        <div class="alert alert-danger text-center" role="alert">
            Campos Incompletos o Datos Incorrectos
        </div>
    </c:if>
</div>
<%@ include file="footer.jsp" %>