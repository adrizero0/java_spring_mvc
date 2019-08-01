
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
                </ul>
            </div>
            
        </div>
      </div>
 </header> 
 
 <!-- 	MAIN   -->
 <main>
	  <br/><br/>  
	  <br/><br/>

	<div class="container" style="background-color:white">	  	
	  
		<h1>YipiQuizzes</h1><br/>
		<br/><br/>
		<p>
			<b>NOMBRES DE LOS PARTICIPANTES</b><br/>
			Adriana Pedroza<br/>
			Miriam Paiz<br/>
			Jos� Carlos Cruzado
		</p>

		<p>
			<b>OBJETIVO DEL PROYECTO</b>
			El proyecto consiste en una p�gina web din�mica, donde realizar actividades l�dico-culturales y, 
			en un segundo paso, establecer relaciones sociales entre los participantes. Se centra sobre todo 
			en una participaci�n din�mica del usuario, de corta estancia pero de alta repetici�n en su uso.
		</p>
		<p>			
			<b>ESQUEMA T�CNICO</b>
			Esquema o diagrama de bloques de los m�dulos que componen el proyecto y las tecnolog�as empleadas en cada uno.
		</p>
		<img src="static/Content/images/diagrama.jpg" style="width:50%">
		<p>	<br/>		
			<b>METODOLOG�A DE TRABAJO</b><br/>
			Selecci�n de ideas y designaci�n de proyecto (Grupo)<br/>
			Desarrollamos las partes consistentes en la web, aislando atributos y objetos a tratar. (Adriana Pedroza)<br/>
			Obtenci�n de contenido (Miriam  Paiz)<br/>
			Creamos la l�gica de servicios y llamadas a m�todos, y acceso a base de datos. (Grupo)<br/>
			Dise�o de base de datos (Jos� Carlos Cruzado)<br/>
			Generaci�n de p�ginas din�micas y entidades (Grupo)
		</p>
		<p>			
			<b>EL PROYECTO</b><br/>
			El proyecto est� dividido en dos partes: una presente en la versi�n actual y otra futura.<br/>
			En la versi�n presente, accediendo desde la p�gina de inicio puede logearse una persona. 
				Dependiendo de si es administrador o usuario, realizar� una llamada u otra, accediendo a servicios distintos.<br/><br/>
			Si es usuario, la persona accede a su p�gina de usuario, donde recibe su puntuaci�n y �ltimos juegos realizados, 
				as� como la posibilidad de realizar nuevos juegos.<br/><br/>
			Escogiendo entre las dos opciones presentes, se pueden acceder a juegos tipo trivial, donde a la finalizaci�n del 
				mismo se indica la puntuaci�n obtenida por el jugador, o a quizzes o encuestas, donde tras las mismas el jugador 
				obtiene una valoraci�n de sus resultados.<br/><br/>
			Como administrador, se accede a una p�gina de control de usuarios, con la opci�n de eliminar o actualizar usuarios.
			En el futuro, esperamos implementar dos funcionalidades:<br/><br/>
			-	Que los mismos usuarios puedan subir contenidos a las pruebas, como trivials y quizzes.<br/>
			-	Que entre los usuarios haya la posibilidad de establecer amistad, compartiendo puntos obtenidos en las pruebas 
				y creando as� la posibilidad de clanes. Esto dar�a una mayor sensaci�n de grupo y har�a m�s fuerte el deseo de volver. <br/>

		</p>
	  	
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