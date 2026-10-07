import java.util.*;
class bankaccount{
    private String name;
    private String number;
    private double money;
    public bankaccount(String number ,String name,double balance){
        this.number=number;
        this.name=name;
        if(balance>=0){
            money=balance;
        }else{
            System.out.println("balance can't be negative ");
        }
    }
    public String getaccountnumber(){
        return number;
    }
    public String accountholdername(){
        return name;
    }
    public double accountbalance(){
        return money;
    }
    public void setaccountdetails(String name){
        this.name=name;
    }
    public void deposit(double amount){
        if(amount>=0){
            money+=amount;
            System.out.println("money is deposited into the account ");
        }else{
            System.out.println("amount should be positive ");
        }
    }
    public void withdraw(double amount){

        if(amount<=money &&amount>0){
            money-=amount;
            System.out.println("money is successfully withdrawn ");
        }else{
            System.out.println("insufficient balance");
        }
    }
}
public class demo{
    public static void main(String[] args) {
    bankaccount account=new bankaccount("ACC12345", "John Doe", 500.00);
    System.out.println("account number : "+ account.getaccountnumber());
    System.out.println("account holder : "+ account.accountholdername());
    System.out.println("account balance : "+ account.accountbalance());
    account.deposit(340.00);
    account.withdraw(129.00);
    System.out.println("updated balance : " + account.accountbalance());
}}