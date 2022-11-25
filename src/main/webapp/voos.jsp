<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-pt">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registar Voos</title>
    <link rel="stylesheet" href="./css/estilo.css">
</head>
<body>
    <div class="caixa">
        <form action="Marcacoes" method="post">

            <div class="bx" style="margin-top:-50px;">
                <span class="lbl"><label for="dataP">Data de Partida</label></span>
                <span class="ipt"><input type="datetime-local" name="dataP" id="dataP" style="
                margin-left:-10px;"></span>
            </div>
            <div class="bx">
                <span class="lbl"><label for="dataC">Data de Chegada</label></span>
                <span class="ipt"><input type="datetime-local" name="dataC" id="dataC" 
                style="margin-left:-15px;"></span>
            </div>
            <div class="bx">
                <span class="lbl"><label for="quant">Assentos</label></span>
                <span class="ipt">
                 <input type="number" name="quant" id="quant"
                style="margin-left:59px;"></span>
            </div>
            <div id="footR" style="margin-top:-30px;">
                <span><button type="submit" class="btnR" >Registar</button></span>
                <span><a href="./Pagina_Inicial"><button class="btnR">Voltar</button></a></span>
            </div>
        </form>
    </div>
</body>
</html>