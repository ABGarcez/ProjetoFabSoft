(function(){
    $("#tabprodutos").on("click",".js-delete",function(){
        //alert("Clicou")
        let botaoclicado2 = $(this)
        $("#btnsimproduto").attr("data-id", botaoclicado2.attr("data-id"))
        $("#modalproduto").modal("show")
    })

    $("#btnsimproduto").on("click", function(){
        let botaosim2 = $(this)
        let id = botaosim2.attr("data-id")
        $.ajax({
            url: "/produtos/delete/" + id,
            method: "GET",
            success: function(){
                window.location.href = "/produtos"
            }
        })
    })
})()