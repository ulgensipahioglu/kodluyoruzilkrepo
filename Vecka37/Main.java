import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Courses
        Course math = new Course("Math");
        Course phy = new Course("Physics");
        Course eng = new Course("English");

        //Students
        Student Emma = new Student("Emma", "101");
        Student Bob = new Student("Bob", "102");
        Student Emy = new Student("Emy", "103");

        //Grades
        Emma.addGrade(new Grade(math, 1));
        Emma.addGrade(new Grade(phy, 2));
        Emma.addGrade(new Grade(eng, 2));

        Bob.addGrade(new Grade(math, 0));
        Bob.addGrade(new Grade(phy, 1));
        Bob.addGrade(new Grade(eng, 2));

        Emy.addGrade(new Grade(math, 2));
        Emy.addGrade(new Grade(phy, 1));
        Emy.addGrade(new Grade(eng, 0));

        ArrayList<Student> students = new ArrayList<>();
        students.add(Emy);
        students.add(Bob);
        students.add(Emy);
    

        //yazdir
 for (int i = 0; i < students.size(); i++) {
    Student student = students.get(i);
    System.out.println("Name: " + student.getName());
    System.out.println("ID: " + student.getId());

    for (int j = 0; j < student.getGrades().size(); j++) {
        Grade grade = student.getGrades().get(j);
        System.out.println("  " + grade.getCourse().getCourseName() + " → " + grade.getScore());
    }
}
}
}