<%@ include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div>
    <div class="container">
        <div class="row">
            <div class="col-sm-12 col-sm-offset-0">
                <form method="POST" action="./createproduct" class="form">
                    <fieldset>

                        <!-- Form Name -->
                        <h2 class="text-center"><b>Agregar un producto</b><p>
                            </p>
                            <small>Recuerda rellenar todos los campos</small></h2>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="control-label col-sm-4" for="textinput">Nombre del producto:</label>
                            <div class="col-sm-8">
                                <input type="text" name="prod_name" placeholder="Ingrese el nombre del producto" class="form-control">
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-sm-4 control-label"  for="textinput">Descripción:</label>
                            <div class="col-sm-8">
                                <input type="text" name="prod_desc" placeholder="Describa brevemente el producto" class="form-control">
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-sm-4 control-label"  for="textinput">Precio:</label>
                            <div class="col-sm-8">
                                <input type="text" name="prod_price" placeholder="Ingrese el precio sin puntos ni comas, solo el numero" class="form-control">
                            </div>
                        </div>

                        <!-- Text input-->
                        <!-- Text input-->

                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="pull-right">
                                    <button type="reset" class="btn btn-secondary">Cancel</button>
                                    <button type="submit" class="btn btn-info">Save</button>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div><!-- /.row -->
        </div>
        
    </div> 
    
    <c:if test = "${succes_created eq 1}">
        <div class="alert alert-success" role="alert">
            Producto creado correctamente. Ya puedes <a href="./products" class="alert-link">ver tus productos </a>
        </div>
    </c:if>
    <c:if test = "${succes_created eq 0}">
        <div class="alert alert-danger text-center" role="alert">
            Campos Incompletos
        </div>
    </c:if>
</div>


<%@ include file="footer.jsp" %>