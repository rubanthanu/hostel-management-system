/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanager;

/**
 *
 * @author hp
 */
public abstract class Person {
    protected int id;
    protected String name;
    protected  int age;
    private String contactNo;
    
    Person (int id,String name,int age,String contactNo){
        
    this.id=id;
    this.name=name;
    this.age=age;
      this.contactNo = contactNo;
    
    }

   

    public String getContactNo() {
        return contactNo;
    }
    
    
    
    public abstract String toCsv();
      
    
  }
