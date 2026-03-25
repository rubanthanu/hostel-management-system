/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hostelmanager;

/**
 *
 * @author hp
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;



public class HostelManager {
   static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
      while(true)
      {
         menu();
         int c =sc.nextInt();
         sc.nextLine();
           switch(c)
           {
               case 1:
                   addNewStudent();
                   break;
               case 2:
                   viewAllStudents();
                   break;
               case 3:
                   recordEntry("Out");
                   break;
               case 4:
                   recordEntry("IN");
                   break;
               case 5:
                   viewLog();
                   break;
               case 6:
                   search();
                   break;
               case 7:
                   sc.close();
                     System.out.println("Exiting.....");
                     return;
               default:
                    System.out.println("invalid choice");
                   
           }
      }
        
    }
    
     static void menu(){
            System.out.println("Hostel Management System!");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Log Out-Time");
            System.out.println("4. Log In-Time");
            System.out.println("5. View logs");
            System.out.println("6. Search student");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
         }
     
    static void addNewStudent()
    {
        try {
            
        System.out.println("Enter Id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        String name=sc.nextLine();
         System.out.println("Enter age:");
         int age=sc.nextInt();
         System.out.println("Enter RoomNo:");
         int roomNo=sc.nextInt();
         sc.nextLine();
         System.out.println("Enter ContactNo:");
         String contactNo=sc.nextLine();
            System.out.println("Enter Course");
            String course=sc.nextLine();
         Student s=new Student(id,name,age,roomNo,contactNo,course);
        
             FileWriter fw=new FileWriter("student.txt",true);
             BufferedWriter bw=new BufferedWriter(fw);
             bw.write(s.toCsv());
             bw.newLine();
             bw.close();

            System.out.println("Student added successfully!");
            System.out.println(" ");
        } catch (Exception e) {
            
            System.out.println("Error");
        }
     }
    
    
    
    
    static void viewAllStudents(){
        try {
            FileReader fr=new FileReader("student.txt");
            BufferedReader br=new BufferedReader(fr);
            
            String L;
            while((L=br.readLine())!=null)
            {
             String[] details= L.split(",");
             System.out.println("ID: " + details[0] + ", Name: " + details[1] +
                        ", Age: " + details[2] +", Course:"+details[3]+ ", RoomNo: " + details[4] +
                        ", ContactNo: " + details[5] );
               
            }
            
             br.close();
             
        }
       
        
        catch (Exception e) {
            System.out.println("Error reading file.");
        }
         System.out.println("\n");
    }
    
    static void recordEntry(String s)
    {
         
         
         System.out.println("Enter Id:");
          int id=sc.nextInt();
          sc.nextLine();
        
          String date = LocalDate.now().toString();
          String time = LocalTime.now().toString().substring(0,5);
         
          String type,reason;
          
          if(s.contains("Out")== true)
         {
           System.out.println("Enter Reason:");
           reason=sc.nextLine();
           type="Out";
         }
         else
         {
            reason="N/A";
            type="IN";
          
         }
          
         Entry E=new Entry(id,date,type,time,reason);
          try {
             FileWriter fw=new FileWriter("Entry.txt",true);
             BufferedWriter bw=new BufferedWriter(fw);
             bw.write(E.toCsv());
             bw.newLine();
             bw.close();  
          } catch (IOException e) {
              
              System.out.println("Error");
          }
          System.out.println("\n"); 
     }
     
    static void viewLog()
    { 
         try {
            FileReader fr=new FileReader("Entry.txt");
            BufferedReader br=new BufferedReader(fr);
            
            String L;
            while((L=br.readLine())!=null)
            {
             String[] details= L.split(",");
             System.out.println("ID: " + details[0] + ", Date: " + details[1] +
                        ", Type: " + details[2] + ", Time: " + details[3] +
                        ", Reason: " + details[4] );
            
            }
            
             br.close();
             
        }
       
        catch (Exception e) {
            System.out.println("Error reading file.");
        }
         System.out.println("\n");
    }
    
    static void search()
    {
     try {
         //for getting student details
         System.out.println("Enter id:");
         String s=sc.nextLine();
            FileReader fr=new FileReader("student.txt");
            BufferedReader br=new BufferedReader(fr);
            
            String L;
            boolean found = false;
            while((L=br.readLine())!=null)
            {
             String[] details= L.split(",");
             if(details[0].equals(s)== true){
                  found = true;
                 System.out.println("Student Details");
              System.out.println("ID: " + details[0] + ", Name: " + details[1] +
                        ", Age: " + details[2] +", Course:"+details[3]+ ", RoomNo: " + details[4] +
                        ", ContactNo: " + details[5] );

             }
            }
            if (!found)  
            {
               System.out.println("Student not found.");
             }
            
             br.close();
             
             //for getting entry details
             boolean f = false;
             FileReader frr=new FileReader("Entry.txt");
            BufferedReader brr=new BufferedReader(frr);
            
            String l;
            System.out.println("Entry Details");
            while((l=brr.readLine())!=null)
            {
             String[] details= l.split(",");
             if(details[0].equals(s)== true){
                 f=true;
                     
             System.out.println("ID: " + details[0] + ", Date: " + details[1] +
                        ", Type: " + details[2] + ", Time: " + details[3] +
                        ", Reason: " + details[4] );
             }
            }
            if (!f)  
            {
               System.out.println("Entry not found.");
             }
             brr.close();
        }
       
        
        catch (Exception e) {
            System.out.println("Error reading file.");
        }
        System.out.println("\n");
    }
    
    
 }
