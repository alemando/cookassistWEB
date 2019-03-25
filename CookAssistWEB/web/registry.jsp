<%@ include file="header.jsp" %>
<div id="total-registro">
    <div id="cabeza-registro">Registro</div>
    <div id="cuerpo-registro">
        <form>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputEmail4">Nombres</label>
                    <input type="email" class="form-control" id="inputEmail4" placeholder="Nombres">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputEmail4">Apellidos</label>
                    <input type="email" class="form-control" id="inputEmail4" placeholder="Apellidos">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputEmail4">Email</label>
                    <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
                </div>
                <div class="form-group col-md-6">
                    <label for="inputPassword4">Password</label>
                    <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
                </div>
            </div>
            <div>
                <select class="browser-default custom-select col-md-3">
                    <option selected>Año</option>
                    <option value="1">1990</option>
                    <option value="2">1991</option>
                    <option value="3">1992</option>
                    <option value="1">1993</option>
                    <option value="2">1994</option>
                    <option value="3">1995</option>
                    <option value="1">1996</option>
                    <option value="2">1997</option>
                    <option value="3">1998</option>
                    <option value="1">1999</option>
                    <option value="2">2000</option>
                    <option value="3">2001</option>
                    <option value="1">2002</option>
                    <option value="2">2003</option>
                    <option value="3">2004</option>
                    <option value="1">2005</option>
                    <option value="2">2006</option>
                    <option value="3">2007</option>
                    <option value="3">2008</option>
                    <option value="3">2009</option>
                    <option value="3">2010</option>
                    <option value="3">2011</option>
                    <option value="3">2012</option>
                    <option value="3">2013</option>
                    <option value="3">2014</option>
                    <option value="3">2015</option>
                    <option value="3">2016</option>
                    <option value="3">2017</option>
                    <option value="3">2018</option>
                    <option value="3">2019</option>

                </select>

                <select class="browser-default custom-select col-md-3">
                    <option selected>Mes</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>

                <select class="browser-default custom-select col-md-3">
                    <option selected>Dia</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
            </div>



            <div id="boton-registro" class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">Registrarme</button>
                </div>
            </div>
            
        </form>
    </div>

</div>
<%@ include file="footer.jsp" %>