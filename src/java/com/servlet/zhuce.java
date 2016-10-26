/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "zhuce", urlPatterns = {"/zhuce"})
public class zhuce extends HttpServlet {
      private String name= null;
     private String psw = null;
     
      
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
   
          PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
       String usrName = request.getParameter("username").toString();
       String usrPsw = request.getParameter("password").toString();
        if(usrName!= null && usrPsw!= null){
            name = usrName;
            psw = usrPsw;
             System.out.println(name);
              System.out.println(psw);
            
            try{
            File file = new File("F.txt");
            //if file doesnt exists, then create it
                if(!file.exists()){
                 file.createNewFile();
                }

           //true = append file
             FileWriter fileWritter = new FileWriter(file.getName(),true);
             BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
             bufferWritter.append(name);
             bufferWritter.append(psw);
             bufferWritter.close();

         System.out.println("Done");
             }catch(Exception e){
                       out.println("not found file");
                       e.printStackTrace();
                    }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head> <meta charset='UTF-8' />");
            out.println("<title>注册成功</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>SUCCEED</h1>");
            out.println("</body>");
            out.println("</html>");
        }else{
           
              out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetPostData</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> 账号密码不全，请重新填写</h1>");
            out.println("</body>");
            out.println("</html>");
        }
       
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
