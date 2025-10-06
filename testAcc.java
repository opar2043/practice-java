public class testAcc{

    // Encapsulation Example
    private double balance;

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Depositing : " + amount);
        }
    }
    public void getBalance(){
        System.out.println("Current balance: " + balance);
    }

    // Inheritence Example
    public class info extends testAcc{
        String name = "Rijoan Rashid";
        int accNumber = 2034;
    }

    public static void main(String[] args){
        testAcc acc1 = new testAcc();
        acc1.deposit(2000);
        acc1.getBalance();       
        acc1.deposit(300);
    } 


}
