<%@ include file="header.jsp" %>
    <div id="cuadro-user">
        <div id="cabeza-user">Pedido</div>
        <div id="cuerpo-user">
            <form>
                <div class="form-group row ">
                    <label for="user" class="col-xs-12 col-sm-6 col-md-2 col-form-label">Usuario</label>
                    <div class="col-xs-12 col-sm-6 col-md-10">
                    </div>
                </div>    
                <div class="form-group row ">
                    <label for="productos_disp" class="col-xs-12 col-sm-6 col-md-2 col-form-label">Productos Disponibles</label>
                    <div class="col-xs-12 col-sm-6 col-md-10">
                        <select name="OS">
                            <option selected value="0"> Elige una opción </option>
                            <option value="1">Hamburguesa</option> 
                            <option value="2">Fideos</option> 
                            <option value="3">Arroz</option>
                        </select>    
                    </div>
                </div>
                <div class="form-group row ">
                    <label for="description" class="col-xs-12 col-sm-6 col-md-2 col-form-label">Descripcion</label>
                    <div class="col-xs-12 col-sm-6 col-md-10">
                        <input type="text" class="form-control" id="pass" placeholder="Descripcion">
                    </div>
                </div>
                <div class="form-group row ">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-secondary">Enviar</button>
                    </div>
                </div>
            </form>
        </div>    
    </div>    

<%@ include file="footer.jsp" %>
