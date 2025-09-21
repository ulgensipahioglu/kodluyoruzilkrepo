public class Student {
    String name;
    String socialSecurity;
    String[] courses;
    int[] grades;

    public Student(String name, String socialSecurity) {
        this.name = name;
        this.socialSecurity =socialSecurity;
        this.courses = new String[] {"Math", "English", "Swedish", "Programing"};
        this.grades = new int[this.courses.length];
    }

    public void setGrade(int index, int grade) {
        this.grades[index] = grade;
    }

    public double calculateAverage(){
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }

}
