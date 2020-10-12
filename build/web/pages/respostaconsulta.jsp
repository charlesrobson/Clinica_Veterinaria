<%-- 
    Document   : respostaanimal
    Created on : 16 de mai. de 2020, 00:13:12
    Author     : Charles
--%>


<%@page import="model.Consulta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="component.css" rel="stylesheet" type="text/css"/>
        <link href="demo.css" rel="stylesheet" type="text/css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Resposta JSP</title>
    </head>
    <body>
        <header class="ScriptHeader">
            <div class="rt-container">
                <div class="col-rt-12">
                    <div class="rt-heading">
                        <h1>Resposta JSP</h1>	
                    </div>
                </div>
            </div>
        </header>
        <section>
            <div class="rt-sm-container">
                <div id="borda" class="col-rt-12">
                    <div class="wrapper">
                            <%! Consulta msg;%>
                            <% msg = (Consulta) request.getAttribute("consulta");%>
                            <p>Número da Consulta: <%=msg.getNumero()%></p>
                            <p>Médico Veterinário: <%=msg.getNomeveterinario()%></p>
                            <p>Animal: <%=msg.getAnimal()%></p>
                            <p>Data da Consulta: <%=msg.getData()%></p>
                            <p>Horário de Início: <%=msg.getHorainicio()%></p>
                            <p>Horário do término da consulta: <%=msg.getHorafim()%></p>
                            <p>Valor: <%=msg.getValor()%></p>
                            <p>Diagnóstico: <%=msg.getDiagnostico()%></p>                      
                    </div>           
                </div>
            </div>
        </section>
    </body>
</html>
