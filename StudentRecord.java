public class StudentRecord {

    private String name;
    private int stdId;
    private double [] marks;

    public StudentRecord(String n, int id , double [] mrk){
        name = n ;
        stdId = id;
        marks = mrk;
    }

   public double average(){
        double sum = 0;
        for(int i = 0 ; i < marks.length ; i++){
            sum = sum + marks[i];
        }
        double avg = sum / marks.length;
        return avg;
    }


    double highestMark(){
        double hst = marks[0];
        for(int i = 0 ; i < marks.length ; i++){
            if(marks[i] > hst){
                hst = marks[i];
            }
        }
        return hst;
    }


    double lowestMark(){
        double low = marks[0];
        for(int i = 0 ; i < marks.length ; i++){
            if(marks[i] < low){
                low = marks[i];
            }
        }
        return low;
    }



    public void display(){
        System.out.println("================================= " );
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + stdId);
        System.out.print("Marks: ");

        // Enhanched for loop
        // for(double mark : marks){
        //     System.out.println(mark + " ");
        // }

        for(int i = 0 ; i < marks.length ; i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
        System.out.println("Average Mark: " + average());
        System.out.println("Heighst Mark: " + highestMark());
        System.out.println("Lowhst Mark: " + lowestMark());
    }



    public static void main(String[] args){
        double [] marks = {34 , 56 ,78, 12};
        double [] marks2 = {45 , 67 ,89, 23};
        StudentRecord opar = new StudentRecord("Rijoan Raashid",  02, marks);

        StudentRecord rana = new StudentRecord("Rana islam", 03, marks2);
        opar.display();
        rana.display();
    }
}