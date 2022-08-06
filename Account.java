import java.util.Date;
import java.util.Scanner;

public class Account {
    private int id=0;
    private double balance=500;
    private double annualInterestRate=7;
    private Date dateCreated;

    Account(){
        int id = 0;
        double balance = 500;
        double annualInterestRate = 7;
        dateCreated = new Date();
    }

    Account(int id){
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }


    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterestRate(double annualInterestRate){
        return annualInterestRate/12;
    }

    double getMonthlyInterest(double balance){
        return balance*(getMonthlyInterestRate(annualInterestRate)/100);
    }

    void withdraw(double withdraw){
        if(balance < withdraw){
            System.out.println("Error, please check your withdraw amount...");
        }
        else if (balance == withdraw) {
            System.out.println("Your balance is 0");
        }
        else {
            balance = balance - withdraw;
            System.out.println("Your account withdraw successfully...");
        }
    }

    void deposit(double deposit){
        balance = balance + deposit;
        System.out.println("Your amount is deposit successfully...");
    }
}