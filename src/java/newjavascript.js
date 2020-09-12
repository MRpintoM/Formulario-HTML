    var controlPaginaCheck = 0;
     var controlPaginaRegister = 0;
$(document).ready(function(){
    
    $('form input').keyup(function() {
        $("#successReg").hide();
        var empty = false;
        $('form input').each(function() {
            if ($(this).val() === "") {
                empty = true;
            }
        });

        if (empty) {
            $('#btnRegistrarse').prop( "disabled", true );
        } else {
            $('#btnRegistrarse').prop( "disabled", false );
        }});

  $("#displayStudents").hide();
    $('#registerStudents').hide();
    $("#successReg").hide();
    $("#btnRegistrarse").prop( "disabled", true );
    
    $("#navHome").click(function(){
        resetForm();
        $('#registerStudents').hide();
        $("#home").show();
        $("#displayStudents").hide();
         $("#successReg").hide();
    });
    
     $(".redRegister").click(function(){
         resetForm();
        $('#registerStudents').show();
        $("#home").hide();
        $("#displayStudents").hide();
         $("#successReg").hide();
    });
    
    $(".redForms").click(function(){
        resetForm();
        $('#registerStudents').hide();
        $("#home").hide();
        $("#displayStudents").show();
         $("#successReg").hide();

        getStartRead();
    });
    
    $("#btnAtras").click(function(){
        lastPage();
    });
    
    $("#btnSiguiente").click(function(){
        nextPage();
    });
    
    $("#btnRegistrarse").click(function(){
        registering();
    });
    
});

function resetForm(){
     $('.form-group').each(function() {
    $(".form-group").find("input[type=text], textarea").val("");
     });
};

function getStartRead(){
    $.ajax({
        method: "GET",
        url:"ControlDeFormulario",
        data:{
            "pagControl":0
        },
       success:function(respuesta){
            var jsonRespuesta = jQuery.parseJSON(respuesta );
            $("#rspName").text(jsonRespuesta.name);
            $("#rspLast").text(jsonRespuesta.lname);
            $("#rspCarnet").text(jsonRespuesta.carnet);
            $("#rspEmail").text(jsonRespuesta.email);
            $("#rspPhone").text(jsonRespuesta.telefono);
            $("#rspAddress").text(jsonRespuesta.direccion);
        },
        error : function(){
            console.log("Error");
        }
    });
    
};

function lastPage(){
    if(controlPaginaCheck > 0){
        controlPaginaCheck--;
        $.ajax({
       method: "GET",
       url:"ControlDeFormulario",
       data:{
           "pagControl":controlPaginaCheck
       },
      success:function(respuesta){
           var jsonRespuesta = jQuery.parseJSON(respuesta );
           $("#rspName").text(jsonRespuesta.name);
           $("#rspLast").text(jsonRespuesta.lname);
           $("#rspCarnet").text(jsonRespuesta.carnet);
           $("#rspEmail").text(jsonRespuesta.email);
           $("#rspPhone").text(jsonRespuesta.telefono);
           $("#rspAddress").text(jsonRespuesta.direccion);
       },
       error : function(){
           console.log("Error");
       }
   });
    }
    else{
        console.log("no mas atras")
    }
    
};

function nextPage(){
    if(!((controlPaginaCheck+1) === controlPaginaRegister) && controlPaginaRegister > controlPaginaCheck){
        controlPaginaCheck++;
     $.ajax({
        method: "GET",
        url:"ControlDeFormulario",
        data:{
            "pagControl":controlPaginaCheck
        },
       success:function(respuesta){
            var jsonRespuesta = jQuery.parseJSON(respuesta );
            $("#rspName").text(jsonRespuesta.name);
            $("#rspLast").text(jsonRespuesta.lname);
            $("#rspCarnet").text(jsonRespuesta.carnet);
            $("#rspEmail").text(jsonRespuesta.email);
            $("#rspPhone").text(jsonRespuesta.telefono);
            $("#rspAddress").text(jsonRespuesta.direccion);
            
                 console.log("Siguiente desactivado desde boton siguiente");
             console.log(controlPaginaCheck)
        },
        error : function(){
            console.log("Error");
        }
    });}
else{
                 console.log("No mas siguiente");
             }
}


function registering(){
    if(controlPaginaRegister < 11){
        $.ajax({
               type: "POST",
               url: "ControlDeFormulario", 
               data:{
                   "nombre":$("#firstName").val(),
                   "apellido":$("#lastName").val(),
                   "carnet":$("#carnet").val(),
                   "email":$("#email").val(),
                   "celular":$("#phoneNumber").val(),
                   "direccion":$("#address").val(),
                   "pagControlRegister" : controlPaginaRegister
               },
               success:function(respuesta){
                   console.log(controlPaginaCheck);
                   console.log(controlPaginaRegister);
                   controlPaginaRegister++;
                   $("#successReg").show(2000);
                   resetForm();
               }
   });
    }   else{
        console.log("No hay mas espacio en array")
    }
   console.log(controlPaginaRegister);
}



