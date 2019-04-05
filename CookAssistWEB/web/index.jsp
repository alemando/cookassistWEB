<%@ include file="header.jsp" %>
<main role="main">
    <section class="slider_container">
        <div >
            <div class="col-md-12 shadow-lg rounded " >
                <div id="carousel_1" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carousel_1" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel_1" data-slide-to="1"></li>
                        <li data-target="#carousel_1" data-slide-to="2"></li>
                        <li data-target="#carousel_1" data-slide-to="3"></li>
                    </ol>
                    <div class="carousel-inner" role="listbox">
                        <div class="carousel-item active">
                            <img src="./img/img_slider_2.png" width="500" height="200" class="img-responsive" alt="">
                            <div class="carousel-caption">
                                <h3>Cook Assist</h3>
                                <p class="p1">La mejor comida para todo momento</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="./img/img_slider_1.png" width="700" height="400" class="img-responsive" alt="">
                            <div class="carousel-caption">
                                <h3>Cook Assist</h3>
                                <p class="p1">La mejor comida para todo momento</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="./img/img_slider_3.png" width="700" height="400" class="img-responsive" alt="">
                            <div class="carousel-caption">
                                <h3>Cook Assist</h3>
                                <p class="p1">La mejor comida para todo momento</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="./img/imagen3.jpg" width="500" height="200" class="img-responsive" alt="">
                            <div class="carousel-caption">
                                <h3>Cook Assist</h3>
                                <p class="p1">La mejor comida para todo momento</p>
                            </div>
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carousel_1" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carousel_1" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
        </div>
    </section>
    <c:if test="${not loged}">
        <div class="text-center ">
            <div class="shadow-lg rounded">
                <div class="jumbotron">
                    <h1 class="display-4">Bienvenido a CookAssist</h1>
                    <p class="lead">Una simple tienda virtual de comida, donde podrás comprar, o simplemente guardar tus comidas favoritas para otro momento
                    <hr class="my-4">
                    <p>¿Qué desea hacer?</p>
                    <p class="lead">
                    <div class="btn-group" role="group" aria-label="Basic example">

                        <a class="btn btn-info btn-lg" href="./registry" role="button">Registrarse</a>
                        <a class="btn btn-info btn-lg" href="./login" role="button">Iniciar sesión</a>
                        <a class="btn btn-info btn-lg" href="./products" role="button">¡Ver productos disponibles!</a>


                    </div>
                    </p>
                </div>
            </div>
        </div>
    </c:if>
    <c:if test="${loged}">
        
    </c:if>
</main>
<%@ include file="footer.jsp" %>


