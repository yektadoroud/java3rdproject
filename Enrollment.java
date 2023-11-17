public class Enrollment {
    private Student student;
    private Cource course;
    private String term;
    private int year;

    public Enrollment(Student student, Cource course, String term, int year) {
        this.student = student;
        this.course = course;
        this.term = term;
        this.year = year;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Cource getCourse() {
        return course;
    }

    public void setCourse(Cource course) {
        this.course = course;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
