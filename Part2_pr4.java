import java.util.Scanner;
//Created by Bhautik Vekariya
//ID : 21CE151
public class Part2_pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        Account_pr4 ac = new Account_pr4(id);
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

        System.out.println("** For saving Account **");
        SavingAccount sa = new SavingAccount();
        System.out.println("Enter deposit amount: ");
        double de = sc.nextDouble();
        sa.sdeposite(de);
        System.out.println("Now your account balance: " +sa.getBalance());

        System.out.println("Enter withdraw amount: ");
        double wi = sc.nextDouble();
        sa.swithdraw(wi);
        System.out.println("Now your account balance: " +sa.getBalance());

        System.out.println("** For Checking Account **");
        CheckingAccount ca = new CheckingAccount();
        System.out.println("Enter deposit amount: ");
        double dep = sc.nextDouble();
        ca.cdeposite(dep);
        System.out.println("Now your account balance: " +ca.getBalance());

        System.out.println("Enter withdraw amount: ");
        double with = sc.nextDouble();
        ca.cwithdraw(with);
        System.out.println("Now your account balance: " +ca.getBalance());
    }
}
