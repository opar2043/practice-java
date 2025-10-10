
// Encapsulation

import java.lang.reflect.Type;

class Vehicle{
   String name;
   String color;
   private int speed;

    public void setSpeed(int speed){         
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

     
    Vehicle(String name , String color, int speed){       // Constructor
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    void display(){                         // Method
        System.out.println("name: " + name);
        System.out.println("color: " + color);
        System.out.println("speed: " + speed);
        
    }
}


// Inehritance
class AddObject extends Vehicle{
    double price;
    
    AddObject(String name , String color, int speed , double price){
        super(name , color , speed);
        this.price = price;
    }

 
   @Override
   void display() {
       // TODO Auto-generated method stub
       super.display();
       System.out.println("Price: " + price);
   }

}

class TypeVehicle extends AddObject{
    String type ;

    TypeVehicle(String name , String color, int speed , double price , String type){
        super(name, color, speed, price);
        this.type = type;
    }

 @Override
   void display(){
     super.display();
     System.out.println("Type: " + type);
    }
}

public class testAcc {

  public static void main(String[] aStrings){  
     Vehicle car = new Vehicle("Hanif", "Red", 100);
     car.display();

     AddObject bus = new AddObject("shymoli", "blue" , 33, 300);
     bus.display();

    TypeVehicle truck = new TypeVehicle("Truck", "Black", 50, 500, "bike");
    truck.display();
  }
}
