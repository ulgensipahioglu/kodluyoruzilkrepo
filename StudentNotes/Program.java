import java.util.ArrayList;

public class Program {
    public Program() {}
    public void run() {
        Student student1 = new Student("Fredrik", "123456");
        Student student2 = new Student("Ulgen", "456789");

       /*  System.out.println(student1.name);
        System.out.println(student1.grades[0]);*/

       ArrayList<Student> myStudents = new ArrayList<>();

        myStudents.add(student1);
        myStudents.add(student2);
      

        student1.setGrade(0, 2);
        student1.setGrade(1, 1);
        student1.setGrade(2, 1);
        student1.setGrade(3, 2);

        System.out.println(student1.calculateAverage());

    }
}