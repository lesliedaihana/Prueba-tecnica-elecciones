//function mostrarSweetAlert() {
//  Swal.fire({
//    title: 'Mensaje de SweetAlert',
//    text: '¡Hola, esto es SweetAlert!',
//    icon: 'success',
//    confirmButtonText: 'Aceptar'
//  }).then(function() {
//    // Redireccionar después de hacer clic en el botón Aceptar
//    window.location.href = 'Formeleccion.jsp';
//  });
//}
//Swal.fire({
//    title: 'Mensaje de SweetAlert',
//    text: '¡Hola, esto es SweetAlert!',
//    icon: 'success',
//    confirmButtonText: 'Aceptar'
//  });
Swal.fire({
    title: "Bienvenido"
});


//$(document).ready(function() {
//  $("#btnins").click(function(e) {
//    e.preventDefault();
//    $.ajax({
//      url: "Servletinsertar",
//      method: "POST",
//      success: function(response) {
//        if (response === "success") {
//          Swal.fire({title: "Los datos han sido guardados exitosamente"});
//        } else {
//          Swal.fire({title: "Ha ocurrido un error al guardar los datos"});
//        }
//      },
//      error: function() {
//        Swal.fire({title: "Ha ocurrido un error al guardar los datos"});
//      }
//    });
//  });
//});
//
//
//
//
//$(document).ready(function() {
//  $("#btnlogin").click(function(e) {
//    e.preventDefault();
//    alert("entro a sweet");
//    $.ajax({
//      url: "Servletlogin",
//      method: "POST",
//      success: function(response) {
//        if (response === "success") {
//          Swal.fire({title: "Bienvenido"});
//        } else {
//          Swal.fire({title: "Error de login"});
//        }
//      },
//      error: function() {
//        Swal.fire({title: "Error de login"});
//      }
//    });
//  });
//});
