/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;
/**
 *
 * @author dattu
 */
public class Transaction {
   private Date date;
   private char type;
   private double amount;
   private double balance;
   private String description;
   
public Transaction(){
}
   
 public Transaction(char type, double amount, double balance, String description){
    this.type= type;
    this.amount=amount;
    this.balance= balance;
    this.description= description;
    this.date= new Date();
           
 }
 public String toString(){
     return type+"  "+date+"  "+amount+"  "+balance+"  "+description;
 }
}
    
