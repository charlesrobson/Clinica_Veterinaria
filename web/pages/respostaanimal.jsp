<%-- 
    Document   : respostaanimal
    Created on : 16 de mai. de 2020, 00:13:12
    Author     : Charles
--%>


<%@page import="model.Animal"%>
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
                            <%! Animal msg;%>
                            <% msg = (Animal) request.getAttribute("animal");%>
                            <p>Id: <%=msg.getId()%></p>
                            <p>Nome: <%=msg.getNome()%></p>
                            <p>Tipo: <%=msg.getTipo()%></p>
                            <p>Ra�a: <%=msg.getRaca()%></p>
                            <p>Idade: <%=msg.getIdade()%></p>
                            <p>Alergico: <%=msg.getAlergico()%></p>
                            <p>Peso: <%=msg.getPeso()%></p>
                            <p>Altura: <%=msg.getAltura()%></p>
                            <p>Tutor: <%=msg.getTutor()%></p>
                    </div>           
                </div>
            </div>
        </section>
    </body>
</html>
