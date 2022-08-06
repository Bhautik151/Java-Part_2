import java.util.Date;

public class Account_pr3 {
    private String id;
    private double balance = 300;

    Account_pr3(String id){
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
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

    void moneyTransfer(Account_pr3 p,double mta){
        if(getBalance() < mta){
            System.out.println("Your account does not have demanded amount...");
        }
        else{
            double xb = p.getBalance() + mta;
            double b = getBalance() - mta;
            setBalance(b);
            p.setBalance(xb);
            System.out.println("Money transfer successfully...");
        }
    }
}
