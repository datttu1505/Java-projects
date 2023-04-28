
import java.util.ArrayList;
import java.util.Date;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dattu
 */
abstract public class Account {

    private int id = 0;
    private String name;
    private double balance = 0.0;
    private Date dateOpened;
    protected ArrayList<Transaction> transaction = new ArrayList<>();
   
    public Account() {

    }

    public Account(int id,String name, double amount) {
        setid(id);
        setname(name);
        setbalance(amount);
        
    }

    public String getname() {
        return name;
    }

    public int getid() {
        return id;
    }

    public double getbalance() {
        return balance;
    }
    public Date getdate(){
        return dateOpened= new java.util.Date();
    }
    public void setname(String name) {
       this.name= name;
    }

    public void setid(int id) {
      this.id= id;
    }

    public void setbalance(double amount) {
        balance= amount;
    }
    abstract double withdraw(double amount);
    abstract double deposit(double amount);
    
    public String toString(){
        String output = "Account id: "+id+"/n Coustomer name: "+name+"/n Account opened: "+dateOpened+
                "/n Balacne: "+balance+"/n transactions: ";
        for(Transaction element: transaction){
           output = output + element.toString()+"\n";
       }
     return output;
    }
 
}
