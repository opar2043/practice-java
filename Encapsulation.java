class Vehicle{
    // Encapsulation - Data Hiding
    private  String color;
    private String name;
    private int speed;  

   Vehicle(String color , String name , int speed){
    // this keyword
        this.color = color;
        this.name = name;
        this.speed = speed;
    }

   public void showDetails(){
        System.out.println("Vehicle Name: " + name);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle Speed: " + speed);
    }
}

// Inheritance - data reusability
 class Bus extends Vehicle{
   private double price;
    Bus(String color , String name , int speed , double price){
        super(color, name, speed);
        this.price = price;
    }
  
// Polymorphisum - Method Overriding
 @Override
   public void showDetails(){
        super.showDetails();
        System.out.println("Bus Price: " + price);
    }
}



public class Encapsulation {
    // Test the Vehicle and Bus classes
    public static void main(String args[]){
     Vehicle car = new Vehicle("red" , "toyota" , 120);
     car.showDetails();

     Bus vrstyBus = new Bus(    "blue" , "Volvo" , 100 , 50000);
     vrstyBus.showDetails();
    }
}


