/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exampleproj;

/**
 *
 * @author a838595
 * 
 * This is an simple example using encapsulation with Java
 * 
 */
    class Encapsulate {
 //School system to save data from the elementary school students
    private String name;
    private int grade; 
    private int age;
 
    public int getAge() { return age; }
 
    public String getName() { return name; }
 
    public int getGrade() { return grade; }
 
    public void setAge(int newAge) { age = newAge; }
 
    public void setName(String newName)
    {
        name = newName;
    }

    public void setGrade(int newGrade) { grade = newGrade; }
}
 
public class encapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();
 
        obj.setName("Martin");
        obj.setAge(10);
        obj.setGrade(4);
 
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's grade: " + obj.getGrade());
 
    }
}

