/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Joh
 */
@WebServlet(name = "UploadServlet", urlPatterns = {"/UpLoad"})
@MultipartConfig(location="C:\\tddownload")
public class UploadServlet extends HttpServlet {
        String fileNameExtractorRegex = "fileName = \".+\"";
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
        try{
            
            response.setContentType("text/html;charset=UTF-8");
            String path = this.getServletContext().getRealPath("/");
            System.out.println("path is:"+path);
            out.write("服务器本地路径： "+path+"<br />\n");
            for(Part p:request.getParts()){
                if(p.getContentType().contains("image")){
                    String fname = getFileName(p);
                    p.write(path+fname);
                    System.out.println("file name is:"+fname);
                    System.out.println(p.getContentType());
                }
            }
            
            /* TODO output your page here. You may use following sample code.
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UploadServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UploadServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
        }finally{
            out.close();
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

    private String getFileName(Part p) throws  UnsupportedOperationException{
        String cotentDesc = p.getHeader("content-disposition");
        String fileName = null;
        Pattern pattern = Pattern.compile(fileNameExtractorRegex);
        Matcher matcher = pattern.matcher(cotentDesc);
        if(matcher.find()){
            fileName = matcher.group();
            fileName = fileName.substring(10,fileName.length()-1);
        }    
        return fileName;
         
    }

  

}
