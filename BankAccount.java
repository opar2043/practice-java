public class BankAccount {
    private String accountname;
    private  int accountnumber ;
    private int balance;

    BankAccount(String accountname , int accountnumber , int balance){
        this.accountname = accountname;
        this.accountnumber = accountnumber;
        this.balance = balance;
        System.out.println("Bank account created for " + accountname + " (Acc Number: " + accountnumber + ")");
        showBalance();
    }

    void deposit(int amount){
        if(amount > 0){
            System.out.println("Depositing " + amount);
            balance = balance + amount;
        }else{
            System.out.println("Invalid amount to deposit.");
        }
        showBalance();
    }


    void withdraw(int amount){
        if(amount> 0 && balance >= amount){
            balance = balance - amount;
            System.out.println("Withdrawing " + amount);
        }else{
            System.out.println("Invalid amount to withdraw.");
        }
        showBalance();
    }

    void showBalance(){
        System.out.println("Current balance: " + balance);
    }


  public static void main(String[] args){
    BankAccount account = new BankAccount("Rijoan Rashid" , 2034 , 5000);
    account.deposit((2000));
    account.withdraw(1000);


    BankAccount account2 = new BankAccount("John Doe" , 2035 , 3000);
    account2.deposit(700);
  } 


}
