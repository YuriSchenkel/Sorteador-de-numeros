        $("#enviar").click(envia);



      function envia(){

          let qtd = $("#qtd").val();
          let min = $("#min").val();
          let max = $("#max").val();
          let ordenar = $("#ordenar")[0].checked;
          let repeticao = $("#repeticao")[0].checked;

          $.ajax({
              type: "POST",
              url: "/",
              data: {
                  qtd: qtd,
                  min: min,
                  max: max,
                  ordenar:ordenar,
                  repeticao:repeticao
              },
              success: function (data) {
                  $('html').html(data);
                  $("#enviar").click(envia);
              },
              error: function () {
                  alert("Não foi possível realizar a solicitação.");
              }
          });
      }