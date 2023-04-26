var tempoInicial = $("#tempo-digitacao").text();
var campo = $(".campo-digitacao");

$(function(){
    atualizaTamanhoFrase();
    inicializaContadores();
    inicializaCronometro();
    inicializaMarcadores();
    $("#botao-reiniciar").click(reniciaJogo);
});

function atualizaTamanhoFrase(){
    var frase = $(".frase").text();
    var numPalavras = frase.split(" ").length;
    
    var tamanhoFrase = $("#tamanho-frase");
    tamanhoFrase.text(numPalavras);
};

function inicializaContadores(){    
    campo.on("input",function(){
        var conteudo = campo.val();
        var qtdPalavras = conteudo.split(/\S+/).length -1;
        $("#contador-palavras").text(qtdPalavras);
        
        var qtdCaracteres = conteudo.length;
        $("#contador-caracteres").text(qtdCaracteres);
    });
};  

function inicializaCronometro(){
    var tempoRestante = $("#tempo-digitacao").text();
    campo.one("focus", function(){
        $("#botao-reiniciar").attr("disabled",true);
        var cronometroId = setInterval(function(){
            tempoRestante--;
            $("#tempo-digitacao").text(tempoRestante);
            if(tempoRestante < 1){
                campo.attr("disabled",true);
                clearInterval(cronometroId);
                campo.addClass("campo-desativado");
                $("#botao-reiniciar").attr("disabled", false);
            }
        },1000);
    });
};

function inicializaMarcadores(){
    var frase = $('.frase').text();
    campo.on('input', function(){
        var digitado = campo.val();
    var comparavel = frase.substr(0,digitado.length);
    if(digitado == comparavel) {
        campo.addClass('borda-verde');
        campo.removeClass('borda-vermelha');
    }else{
        campo.addClass('borda-vermelha');
        campo.removeClass('borda-verde')
    };
    });
}

function reniciaJogo(){    
    campo.removeClass('campo-desativado');
    campo.removeClass('borda-verde');
    campo.removeClass('borda-vermelha');
    campo.attr("disabled", false);
    campo.val("");
    $("#contador-palavras").text('0');
    $("#contador-caracteres").text('0');
    $("#tempo-digitacao").text(tempoInicial);
    inicializaCronometro();
};