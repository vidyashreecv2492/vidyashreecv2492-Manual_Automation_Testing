package Lms;

public class Instructor extends User {
    private String createdCourse1;
    private String createdCourse2;

    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void createCourse(String courseName) {
        if (createdCourse1 == null) {
            this.createdCourse1 = courseName;
        } else if (createdCourse2 == null) {
            this.createdCourse2 = courseName;
        } else {
            System.out.println(getName() + " already created max number of courses.");
        }
    }

    @Override
    public void viewProfile() {
        System.out.println("Instructor Profile: " + getName() + ", " + getEmail() + ", ID: " + getUserId());
    }
}
