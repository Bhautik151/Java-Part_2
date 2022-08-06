import java.util.Scanner;
import java.util.Date;
//created by Bhautik Vekariya
//ID : 21CE151
public class Part2_Pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        System.out.println("Enter ID : ");
        id = sc.nextInt();
        Account ac = new Account(id);
        System.out.println("Your account created successfully...");

        System.out.println("Account ID: " + ac.getId());
        System.out.println("Account balance: " + ac.getBalance());
        System.out.println("Enter annualInterestRate: ");
        double annualInterestRate = sc.nextDouble();
        ac.setAnnualInterestRate(annualInterestRate);
        System.out.println("MonthlyInterestRate: " + ac.getMonthlyInterestRate(annualInterestRate)+ "%");
        System.out.println("MonthlyInterest: " + ac.getMonthlyInterest(ac.getBalance()));

        System.out.println("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        ac.deposit(deposit);
        System.out.println("Now your account balance: " + ac.getBalance());
        System.out.println("Enter withdraw amount: ");
        double withdraw = sc.nextDouble();
        ac.withdraw(withdraw);
        System.out.println("Now your account balance: " + ac.getBalance());
    }
}