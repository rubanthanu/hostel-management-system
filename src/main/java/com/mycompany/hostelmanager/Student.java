/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanager;

/**
 *
 * @author hp
 */
public class Student extends Person{
   
     private int roomNo;
     String course;
    
    
    Student (int id,String name,int age,int roomNo,String contactNo,String course){
        super(id, name, age, contactNo);
    
        this.roomNo=roomNo;
        this.course=course;
        
    
    }
    @Override
    public String toCsv(){
      return id+","+name+","+age+","+course+","+roomNo+","+getContactNo();
    
    }
    
}
