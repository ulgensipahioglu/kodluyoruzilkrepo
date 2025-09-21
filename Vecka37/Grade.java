public class Grade {
    private Course course;
    private int score; //0-2 arasi

    public Grade(Course course, int score){
        this.course = course;
        this.score = score;
    }
  public Course getCourse() {
        return course;
    }

    public int getScore() {
        return score;
    }

}
