<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Agendar Viagem</title>
        <link rel="stylesheet" href="css/estilo.css" type="text/css">
    </head>
    <body>
    <form action="Viagem" method="get">
        <div class="caixa">
           <div class="bx">
            <span class="lbl"><label for="nome">Nome do viajante</label></span>
              <span class="ipt"><input type="text" name="nome" id="nome"></span>
              </div>
                 <div class="bx">
                <span class="lbl"><label for="origem">Origem</label></span>
                <span class="ipt"><select name="origem" id="origem">
                    <option value="maputo">Maputo</option>
                    <option value="gaza">Gaza</option>
                    <option value="inhambane">Inhambane</option>
                    <option value="beira">Beira</option>
                    <option value="sofala">Sofala</option>
                    <option value="tete">Tete</option>
                    <option value="zambezia">Zambezia</option>
                    <option value="quelimane">Quelimane</option>
                    <option value="niassa">Niassa</option>
                    <option value="cabo-delgado">Cabo Delgado</option>
                </select></span>
                
            </div>
            <div class="bx">
                <span class="lbl"><label for="destino">Destino</label></span>
                <span class="ipt"><select name="destino" id="destino">
                    <option value="maputo">Maputo</option>
                    <option value="gaza">Gaza</option>
                    <option value="inhambane">Inhambane</option>
                    <option value="beira">Beira</option>
                    <option value="sofala">Sofala</option>
                    <option value="tete">Tete</option>
                    <option value="zambezia">Zambezia</option>
                    <option value="quelimane">Quelimane</option>
                    <option value="niassa">Niassa</option>
                    <option value="cabo-delgado">Cabo Delgado</option>
                </select></span>
            </div>
            <div class="bx">
                <span class="lbl"><label for="passagem">Passagem</label></span>
                <span class="ipt"><select name="passagem" id="passagem">
                    <option value="normal">Normal</option>
                    <option value="economico">Econômico</option>
                    <option value="vip">VIP</option>
                </select></span>
            </div>
            <div class="bx">
                <span class="lbl"><label for="idaVolta">Ida e Volta</label></span>
                <span class="ipt"><input type="checkbox" name="tipo" id="idaVolta" value="IdaeVolta"></span>
                <span class="lbl"><label for="ida">Ida</label></span>
                <span class="ipt"><input type="checkbox" name="tipo" id="ida" value="ida"></span>
            </div>
            <div class="bx">
                <span class="lbl"><label for="cartao">Cartao PayPal</label></span>
                <span class="ipt"><input type="text" name="cartao" id="cartao"></span>
            </div>

            <div id="footV" style="margin-top:50px">
                <span><button type="submit" class="btnR">Comprar Bilhete</button></span>
                <span><a href="./Index.jsp"><button class="btnR">Sair</button></a></span>
            </div>
        </div>
        </form>
    </body>
    </html>