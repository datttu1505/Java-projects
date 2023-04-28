/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dattu
 */
public class Savings extends Account {
    double intrest= 6.0;

    public Savings(){
        
    }
    
    public Savings(int id,String name, double amount, double rate){
       super(id,name,amount);
       setAnnualIntrest(rate);
    }
    public double getAnnualIntrest(){
        return intrest;
    }
    public void setAnnualIntrest(double rate){
        intrest= rate;
    }
    public double getMonthlyInterest(){
        double monthlyintrest= (intrest/12)/100;
        return monthlyintrest;
    }
    public double withdraw(double amount){
      double Newbalance= getbalance();
      Newbalance= Newbalance- amount;
      setbalance(Newbalance);
      if(Newbalance < 0){
          System.out.println("you dont have enough balance!");
      }
      
      return getbalance();  
    }
     public double deposit(double amount){
       double Newbalance= getbalance();
      Newbalance= Newbalance+ amount;
      setbalance(Newbalance);
      return getbalance();
    }
    public String toString(){
         return "Savings\n"+super.toString();
    }
}

