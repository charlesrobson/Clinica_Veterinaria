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
import model.Animal;

/**
 *
 * @author Charles
 */
public class AnimalController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            RequestDispatcher enviar = request.getRequestDispatcher("pages/respostaanimal.jsp");
            String nome, tipo, raca, alergico, tutor, id, idade, peso, altura;
            
            id = request.getParameter("id");
            nome = request.getParameter("nome");
            tipo = request.getParameter("tipo");
            raca = request.getParameter("raca");
            idade = request.getParameter("idade");
            alergico = request.getParameter("alergico");
            peso = request.getParameter("peso");
            altura = request.getParameter("altura");
            tutor = request.getParameter("tutor");

            Animal msg = new Animal(id, nome, tipo, raca, idade, alergico, peso, altura, tutor);

            request.setAttribute("animal", msg);
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
