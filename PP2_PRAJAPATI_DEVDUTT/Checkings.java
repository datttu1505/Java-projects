/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dattu
 */
public class Checkings extends Account {
    double OVERDRAFT_LIMIT= 500.0;

    public Checkings(){
        
    }
    
    public Checkings(int id,String name, double amount){
        super(id,name,amount);
    }
    
    public double withdraw(double amount){
      double Newbalance= getbalance()+OVERDRAFT_LIMIT;
      Newbalance= Newbalance- amount;
      setbalance(Newbalance);
      transaction.add(new Transaction('W',amount,Newbalance,"withdraw"));
      if(Newbalance < 0){
          System.out.println("you dont have enough balance!");
      }
    
      return getbalance();  
    }
     public double deposit(double amount){
       double Newbalance= getbalance();
      Newbalance= Newbalance+ amount;
      setbalance(Newbalance);
      transaction.add(new Transaction('D',amount,Newbalance,"deposit"));
      return getbalance();
    }
    public String toString(){
         return "Checkings\n"+super.toString();
    }
}
