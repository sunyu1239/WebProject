package com.example.apackage;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class AServlet
 */

public class AServlet implements Servlet {

    /**
     * Default constructor.
     */
    public AServlet() {
        // TODO Auto-generated constructor stub
        System.out.println("AServlet constructor");
    }

    /**
     * @see Servlet#init(ServletConfig)
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("AServlet init");
    }

    /**
     * @see Servlet#destroy()
     */
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("AServlet destory");
    }

    /**
     * @see Servlet#getServletConfig()
     */
    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see Servlet#getServletInfo()
     */
    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see Servlet#service(ServletRequest request, ServletResponse response)
     */
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println("AServlet do");
    }

}
