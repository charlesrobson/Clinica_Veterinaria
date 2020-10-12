/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Consulta;

/**
 *
 * @author Charles
 */
public class ConsultaController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            RequestDispatcher enviar = request.getRequestDispatcher("/pages/respostaconsulta.jsp");
            String numero, nomeveterinario, animal, diagnostico, horainicio, horafim, data, valor;

            numero = request.getParameter("numero");
            nomeveterinario = request.getParameter("nomeveterinario");
            animal = request.getParameter("animal");
            data = request.getParameter("data");
            horainicio = request.getParameter("horainicio");
            horafim = request.getParameter("horafim");
            valor = request.getParameter("valor");
            diagnostico = request.getParameter("diagnostico");

            Consulta msg = new Consulta( numero, nomeveterinario, animal, data, horainicio, horafim, valor, diagnostico);

           request.setAttribute("consulta", msg);
            enviar.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
