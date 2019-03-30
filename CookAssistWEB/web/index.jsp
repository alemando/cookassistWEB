<%@ include file="header.jsp" %>
        <main role="main">
            <section>
                <div class="container slider_container">
                    <div class="col-md-12">
                        <div id="carousel_1" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#carousel_1" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel_1" data-slide-to="1"></li>
                                <li data-target="#carousel_1" data-slide-to="2"></li>
                            </ol>
                            <div class="carousel-inner" role="listbox">
                                <%-- LAS IMAGENES DEL SLIDER NO SON PRODUCTOS, SOLO ES PRESENTACION
                                LOS PRODUTOS VAN EN LAS COUMNAS DE ABAJO
                                <div class="carousel-item active">
                                    <img src="./img/comida_rapida_sedentarismo.jpg" width="700" height="400" class="img-responsive" alt="">
                                    <div class="carousel-caption">
                                        <h3>Slide 1</h3>
                                        <p class="p1">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ea earum, dolorem nesciunt repellendus odit aperiam, necessitatibus commodi accusantium architecto consectetur ab, quo laudantium? Consectetur rerum autem hic assumenda velit exercitationem.</p>
                                    </div>
                                </div>
                                --%>
                                <div class="carousel-item active">
                                    <img src="./img/img_slider_2.png" width="700" height="400" class="img-responsive" alt="">
                                    <div class="carousel-caption">
                                        <h3>Slide 1</h3>
                                        <p class="p1">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ea earum, dolorem nesciunt repellendus odit aperiam, necessitatibus commodi accusantium architecto consectetur ab, quo laudantium? Consectetur rerum autem hic assumenda velit exercitationem.</p>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img src="./img/img_slider_1.png" width="700" height="400" class="img-responsive" alt="">
                                    <div class="carousel-caption">
                                        <h3>Slide 2</h3>
                                        <p class="p1">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ea earum, dolorem nesciunt repellendus odit aperiam, necessitatibus commodi accusantium architecto consectetur ab, quo laudantium? Consectetur rerum autem hic assumenda velit exercitationem.</p>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img src="./img/img_slider_3.png" width="700" height="400" class="img-responsive" alt="">
                                    <div class="carousel-caption">
                                        <h3>Slide 3</h3>
                                        <p class="p1">Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ea earum, dolorem nesciunt repellendus odit aperiam, necessitatibus commodi accusantium architecto consectetur ab, quo laudantium? Consectetur rerum autem hic assumenda velit exercitationem.</p>
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
            <div class="container-fluid">
                <section class="main row">
                    <%--
                    <article class="col-xs-12 col-sm-8 col-md-9">
                        <p> 
                            Lorem ipsum, dolor sit amet consectetur adipisicing elit. Corrupti minus, soluta suscipit laudantium accusantium nobis voluptate quas provident perspiciatis modi fuga illum deleniti libero enim commodi voluptatem doloremque non nostrum!
                        </p>
                    </article>
                    
                    <aside class="col-xs-12 col-sm-4 col-md-3">
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorem est cupiditate beatae expedita eius quis rem facere, suscipit assumenda amet cumque quaerat accusantium quam minima, libero tempore exercitationem iure deserunt!
                        </p>
                    </aside>
                    --%>
                </section>
                <div class=" row gradient_in" >
                    <div class="col-xs-12 col-sm-6 col-md-3 ">
                        <p>
                            <h3>Columna</h3>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorem est cupiditate beatae expedita eius quis rem facere, suscipit assumenda amet cumque quaerat accusantium quam minima, libero tempore exercitationem iure deserunt!
                        </p>
                    </div>
                    <div class=" col-xs-12 col-sm-6 col-md-6 ">
                        <p>
                            <h3>Columna</h3>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorem est cupiditate beatae expedita eius quis rem facere, suscipit assumenda amet cumque quaerat accusantium quam minima, libero tempore exercitationem iure deserunt!
                        </p>
                    </div>

                    <div class="col-xs-12 col-sm-6 col-md-3 ">
                        <p>
                            <h3>Columna</h3>
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorem est cupiditate beatae expedita eius quis rem facere, suscipit assumenda amet cumque quaerat accusantium quam minima, libero tempore exercitationem iure deserunt!
                        </p>
                    </div>
                </div>
            </div>
        </main>
<%@ include file="footer.jsp" %>

    
