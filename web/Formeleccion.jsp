<%@page import="modelo.Condado"%>
<%@page import="modelo.CondadoDAO"%>
<%@page import="javax.swing.JOptionPane"%>
<% 
HttpSession dato=request.getSession();
int id=(int)dato.getAttribute("varsesion");
String sal=(String)dato.getAttribute("varsesion2");


%>
<%@page import="modelo.CoordinadorDAO"%>
<%@page import="modelo.Coordinador"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.Servletinsertar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Ingreso de datos</title>
   <!-- Google Font: Source Sans Pro -->
   <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
   <!-- Font Awesome Icons -->
   <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
   <!-- Theme style -->
   <link rel="stylesheet" href="dist/css/adminlte.min.css">
   <link rel="stylesheet" href="index.css">

</head>
<body>
   
        <section class="content ">
          <div class="container ">
            <div class="row d-flex justify-content-center align-items-center" style="height: 100vh;">
                <div class="col-md-7">
            
                <div class="card card-primary">
                  <div class="card-header">
                    <h3 class="card-title">Election - <%=sal%></h3>
                  </div>
                    
                  <form action="Servletinsertar" method="GET" >
                    <div class="card-body">
                        <div class="form-group">
                        <label for="exampleInputEmail1"></label>
                        <input type="hidden" name="ide" class="form-control" id="exampleInputEmail1" placeholder="Enter year">
                      </div>
                      
                      <div class="form-group">
                        <label for="exampleInputEmail1">Año</label>
                        <input type="number" name="ano" class="form-control" id="exampleInputEmail1" placeholder="Ingrese el año de las votaciones">
                      </div>
                        <div class="form-group">
                        <label for="exampleInputEmail1">Partido Democrata</label>
                        <input type="number"  name="demo" class="form-control" id="exampleInputEmail1" placeholder="Ingrese la cantidad de votos">
                      </div>
                        <div class="form-group">
                        <label for="exampleInputEmail1"> Partido Republicano</label>
                        <input type="number" name="rep" class="form-control" id="exampleInputEmail1" placeholder="Ingrese la cantidad de votos">
                        </div>
                        <div class="form-group">
                        <label for="exampleInputEmail1">Otros partidos</label>
                        <input type="number" name="otro" class="form-control" id="exampleInputEmail1" placeholder="Ingrese la cantidad de votos">
                      </div> 
                        <div class="form-group">
                        <label for="exampleInputPassword1">Condado</label>
                        
                          <select class="form-control custom-select " name="con" >
                            <option value="">Seleccione el condado</option>
              
                       <%
            
            
        CondadoDAO condao=new CondadoDAO();
        ArrayList<Condado>lista=new ArrayList<>();
        lista=condao.consultageneralcondado();
        for(Condado cli:lista){
            
            
            
        
        
        
        %>                            
                            <option value="<%=cli.getCodCondado()%>"><%=cli.getCodCondado()%>-<%=cli.getNomCondado()%></option>
                                 <%
                    }
                %>
                          </select>
                      </div>
                   
                        
                        
                        
                        
                        <div class="form-group">
<!--                        <label for="exampleInputEmail1">Cordinador</label>-->
                            <input type="hidden" name="idco" value="<%=id%>" class="form-control" id="exampleInputEmail1" placeholder="Enter year">
                      </div>

<!--                      <div class="form-group">
                        <label for="exampleInputPassword1">Political Party</label>
                        
                          <select class="form-control custom-select " >
                            <option>Select one</option>
                            <option>option 1</option>
                            <option>option 2</option>
                            <option>option 3</option>
                            <option>option 4</option>
                            <option>option 5</option>
                          </select>
                      </div>

                      <div class="form-group">
                        <label for="exampleInputPassword1">Country</label>
                        
                          <select class="form-control custom-select " >
                            <option>Select one</option>
                            <option>option 1</option>
                            <option>option 2</option>
                            <option>option 3</option>
                            <option>option 4</option>
                            <option>option 5</option>
                          </select>
                      </div>-->

<!--                      <div class="form-group">
                        <label for="exampleInputEmail1">vote count</label>
                        <input type="number" class="form-control" id="exampleInputEmail1" placeholder="Enter number">
                      </div>-->

                      

                  
                   
    
                    <div class="card-footer">
                      <button type="submit" id="btnins" name="btnins" class="btn btn-primary btnhover">Guardar</button>
                    </div>
                  </form>
                </div>
            
            </div>

            </div>     
</div>

    
</section>
 
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
    <script src="jquery.js"></script>
    <!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="sweetalert.js"></script>
<!-- Asegúrate de tener SweetAlert y jQuery correctamente importados -->

<!--<script>
$(document).ready(function() {
  $("#btnins").click(function(e) {
    e.preventDefault();

    // Realiza la petición POST al servlet
    $.post("Servletinsertar", function(response) {
      if (response === "success") {
        Swal.fire("Éxito", "Los datos han sido guardados exitosamente", "success");
      } else {
        Swal.fire("Error", "Ha ocurrido un error al guardar los datos", "error");
      }
    });
  });
});

</script>-->



</body>
</html>