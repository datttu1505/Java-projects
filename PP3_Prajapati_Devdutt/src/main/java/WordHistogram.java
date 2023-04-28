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
import java.util.LinkedList;
import java.util.Scanner;

public class WordHistogram  {
    
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        String Content = "";
        int counter=0;
        String[] words;
        MyLinkedList<Word> word = new MyLinkedList<>();

        try {
            Scanner scanner = new Scanner(input);

            while (scanner.hasNextLine()) {
                String content= Content.toLowerCase();
                content = scanner.nextLine();
            content = content.replaceAll("[^a-zA-Z]+", "\n");
             words = content.split("\n");
            
                
                for (int i = 0; i < words.length; i++) {
                if(words[i].length()==0)    continue;
                Word w = new Word(words[i].toLowerCase(),1);
                if(word.contains(w)){
                    Word temp = word.remove(w);
                    temp.setCount(temp.getCount()+1);
                    word.addInOrder(temp);
                }
                else{
                    word.addInOrder(w);
                }
                
                
            }
                
           
             
            }
            
            scanner.close();
            
            
            
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(word);

        
    }
}
       

        



