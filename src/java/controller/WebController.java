/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import entity.Account;
import entity.Product;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.AccountFacade;
import session.ProductFacade;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "WebController", urlPatterns = {
    "/showAddProduct",
    "/showAddAccount",
    "/addProduct",
    "/addAccount",
    
})
public class WebController extends HttpServlet {
    @EJB ProductFacade productFacade;
    @EJB AccountFacade accountFacade;
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        
        switch (path) {
            case "/showAddProduct":
                request.getRequestDispatcher("/WEB-INF/showAddProduct.jsp")
                        .forward(request,response);
                break;
            case "/addProduct": 
                String produktTitle = request.getParameter("produktTitle");
                String categoria = request.getParameter("categoria");
                String size = request.getParameter("size");
                String price = request.getParameter("price");
                String quantity = request.getParameter("quantity");
                Product product = new Product (
                        produktTitle,
                        categoria, 
                        new Integer(size),  
                        new Integer(price),  
                        new Integer(quantity),
                        new Integer (quantity)
                );
                productFacade.create(product);
                request.setAttribute("info", "Товар создан");
                request.setAttribute("product",product);
                request.getRequestDispatcher("/index.jsp")
                        .forward(request,response);
                        break;
            case "/showAddAccount":
                request.getRequestDispatcher("/WEB-INF/showAddAccount.jsp")
                        .forward(request,response);
            case "/AddAccount":
                String name = request.getParameter("name");
                String lastname = request.getParameter("lastname");
                String email = request.getParameter("email");
                String money = request.getParameter("money");
                    Account account = new Account (
                       name, lastname, email, new Integer(money)
                );
                accountFacade.create(account);
                request.setAttribute("info", "Покупатель добавлен");
                request.setAttribute("account", account);
                request.getRequestDispatcher("/index.jsp").forward(request,response);
                       break;
                       
                
            
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**

     * Handles the HTTP <code>GET</code> method.

     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs

     */

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }



    /**

     * Handles the HTTP <code>POST</code> method.

     *

     * @param request servlet request

     * @param response servlet response

     * @throws ServletException if a servlet-specific error occurs

     * @throws IOException if an I/O error occurs

     */

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        processRequest(request, response);

    }



    /**

     * Returns a short description of the servlet.

     *

     * @return a String containing servlet description

     */

    @Override

    public String getServletInfo() {

        return "Short description";

    }// </editor-fold>



}
