<%@ include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div>
    <div class="container">
        <div class="row">
            <div class="col-sm-12 col-sm-offset-0">
                <form action="" class="form">
                    <fieldset>

                        <!-- Form Name -->
                        <h2 class="text-center"><b>Agregar un producto</b><p>
                            </p>
                            <small>Recuerda rellenar todos los campos</small></h2>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="control-label col-sm-4" for="textinput">Nombre del producto:</label>
                            <div class="col-sm-8">
                                <input type="text" placeholder="Ingrese el nombre del producto" class="form-control">
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="textinput">Descripción:</label>
                            <div class="col-sm-8">
                                <input type="text" placeholder="Describa brevemente el producto" class="form-control">
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="textinput">Precio:</label>
                            <div class="col-sm-8">
                                <input type="text" placeholder="Ingrese el precio sin puntos ni comas, solo el numero" class="form-control">
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="textinput">State</label>
                            <div class="col-sm-8">
                                <input type="text" placeholder="State" class="form-control">
                            </div>

                            <label class="col-sm-4 control-label" for="textinput">Postcode</label>
                            <div class="col-sm-8">
                                <input type="text" placeholder="Post Code" class="form-control">
                            </div>
                        </div>



                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="textinput">Country</label>
                            <div class="col-sm-8">
                                <input type="text" placeholder="Country" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="pull-right">
                                    <button type="submit" class="btn btn-default">Cancel</button>
                                    <button type="submit" class="btn btn-primary">Save</button>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div><!-- /.row -->
        </div>
    </div> 
</div>


<%@ include file="footer.jsp" %>