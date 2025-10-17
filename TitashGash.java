public class TitashGash {
    
    int customerId;
    String name;
    int unit;

    TitashGash(int id , String n , int u){
        customerId = id;
        name = n;
        unit = u;
    }

    void calcBill(int unit){
        int bill = 0;
        if(unit >= 0 && unit <= 50){
          bill = unit * 8;
        }else if(unit >= 51 && unit <= 150){
          bill = unit * 12;
        }else {
          bill = unit * 16; 
        }

        System.out.println("Total Bill: " + bill);
    }




    void display(){
        System.out.println("===== Customer Details =======");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Unit Consumed: " + unit);
    }


    public static void main (String[] args){
       TitashGash cus1 = new TitashGash(1, "Rijoan Rashid", 15);
       cus1.display();
       cus1.calcBill(20);
    }
}
