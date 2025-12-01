package src.FamilyShoping;

import java.util.ArrayList;

public class GroceryShop {
     ArrayList<String> items = new ArrayList<>();

     public void addItem(String item){
         items.add(item);
     }

     public void remove(String item){
        items.remove(item);
     }

     public void display(){
        System.out.println("Grocery List");

        for(String item : items){
            System.out.println("-" + item);
        }
        System.out.println();
     }
}
