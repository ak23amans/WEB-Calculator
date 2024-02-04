/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Ankit
 */
@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
//private static final long serialVersionUID = 1L;
	private final String[] jokes = {
	        "Why do Java developers wear glasses? Because they don't C#!",
	        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
	        "Why don't programmers like nature? It has too many bugs.",
	        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
                "shanu",
                
                "arjun kumar",
                "aman kumar",
	        // Add more jokes here
	    };
    
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
//        response.getWriter().append("hello world:served at").append(request.getContextPath());
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String str1=request.getParameter("firstnumber");
        String str2=request.getParameter("2ndnumber");
        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);
        String ans = request.getParameter("btn1");
        int ans1=Integer.parseInt(ans);
        int a;
        switch(ans1){
            case 1:
                a=num1+num2;
               break;
            case 2:
                a=num1-num2;
                break;
            case 3:
                a=num1*num2;
                break;
            case 4:
                a=num1/num2;
                break;
                default:
                    a=num1/num2*100;
        }
        
         int randomIndex = (int) (Math.random() * jokes.length);
	     String randomJoke = jokes[randomIndex];
        
        
//        response.getWriter().append("Ans: "+a);
        response.sendRedirect("result.jsp?a="+a+"&joke="+randomJoke);
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
        String str1=request.getParameter("userName");
        String str2=request.getParameter("psw");
         response.getWriter().append("Do post is calling "+str1 +" "+str2);
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
