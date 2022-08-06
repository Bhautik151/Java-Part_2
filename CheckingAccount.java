public class CheckingAccount extends Account_pr4{
    void cwithdraw(double cw_amount){
        if(cw_amount>100){
            super.withdraw(cw_amount);
        }
        else{
            System.out.println("Minimum withdraw limit is 100...");
        }
    }

    void cdeposite(double cd_amount){
        if(cd_amount>200){
            super.deposit(cd_amount);
        }
        else{
            System.out.println("Minimum deposit limit is 200...");
        }
    }
}
