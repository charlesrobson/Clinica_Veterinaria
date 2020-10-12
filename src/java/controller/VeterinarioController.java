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
import model.Veterinario;

/**
 *
 * @author Charles
 */
public class VeterinarioController extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            RequestDispatcher enviar = request.getRequestDispatcher("pages/respostaveterinario.jsp");
            String nome, email, endereco, telefone, celular, crmv, cpf;
            
            crmv = request.getParameter("crmv");
            nome = request.getParameter("nome");
            email = request.getParameter("email");
            cpf = request.getParameter("cpf");
            endereco= request.getParameter("endereco");
            telefone = request.getParameter("telefone");
            celular = request.getParameter("celular");

            Veterinario msg = new Veterinario(crmv, nome, email, cpf, endereco, telefone, celular);

            request.setAttribute("veterinario", msg);
            enviar.forward(request, response);
        }catch (Exception e) {
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
