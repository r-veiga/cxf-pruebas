
package com.ttdev.ss;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.2.5
 * Thu Aug 15 08:37:04 CEST 2019
 * Generated source version: 2.2.5
 * 
 */
 
public class SimpleService_P1_Server{

    protected SimpleService_P1_Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new SimpleServiceImpl();
        String address = "http://localhost:51515/ss/p1";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new SimpleService_P1_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}