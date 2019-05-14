package com.example.apackage;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

/**
 * Application Lifecycle Listener implementation class MyOwnListener
 *
 */

public class MyOwnListener implements ServletContextListener {

    /**
     * Default constructor.
     */
    public MyOwnListener() {
        // TODO Auto-generated constructor stub
        System.out.println("myownlistener init");
    }

    /**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        System.out.println("myownlistener destory");
    }

    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        System.out.println("myownlistener do");
        ServletContext sc = sce.getServletContext();
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        bds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        bds.setUsername("root");
        bds.setPassword("root");
        sc.setAttribute("dataSource", bds);
    }

}
