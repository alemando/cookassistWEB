<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css"></link>
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<%@ include file="header.jsp" %>


<div class="container-fluid">
            <h2 class="text-center"><b>Lista de Productos</b><p>
        </p>
        <small>Aquí podrás ver la lista de todos nuestros productos</small></h2>
    <table class="table table-striped table-condensed ">
        <thead>
            <tr>  
                <th>Username</th>
                <th>Date registered</th>
                <th>Role</th>
                <th>Status</th>                                          
            </tr>
        </thead>   
        <tbody>
            <tr>
                <td>Donna R. Folse</td>
                <td>2012/05/06</td>
                <td>Editor</td>
                <td><span class="label label-success">Active</span>
                </td>                                       
            </tr>
            <tr>
                <td>Emily F. Burns</td>
                <td>2011/12/01</td>
                <td>Staff</td>
                <td><span class="label label-important">Banned</span></td>                                       
            </tr>
            <tr>
                <td>Andrew A. Stout</td>
                <td>2010/08/21</td>
                <td>User</td>
                <td><span class="label">Inactive</span></td>                                        
            </tr>
            <tr>
                <td>Mary M. Bryan</td>
                <td>2009/04/11</td>
                <td>Editor</td>
                <td><span class="label label-warning">Pending</span></td>                                       
            </tr>
            <tr>
                <td>Mary A. Lewis</td>
                <td>2007/02/01</td>
                <td>Staff</td>
                <td><span class="label label-success">Active</span></td>                                        
            </tr>                                   
        </tbody>
    </table>
</div>

<%@ include file="footer.jsp" %>