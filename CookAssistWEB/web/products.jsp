<%@ include file="header.jsp" %>
<div class="container">
    <div  class="row">
        <c:if test="${not empty Products}">
            
            <div class="card-columns">
                
            <c:forEach items="${Products}" var="pro">
                
                <div class="card" style="width: 18rem;">
                    <img src="./img/pc.png" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card- text-center">${pro.getName()}</h5>
                        <p class="card-text">${pro.getDescription()}</p>
                        <p class="card-text">${pro.getUser()}</p>
                        <p class="card-text">${pro.getCode()}</p>
                        <a href="#" class="btn btn-primary">Comprar</a>
                    </div>
                </div>

                

            </c:forEach>
            </div>
        </c:if>
        </div>
    </div>
    
<%@ include file="footer.jsp" %>