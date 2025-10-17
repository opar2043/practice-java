public class Bank{
    private String name;
    private int balance;
    private String accountNumber;

    Bank(String name , int balance , String accountNumber){
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;

        System.out.println("Account created for " + name + " AccNum " + accountNumber + " balance " + balance);
    }

    void deposit(int amount){
        if(amount > 0 ){
            balance += amount;
            System.out.println("Deposited " + amount );
        }else{
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew " + amount );
        }
    }


    void showBalance(){
        System.out.println("Current balance: " + balance);
    }


   public static void main(String args[]){
    Bank rana = new Bank("Rana" , 5000 , "ACC12345");
    rana.deposit(300);
    rana.showBalance();
    rana.withdraw(200);
    rana.showBalance();
    
   }   

}