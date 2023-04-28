/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dattu
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Filereader {
    public static void main(String[] args) {
        // Read the file into a string
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get("input.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Split the string into an array
        //String S1= content.replaceAll("[^a-zA-Z]", "/n ");
        //StringBuilder sb = new StringBuilder();
        //sb.append(S1);
        String Content = content.toLowerCase();
        String[] words = Content.split("[^a-zA-Z]+");
        
        
            
         MyLinkedList<String> word = new MyLinkedList<String>();
        
        // Print the array elements
        for (int i = 0; i < words.length; i++) {
           System.out.println(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
                word.addInOrder(words[i]);
               
            }
        System.out.println(words[3]);
        word.printList();
      
        
    }
}
