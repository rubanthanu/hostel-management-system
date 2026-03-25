/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostelmanager;

/**
 *
 * @author hp
 */
public class Entry {
    int id;
    String date;
    String type;
    String time;
    String reason;
    Entry(int id,String date,String type,String time,String reason)
    
    {
      this.id=id;
      this.date=date;
      this.type=type;
      this.time=time;
      this.reason=reason;
    
    }
     public String toCsv(){
      return id+","+date+","+type+","+time+","+reason;
    
    }
    
}
