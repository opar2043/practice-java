class Vehicle{
    String name;
    String color;
    int speed;

    Vehicle(String name , String color, int speed){
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    void display(){
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




public class testAcc {

  public static void main(String[] aStrings){
     Vehicle car = new Vehicle("Hanif", "Red", 100);
     car.display();

     AddObject bus = new AddObject("shymoli", "blue" , 33, 300);
     bus.display();
  }
}
