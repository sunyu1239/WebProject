package com.example.apackage;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class AFilter
 */

public class AFilter implements Filter {

    /**
     * Default constructor.
     */
    public AFilter() {
        // TODO Auto-generated constructor stub
        System.out.println("AFilter constructor");
    }

    /**
     * @see Filter#destroy()
     */
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("AFilter destory");
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        // place your code here
        System.out.println("AFilter do before");
        // pass the request along the filter chain
        chain.doFilter(request, response);
        System.out.println("AFilter do after");
    }

    /**
     * @see Filter#init(FilterConfig)
     */
    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("AFilter init");
    }

}
