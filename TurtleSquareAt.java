package com.draw; 
 import ch.aplu.turtle.*;  

class TurtleSquareAt{ 
   Turtle t1=new Turtle(); 
   void drawSquareAt(int size, double x, double y){ 
     t1.setPos(x,y); 
     for (int i=0;i<4;i++){ 
     t1.fd(size); 
     t1.rt(90); 
     } 
   } 
 } 

TurtleSquareAt f = TurtleSquareAt(); 
f.drawSquareAt(100); 
