import java.util.ArrayList;
import java.util.List;

public class Cource {
    private int courseId;
    private String courseName;
    private List<Enrollment> enrollments;

    public Cource(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrollments = new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }
}
