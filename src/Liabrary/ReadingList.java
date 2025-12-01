package src.Liabrary;

import java.util.ArrayList;

public class ReadingList {
    ArrayList <String> books = new ArrayList<>();

    public void addBook(String book){
        books.add(book);
    }

    public void removeBook(String book){
        books.remove(book);
    }

    public void display(){
        System.out.println("Books List");

        for(String b : books){
            System.out.println("-" + b);
        }
        System.out.println();
    }
}
