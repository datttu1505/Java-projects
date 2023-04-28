
/**
 *
 * @author dattu
 */

import java.io.File;
import java.io.*;

public class Filetestreader {
    public static void main(String[] args) throws FileNotFoundException{
        //File thisprofessorbro = new File("input");
        
        /*if(thisprofessorbro.exists()){
            System.out.println("Absolute parth: " + thisprofessorbro.getAbsolutePath());
        }*/
        
        PrintWriter one = new PrintWriter("input.txt");
        one.println("How much wood would a woodchuck chuck");
        one.println("if a woodchuck could chuck wood?");
        one.println("He would chuck, he would, as much as he could,");
        one.println("And chuck as much wood as a woodchuck would ");
        one.println("If a woodchuck could chuck wood.");
        one.close();
        File two = new File("input.txt");
        if(two.exists()){
            System.out.println(two.getAbsolutePath());
        }
        else{
            System.out.println("This professor bro");
        }
    }
}
