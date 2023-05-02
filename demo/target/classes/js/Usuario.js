function crearUsuario(){

    //Capturamos información del usuario

    let fn=$("#firstname").val();
    let ln=$("#lastname").val();
    let em=$("#email").val();
    let ps=$("#password").val();
    let da=$("#datebirth").val();


    $.ajax({

        url : 'LoginServlet',
        data : {
            fn:fn,
            ln:ln,
            em:em,
            ps:ps,
            da:da},
        type : 'POST',

        success : function(rta) {
            $("#respuesta").append("usuario creado: "+rta);
            alert(fn+" "+ln+" "+em+" "+ps+" "+da);
        },
        error : function(xhr, status) {
            alert('Disculpe, existió un problema');
        },
        complete : function(xhr, status) {
            alert('Petición realizada');
        }
    });
}
