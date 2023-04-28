/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dattu
 */
public class Rectangle extends shape {
    int length=1;
    int width=1;
    public Rectangle(){
        
    }
    public Rectangle(int userX,int userY, int userL, int userW){
        super(userX,userY);
        setWidth(userW);
        setLength(userL);
    }
    
    public double area(){
    int area = length * width;
    return area;
    }
    
    private int getWidth(){
        return width;
    }
    
    private int getLength(){
        return length;
    }
    
    private void setWidth(int userW){
        width=userW;
    }
    
    private void setLength(int userL){
        length= userL;
    }
    
    public String display(){
    return "the area of your rectangle is "+area()+" the length is "+length+
      " the width is "+width+"the x position is: "+super.toString();
}
    
}
