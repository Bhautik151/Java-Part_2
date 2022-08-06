import java.util.Scanner;
import java.util.ArrayList;
//created by Bhautik Vekariya
//ID : 21CE151
public class Part2_pr3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Account_pr3> ID = new ArrayList<Account_pr3>(10);
        Account_pr3 AC001= new Account_pr3("AC001");
        Account_pr3 AC002= new Account_pr3("AC002");
        Account_pr3 AC003= new Account_pr3("AC003");
        Account_pr3 AC004= new Account_pr3("AC004");
        Account_pr3 AC005= new Account_pr3("AC005");
        Account_pr3 AC006= new Account_pr3("AC006");
        Account_pr3 AC007= new Account_pr3("AC007");
        Account_pr3 AC008= new Account_pr3("AC008");
        Account_pr3 AC009= new Account_pr3("AC009");
        Account_pr3 AC0010= new Account_pr3("AC0010");

        ID.add(AC001);
        ID.add(AC002);
        ID.add(AC003);
        ID.add(AC004);
        ID.add(AC005);
        ID.add(AC006);
        ID.add(AC007);
        ID.add(AC008);
        ID.add(AC009);
        ID.add(AC0010);

        System.out.print("Enter ID : ");
        String mid=sc.next();
        int flag=0;
        int index=0;
        for(int i=0;i<10;i++)
        {
            Account_pr3 a=ID.get(i);

            if(mid.equals(a.getId()))
            {
                flag++;
                index=i;
                break;
            }

        }

        if(flag==1)
        {
            Account_pr3 temp;
            temp= ID.get(index);
            System.out.println("----choose option from following manu----");
            System.out.println("1. Balance inquiry");
            System.out.println("2. Withdraw money [Maintain minimum balance 300₹]");
            System.out.println("3. Deposit money");
            System.out.println("4. Money Transfer");
            System.out.println("5. Create Account");
            System.out.println("6. Deactivate Account");
            System.out.println("7. Exit");
            System.out.println("8. ANOTHER account's Balance");

            for (int i=1;i<20;i++) {

                System.out.print("->");
                int option = sc.nextInt();
                if(option==7)
                {
                    break;
                }

                switch (option) {
                    case 1:
                        System.out.println("[1]Balance inquiry");
                        System.out.println("Your balance : " + temp.getBalance());
                        break;

                    case 2:
                        System.out.println("[2]Withdraw money");
                        System.out.print("Enter withdraw amount : ");
                        double wa = sc.nextDouble();
                        temp.withdraw(wa);
                        break;
                    case 3:
                        System.out.println("[3]Deposit money");
                        System.out.print("Enter deposit amount : ");
                        double da= sc.nextDouble();
                        temp.deposit(da);
                        break;
                    case 4:
                        System.out.println("[4]Money Transfer");
                        System.out.print("Enter Destination account id for Money Transfer : ");
                        String tsid= sc.next();
                        Account_pr3 tid=new Account_pr3("AC001");

                        for(int x=0;x<10;x++)
                        {
                            Account_pr3 temp1=ID.get(x);
                            if(tsid.equals(temp1.getId()))
                            {
                                tid=ID.get(x);
                                break;
                            }
                        }

                        System.out.print("Enter Transfer amount : ");
                        double ta=sc.nextDouble();
                        temp.moneyTransfer(tid,ta);
                        ID.set(i,tid);
                        // System.out.println(tid.getBalance());

                        break;

                    case 5:
                        System.out.println("[5]Create Account");
                        System.out.print("Enter new unique account ID : ");
                        String newid=sc.next();
                        Account_pr3 nid= new Account_pr3(newid);
                        ID.add(nid);
                        System.out.println("New Account Created successfully !!!");
                        break;
                    case 6:
                        System.out.println("[6]Deactivate Account");
                        System.out.print("Enter account ID for Deactivation : ");
                        String dsid= sc.next();
                        Account_pr3 did=new Account_pr3("AC001");
                        int x;
                        for(x=0;x<10;x++)
                        {
                            Account_pr3 temp1=ID.get(x);
                            if(dsid.equals(temp1.getId()))
                            {
                                did=ID.get(x);
                                break;
                            }
                        }

                        ID.remove(x);
                        System.out.println("ID Deactivate successfully !!! ");
                        break;
                    case 8:
                        System.out.println("[8]ANOTHER account's Balance");
                        System.out.print("Enter Another account id : ");
                        String asid= sc.next();
                        Account_pr3 aid=new Account_pr3("AC001");

                        for(int u=0;u<10;u++)
                        {
                            Account_pr3 temp1=ID.get(u);
                            if(asid.equals(temp1.getId()))
                            {
                                aid=ID.get(u);
                                System.out.println("Your balance : " + aid.getBalance());
                                break;
                            }
                        }
                        break;
                }
                System.out.println("");
            }
        }
        else {
            System.out.println("ID IS NOT AVAILABLE !!!!");
        }
    }
}
