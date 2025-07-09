package Lms;
public class Main {
    public static void main(String[] args) {
        // Step 1: Create users
        Student s1 = new Student("Vidya", "vidya@gmail.com", "S101");
        Student s2 = new Student("Riya", "riya@gmail.com", "S102");
        Instructor i1 = new Instructor("Sandesh", "sandesh@gmail.com", "I201");
        Instructor i2 = new Instructor("Varun", "varun@gmail.com", "I202");
        Admin admin = new Admin("Zufran", "admin@edusmart.com", "A001");
        
        String course1 = "Core Java";
        String course2 = "OOP Concepts";
        String course3 = "Manual Testing";
        String course4 = "Agile";

        // Step 2: Instructors create courses
        i1.createCourse(course1);
        i1.createCourse(course2);

        i2.createCourse(course3);
        i2.createCourse(course4);

        // Step 3: Students enroll
        s1.enrollCourse(course1);
        s1.enrollCourse(course2);

        s2.enrollCourse(course3);
        s2.enrollCourse(course4);

        // Step 4: Display profiles
        s1.viewProfile();
        s2.viewProfile();
        i1.viewProfile();
        i2.viewProfile();
        admin.viewProfile();

        // Step 5: Track student progress
        s1.trackProgress();
        s2.trackProgress();

        // Step 6: Admin removes a user
        admin.removeUser(s2);

        // Step 7: Display course details
        Course c1 = new Course("Core Java", 2, 50);
        Course c2 = new Course("Manual Testing");
        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}