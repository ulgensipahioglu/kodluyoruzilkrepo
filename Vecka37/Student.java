import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name; //Student's name
    private String ID; //Student's personal id nummer
    private List<Grade> grades; //her ogrenci kendi ders+not listesini tutacak

public Student(String name, String ID) {
    this.name = name;
    this.ID = ID;
    this.grades = new ArrayList<>();
    }

public void addGrade(Grade grade){
    grades.add(grade);
}

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return ID;
    }

    public List<Grade> getGrades() {
        return grades;
    }
}




