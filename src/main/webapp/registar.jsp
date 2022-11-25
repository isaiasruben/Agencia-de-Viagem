<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar novo usuário</title>
    <link rel="stylesheet" href="css/estilo.css" type="text/css">
</head>
<body>

    <div class="caixa2">
        <form action="Cadastro" method="post">
            <div class="bx" style="margin-top:-90px;">
                <span class="lbl"><label for="apelido">Apelido</label></span>
                <span class="ipt"><input type="text" name="apelido" id="apelido"></span>
                <span class="lbl"><label for="cnome">Nome</label></span>
                <span class="ipt"><input type="text" name="nome" id="cnome"></span>
            </div>
            <div class="bx" style="margin-top:-60px;">
                <span class="lbl"><label for="nome">Outros Nomes</label></span>
                <span class="ipt"><input type="text" name="outros" id="nome" style="width:130px;"></span>
            </div>
            <div class="bx"  style="margin-top:-60px;">
                <span class="lbl"><label for="nasc">Data de Nascimento</label></span>
                <span class="ipt"><input type="date" name="nasc" id="nasc"></span>
                <span class="lbl"><label for="sexo">Sexo</label></span>
                <span class="ipt"><select name="sexo" id="sexo">
                    <option value="M">masculino</option>
                    <option value="F">Feminino</option>
                </select></span>
            </div>
            <div class="bx"  style="margin-top:-60px;">
                <span class="lbl"><label for="bairro">Bairro</label></span>
                <span class="ipt"><input type="text" name="bairro" id="bairro"></span>
                <span class="lbl"><label for="quarteirao">Quarteirao</label></span>
                <span class="iptM"><input type="number" name="quarteirao" class="min" id="quarteirao"></span>
            </div>
            <div class="bx"  style="margin-top:-60px;">
                <span class="lbl"><label for="casa">Nº da Casa</label></span>
                <span class="iptM"><input type="number" name="casa" class="min" id="casa"></span>
                <span class="lbl"><label for="email">E-Mail</label></span>
                <span class="ipt"><input type="email" name="email" id="email"></span>
            </div>
            <div class="bx"  style="margin-top:-60px;">
                <span class="lbl"><label for="username">Username</label></span>
                <span class="ipt"><input type="text" name="username" id="username"></span>
                <span class="lbl"><label for="password">Password</label></span>
                <span class="ipt"><input type="password" name="password" id="password" style="width:90px;"></span>
            </div>
        </form>
        
        <div id="footR"  style="margin-top:-60px;">
                    <span><button type="submit" class="btnR">Register</button></span>
                    <span><button type="reset" class="btnR">Limpar</button></span>
                    <span><a href="./Pagina_Principal.jsp"><button class="btnR">Voltar</button></a>
                    </span>
            </div>
    </div>
</body>
</html>