<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang='es'>
    <head>
        <meta charset="utf-8">
        <title>CookAssist</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel=icon href=./img/favicon.png sizes="32x32" type="image/png">
        <link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="./css/style.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-md fixed-top header_nav ">
                <a class="navbar-brand" href="./">
                    <img src="./img/CAlogo.png" width="199" height="44" alt="">
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar1">
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbar1">
                    <ul class="navbar-nav mr-auto ">
                        <c:choose>
                            <c:when test="${not loged}">
                                <li class="li_nav nav-item active">
                                    <a class="btn_nav btn nav-link" href="./"><i class="fas fa-home"></i> Inicio</a>
                                </li>
                                <li class="li_nav nav-item">
                                    <a class="btn_nav btn nav-link" href="./products"><i class="fas fa-box-open"></i> Productos</a>
                                </li>
                                <li class="li_nav nav-item">
                                    <a class="btn_nav btn nav-link" href="./"><i class="fas fa-user-check"></i> Datos Ficticios</a>
                                </li>
                            </c:when>
                            <c:otherwise>

                                <li class="li_nav nav-item active">
                                    <a class="btn_nav btn nav-link" href="./"><i class="fas fa-home"></i> Inicio</a>
                                </li>
                                <li class="li_nav nav-item">
                                    <a class="btn_nav btn nav-link" href="./products"><i class="fas fa-box-open"></i> Productos</a>
                                </li>
                                <li class="li_nav nav-item">
                                    <a class="btn_nav btn nav-link" href="./orders"><i class="fas fa-shopping-cart"></i> Mi Carrito <span class="badge badge-pill badge-danger">${fn:length(session_user.getOrder())}</span></a>
                                </li>
                                <li class="li_nav nav-item">
                                    <a class="btn_nav btn nav-link" href="./bills"><i class="fas fa-receipt"></i> Facturas</a>
                                </li>

                                <li class="li_nav nav-item">
                                    <a class="btn_nav btn nav-link" href="./"><i class="fas fa-user-check"></i> Datos Ficticios</a>
                                </li>
                                <li class="li_nav nav-item">
                                    <a class="btn_nav btn nav-link" href="./ratings"><i class="fas fa-star"></i> Calificaciones</a>
                                </li>
                                <c:if test="${session_user.getStatus()}">
                                    <li class="li_nav nav-item">
                                        <a class="btn_nav btn nav-link" href="./users"><i class="fas fa-users-cog"></i> Usuarios</a>
                                    </li>
                                </c:if>
                            </c:otherwise>
                        </c:choose>

                    </ul>
                    <c:choose>
                        <c:when test="${not loged}">
                            <ul class="navbar-nav ml-auto">
                                <li class="li_nav nav-item">
                                    <div class="btn-group btn_nav btn nav-link">
                                        <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-user"></i>
                                            Iniciar Sesión
                                        </button>
                                        <div class="dropdown-menu">
                                            <a class="dropdown-item" href="./login">Iniciar Sesión</a>
                                            <a class="dropdown-item" href="./registry">Registrarse</a>
                                            <a class="dropdown-item" href="./">Ir al Inicio</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">Contactenos</a>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </c:when>
                        <c:otherwise>
                            <ul class="navbar-nav ml-auto">
                                <li class="li_nav nav-item">
                                    <div class="btn-group btn_nav btn nav-link">
                                        <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-user"></i>
                                            <td>${session_user.getName()}</td>
                                        </button>
                                        <div class="dropdown-menu">
                                            <a class="dropdown-item" href="#">Ver Perfil</a>
                                            <a class="dropdown-item" href="#">Ver Mi Carrito</a>
                                            <a class="dropdown-item" href="#">Otra cosa</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="./logout">Cerrar Sesión</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">Contactenos</a>
                                            <c:if test="${session_user.getStatus()}">
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="./createproduct">Agregar Productos</a>
                                            </c:if>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </c:otherwise>
                    </c:choose>

                </div>
            </nav>
        </header>
        <%--xd--%>