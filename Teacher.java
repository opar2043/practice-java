public class Teacher {
    String name, gender;
    int age;

    void display(){
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
    }

    void getInput(String n , String g, int a){
      name = n;
      gender = g;
      age = a;
    }

    
}

