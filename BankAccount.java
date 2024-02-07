import java.util.Scanner;

class BankAccount{
    private int balance;

    public BankAccount(int initialamount){
        balance = initialamount;
    }

    public int balance(){
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit of Rs. " + amount + " was successfull. \n New balance: Rs."+ balance);
        } else {
            System.out.println("Invalid entry!. Please choose a number above 0");
        }
    }

    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            balance-=amount;
            System.out.println("Withdraw successfull of Rs."+amount+" was successfull. \n New balance: Rs."+ balance);           
        } else {
            System.out.println("Invaid entry!!.Insuffucient balance or negative value entered");
        }
    }
}
class ATM{

    private BankAccount account; 
    public ATM(BankAccount account){
        this.account = account;
    }

    public void display(){
        System.out.println("Select choices\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Leave");
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            display();
            System.out.println("Pick an choice");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                System.out.println("Enter amount to deposit");
                int depositamount = sc.nextInt();
                account.deposit(depositamount);

                break;
                case 2:
                System.out.println("Enter amount to withdraw");
                int withdrawamount = sc.nextInt();
                account.withdraw(withdrawamount);

                break;
                case 3:
                System.out.println("Current balance: Rs. " + account.balance());
                break;
                case 4:
                System.out.println("Thanks for working with The Bank");
                break;
                default:
                System.out.println("Invalid entry!!. Enter only the given choices");   
            }
        }while (choice != 4);
        sc.close();
    }
}


class main {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Initial Amount");
        BankAccount account = new BankAccount(sc.nextInt());
        new ATM(account).run();
    }
}