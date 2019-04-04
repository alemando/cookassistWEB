
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<footer>

    <div class="container ">
        <div class="row ">
            <div class="col-xs-12 col-sm-12 col-md-3">
                <div class="text-center">
                    <h4>¡Conoce un poco más sobre nosotros!</h4>
                    <h3>¿Qué es CookAssist?</h3>
                    <p>¡Un lugar donde encontraras comida por montones!, puedes echar un vistazo y antojarte de lo que quieras. Pero no lo olvides, queremos que consumas comida de calidad y por eso si tienes un inconveniente puedes contactarnos <a href="#" class="alert-link">aquí :)</a>
                </div>
            </div>
            <div class="col-sm-12 col-md-6" align="center">
                <div>
                    <h4>Información</h4>
                    <ul class="link-list" >
                        <li>
                            <a style="color:white;" href="./">Inicio</a>
                        </li>
                        <li>
                            <a style="color:white;" href="#">Terminos y condiciones</a>
                        </li>
                        <li>
                            <a style="color:white;" href="#">Política de privacidad</a>
                        </li>
                        <li>
                            <a style="color:white;" href="#">Sobre nosotros</a>
                        </li>
                        <li>
                            <a style="color:white;" href="#">Trabaja con nosotros</a>
                        </li>
                        <li>
                            <a style="color:white;" href="#">Contacto</a>
                        </li>
                        <li>
                            <p style="color:white;" href="#"> </p>
                        </li>

                    </ul>
                </div>
            </div>
            <div class="col-sm-12 col-md-3">
                <div class="text-center" >
                    <h4 >¡Nuevas Noticias!</h4>
                    <p >  Estamos felices de decirte que vamos a lanzar nuestro sitio web al mundo entero!. <b>¡Mantente al tanto en nuestras redes sociales! :)</b>
                </div>
            </div>
        </div>

        <div id="sub_footer" class="row">
            <div class=" col-md-6">
                <div class="copyright">
                    <p>&copy; CookAssist - All Rigths Reserved</p>
                    <div class="credits">
                        Designed by Team 6
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <ul class="social_network">
                    <li>
                        <a href="#" data-placement="top" title="Facebook"><i class="fab fa-facebook"></i></a> 
                    </li>
                    <li>
                        <a href="#" data-placement="top" title="Twitter"><i class="fab fa-twitter"></i></a> 
                    </li>
                    <li>
                        <a href="#" data-placement="top" title="Instagram"><i class="fab fa-instagram"></i></a> 
                    </li>
                </ul>
            </div>

        </div>
    </div>
    <c:if test="${loged}">
        <c:if test="${empty session_user}">
            <script type="text/javascript">
                window.location = "./logout";
            </script>
        </c:if>
    </c:if>
</footer>
<script src="./js/jquery-3.3.1.min.js"></script>
<script src="./js/bootstrap.min.js"></script>


</body>
</html>