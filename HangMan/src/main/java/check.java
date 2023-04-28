
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dattu
 */

public class check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
File file = new File("dictionary/dictionary.txt");
if (file.exists()) {
    System.out.println("The file exists.");
} else {
    System.out.println("The file does not exist.");
}    }
    
}
