/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dattu
 */
public class Circle extends shape {
    int radius;
    
    Circle(){
        radius=1;
    }
    Circle(int userX,int userY,int Uradius){
        super(userX,userY);
        setRadius(Uradius);
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    private int getRadius(){
        return radius;
    }

    private void setRadius(int Uradius) {
       radius=Uradius;
    }
    
      public double area() {
        return radius * radius * Math.PI;
    }
      public String display(){
    return "the area of your Circle is "+area()+" the radius is "+radius+
      super.toString();
}
}
