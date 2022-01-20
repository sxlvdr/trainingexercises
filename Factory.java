package com.mycompany.factory;

/**
 *
 * @author a838595
 * 
 * Example creating a simple way of implementing a Factory Pattern
 * In this example it would be used to create user objects from different
 * categories, since this is just to demonstrate the patterns purpose
 * it will just display a message of creation
 */
public class Factory {
    
    public Factory(String type){
        if(type == null){
            System.out.println("No parameters");
        }
        if(type.equalsIgnoreCase("Project Leader")){
            System.out.println("Project Leader Created");
        } else if(type.equalsIgnoreCase("Functional analyst")){
            System.out.println("Functional Analyst created");
        } else if(type.equalsIgnoreCase("Developer")){
            System.out.println("Developer created");
        } else if(type.equalsIgnoreCase("QA")){
            System.out.println("QA created");
        } else if(type.equalsIgnoreCase("ERs")){
            System.out.println("ERS created");
        }
    }
}
