package Lms;

public class Student extends User implements ProgressTrackable {
    private String enrolledCourse1;
    private String enrolledCourse2;

    public Student(String name, String email, String userId) {
        super(name, email, userId);
        this.enrolledCourse1 = null;
        this.enrolledCourse2 = null;
    }

    public void enrollCourse(String courseName) {
        if (enrolledCourse1 == null) {
            this.enrolledCourse1 = courseName;
        } else if (enrolledCourse2 == null) {
            this.enrolledCourse2 = courseName;
        } else {
            System.out.println("Course enrollment limit reached for " + getName());
        }
    }

    @Override
    public void viewProfile() {
        System.out.println("Student Profile: " + getName() + ", " + getEmail() + ", ID: " + getUserId());
    }

    @Override
    public void trackProgress() {
        System.out.println(getName() + " is tracking progress in: ");
        if (enrolledCourse1 != null) {
			System.out.println("- " + enrolledCourse1);
		}
        if (enrolledCourse2 != null) {
			System.out.println("- " + enrolledCourse2);
		}
    }
}
