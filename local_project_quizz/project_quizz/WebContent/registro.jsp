<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<!-- 	HEADER   -->
<header>
    <div class="navbar navbar-inverse navbar-fixed-top ">
        <div class="container">
            <div class="navbar-header pull-left">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
               
            </div>
            <div class="pull-right logo-home">
                <span class="logo-title"><label class="hidden-xs">Yippi<b>Quizzes</b></label>&nbsp;&nbsp;<img src="static/Content/images/quizz-logo.png" class="logo" /></span>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                     <li><a href="doRegresar">Inicio</a></li>
                    <li><a href="toNosotros">Quienes somos</a></li>
                    <li><a href="toMemoria">Antonio, mirad la memoria de nuestro proyecto aquí</a></li> 
                </ul>
            </div>            
        </div>
      </div>
 </header> 
 
 <!-- 	MAIN   -->
 <main>
 <br/><br/><br/>
<div class="container">
  <h1>Alta de Contacto</h1>
  <br/>
  <f:form action="doRegistar" method="post" modelAttribute="user">
  		<%--Los inputs sólo son texto. No poner type="text" --%>
	    <div class="input-group">
	  	 	<span class="input-group-addon">Nombre:</span>
	    	<f:input class="form-control" path="nombre" placeholder="Nombre" required="required"/>
		</div>
		<br/><br/>
		<div class="input-group">
	  	 	<span class="input-group-addon">Apellido:</span>
	    	<f:input  class="form-control" path="apellidos" placeholder="Apellido" required="required"/>
		</div>
		<br/><br/>
		<div class="input-group">
	  	 	<span class="input-group-addon">Avatar:</span>
	    	<f:input  class="form-control" path="avatar" placeholder="Avatar" required="required"/>
		</div>
		<br/><br/>
		<div class="input-group">
	  	 	<span class="input-group-addon">Email:</span>
	    	<f:input  class="form-control" path="email" placeholder="Email" required="required"/>
		</div>
		<br/><br/>
		<div class="input-group">
	  	 	<span class="input-group-addon">Edad:</span>
	    	<f:input  class="form-control" path="edad" placeholder="Edad" required="required"/>
		</div>
		<br/><br/>
		<div class="input-group">
	  	 	<span class="input-group-addon">Nick:</span>
	    	<f:input  class="form-control" path="nick" placeholder="Nick" required="required"/>
		</div>
		<br/><br/>
		<div class="input-group">
	  	 	<span class="input-group-addon">Contraseña:</span>
	    	<f:input  class="form-control" path="password" placeholder="Contraseña" required="required"/>
		</div >
		<div style="display:none">
	  	 	<span class="input-group-addon">RolName:</span>
	    	<f:input  class="form-control" path="rolName" value="user" required="required"/>
		</div>
		<div style="display:none">
	  	 	<span class="input-group-addon">RolValue:</span>
	    	<f:input  class="form-control" path="rolValue" value="1" required="required"/>
		</div>
		<br/><br/>
		
	    <button type="submit" class="btn btn-default btn-primary" style="width:200px"> Registrar</button>	    
  </f:form>
  <br/><br/>
  <a href="toMenu" class="btn btn-default btn-primary" style="width:200px" >Cancelar</a>  
  <br/><br/>  
</div>
</main>

	<!-- 	FOOTER -->
	<br/><br/>	<br/><br/>	
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