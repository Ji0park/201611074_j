package com.draw; 
 import ch.aplu.turtle.*; 
 

 public class TurtleTriangle{ 
   static Turtle t1=new Turtle(); 
   public TurtleTriangle(){}; 
   public static void drawTriangle(int size){ 
     for (int i=0; i<3; i++)  { 
       t1.forward(size); 
       t1.right(120); 
       } 
     } 
}     
drawTriangle(100); 
       
    
