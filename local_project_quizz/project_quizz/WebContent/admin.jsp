<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="entidades.*,java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

	<meta http-equiv="cache-control" content="max-age=0" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />
	<meta http-equiv="expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
	<meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta content="IE=11.0000" http-equiv="X-UA-Compatible">
    <meta charset="utf-8" />
    <meta name="ROBOTS" content="NONE, NOARCHIVE">
    <meta name="GOOGLEBOT" content="NOARCHIVE">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>YipiQuizzes</title>
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
   	<link rel="stylesheet" href="static/Content/Site.css">
</head>
<body>
	  <br/><br/>
	  <a href="doDesconectar" class="btn btn-default btn-primary" style="width:200px" >Cerrar sesión</a>	  
	  <br/><br/>
<div class="container">
<center>
<h2>Lista de usuarios</h2>
</center>

	<c:if test="${!empty requestScope.usuarios}">
		<table class="table table-striped table-bordered" style="background-color:white">
			<thead>
				<tr>
					<th>Nick</th>
					<th>Email</th>
					<th>Avatar</th>
					<th>Puntos</th>
					<th>RolValue</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
			
			<c:forEach var="us" items="${requestScope.usuarios}" >
				<tr>
				<td>${us.nick}</td>
				<td>${us.email}</td>
				<td>${us.avatar}</td>
				<td>${us.points}</td>
				<td>${us.rolValue}</td>
				<td><a href="doEliminar?idUser=${us.idUser}">Eliminar</a></td>
				</tr>
			</c:forEach>
			
			</tbody>
		</table>
	</c:if>
	<a href="toMenu" class="badge badge-info">Volver</a>
</div>

<!-- 	FOOTER   -->
	<footer>
         <div class="col-lg-12 footer footer-bg" id="Contentplaceholder1_T500AB9DB003_Col00" data-sf-element="Container" data-placeholder-label="Container">
             <hr />
             <div class="row">
                 <div class="col-lg-4">
                     <h4 class="white-letters-footer">Conecta con nosotros</h4>
                     <ul>
                         <li>
                             <a href="#"><i class="fa fa-facebook-square fa-2x icon" aria-hidden="true"></i> &nbsp;Facebook</a>
                         </li>
                         <li>
                             <a href="#"><i class="fa fa-twitter-square fa-2x icon" aria-hidden="true"></i> &nbsp;Twitter</a>
                         </li>
                     </ul>
                 </div>
                 <div class="col-lg-4">
                     <h4 class="white-letters-footer">Nuestros Quizzies</h4>
                     <ul>                       
                         <li>
                             <a href="#"><i class="fa fa-google-plus-square fa-2x icon" aria-hidden="true"></i> &nbsp;Google+</a>
                         </li>
                         <li>
                             <a href="#"><i class="fa fa-instagram fa-2x icon" aria-hidden="true"></i> &nbsp;Instagram</a>
                         </li>
                     </ul>
                 </div>
                 <div class="col-lg-4">
                     <h4 class="white-letters-footer">Mapa web</h4>
                     <ul>
                         <li>
                             <a href="#"><i class="fa fa-facebook-square fa-2x icon" aria-hidden="true"></i> &nbsp;Facebook</a>
                         </li>
                         <li>
                             <a href="#"><i class="fa fa-twitter-square fa-2x icon" aria-hidden="true"></i> &nbsp;Twitter</a>
                         </li>
                     </ul>
                 </div>
             </div>
             <div class="row col-lg-12">
                 <hr />
                 <span class="text-center">Copyright 2019 Yipi Quizz</span>
             </div>
         </div>	
     </footer>	

</body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"
            integrity="sha256-VazP97ZCwtekAsvgPBSUwPFKdrwD3unUfSGVYrahUqU="
            crossorigin="anonymous"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>	
</html>