(function(){
    $("#tabItemEstoque").on("click",".js-delete",function(){
        //alert("Clicou")
        let botaoclicado2 = $(this)
        $("#btnsimItemEstoque").attr("data-id", botaoclicado2.attr("data-id"))
        $("#modalItemEstoque").modal("show")
    })

    $("#btnsimItemEstoque").on("click", function(){
        let botaosim2 = $(this)
        let id = botaosim2.attr("data-id")
        $.ajax({
            url: "/itemEstoque/delete/" + id,
            method: "GET",
            success: function(){
                window.location.href = "/itemEstoque"
            }
        })
    })
})()