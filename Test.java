public class Test {
    public static void main(String[] args){
        // creating object
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        teacher1.name = "Rijoan Rashid Opar";
        teacher1.gender = "male";
        teacher1.age = 20;

        teacher2.getInput("Pranto","male" , 18);
        teacher1.display();
        teacher2.display();
    }
}
