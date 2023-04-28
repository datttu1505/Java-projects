/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dattu
 */
public class Triangle extends shape { 
   int base;
   int height;
   double hypotanius;
   
public Triangle(){
   base=1;
   height=1;
   hypotanius=1;
}
public Triangle(int userX,int userY,int base, int height){
   super(userX,userY);
   this.base=base;
   this.height=height;
             
}
public double area(){
   double area= .5*(base*height);
   return area;
}
private int getBase(){
    return base;
}
private int height(){
    return height;
}

private double gethypotanius(){
   hypotanius= Math.hypot(base, height);
   return hypotanius;
}
private void setBase(){
    this.base=base;
} 
private void setHeight(){
    this.height=height;
}

public String display(){
    return "the area of this triangle is "+area()+"base: "+base+"height: "+height+"hypotanius :"+hypotanius+super.toString();
}

}

