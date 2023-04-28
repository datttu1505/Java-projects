/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dattu
 */
public class Project6 {

    /**
     * @param args the command line arguments
     */
     private shape [] thearray = new shape[100]; 
    public static void main(String[] args) {
        Project6 tpo = new Project6();

        tpo.run();

  }  // end of main

 

  public void run () {

int count = 0;

 

    // ------------------------   Fill the array section ----------------------

 

thearray[count++] = new Circle(20, 20, 40);

thearray[count++] = new Triangle(70, 70, 20, 30);

thearray[count++] = new Rectangle(150, 150, 40, 40);


 

// ------------------------------  array fill done ------------------------

 

//---------------------------  loop through the array  --------------------

 

for (int i = 0; i < count; i ++ ) { // loop through all objects in the array

    thearray[i].display();          // don’t care what kind of object, display it

}  // end for loop

 

int offset = 0;

double totalarea = 0.0;

while (thearray[offset] != null) {      // loop through all objects in the array

    totalarea = totalarea + thearray[offset].area();   // get area for this object

    offset++;

} // end while loop

System.out.println("The total area for " + offset + " Shape objects is " + totalarea);

 

  }  // end of run

 

}  // end of class Project6

    
    

