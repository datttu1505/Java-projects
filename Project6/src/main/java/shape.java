/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dattu
 */
public abstract class shape {
    int x;
    int y;
    
    public shape(){
    x=0;
    y=0;
}
    public shape(int userX, int userY){
      this.x=userX;
      this.y=userY;
       // setX(userX);
       //setY(userY);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int userX){
        this.x=userX;
    }
     public void setY(int userY){
        this.y=userY;
     }
     abstract double area();
     abstract String display();
     
    public String toString(){
        return"the x position is: "+x+"the y position is: "+y;
    }
}
