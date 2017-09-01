
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<Student>();
        while(true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.equals("")) {
                System.out.println("");
                for(Student s : students) {
                    System.out.println(s.toString());
                }
                System.out.println("");
                System.out.print("Give search term: ");
                String search = reader.nextLine();
                System.out.println("Result:");
                for(Student s : students) {
                    if(s.getName().contains(search)) {
                        System.out.println(s.toString());
                    }
                }
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            students.add(new Student(name, studentNumber));
        }
    }
}