(function(){
    $("#tabclientes").on("click",".js-delete",function(){
        //alert("Clicou")
        let botaoclicado = $(this)
        $("#btnsimcliente").attr("data-id", botaoclicado.attr("data-id"))
        $("#modalcliente").modal("show")
    })

    $("#btnsimcliente").on("click", function(){
        let botaosim = $(this)
        let id = botaosim.attr("data-id")
        $.ajax({
            url: "/clientes/delete/" + id,
            method: "GET",
            success: function(){
                window.location.href = "/clientes"
            }
        })
    })
})()
