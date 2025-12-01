package src.FamilyShoping;

public class TestGroceryMain {
    public static void main(String[] args) {
        GroceryShop grocery = new GroceryShop();

        grocery.addItem("Milk");
        grocery.addItem("Meat");
        grocery.addItem("Chicken");

        // ii. Display the list
        System.out.println("After adding items:");
        grocery.display();

        grocery.remove("Milk");
                // iv. Display the list again
        System.out.println("After removing :" );
        grocery.display();
    }
}
