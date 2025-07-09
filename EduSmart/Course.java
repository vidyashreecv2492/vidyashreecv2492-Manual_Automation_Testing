package Lms;

public class Course {
    private String title;
    private int durationInHours;
    private final int maxStudents;

    public Course(String title, int durationInHours, int maxStudents) {
        this.title = title;
        this.durationInHours = durationInHours;
        this.maxStudents = maxStudents;
    }

    public Course(String title) {
        this(title, 1, 30); // default values
    }

    public void showCourseDetails() {
        System.out.println("Course: " + title + ", Duration: " + durationInHours + " hours, Max Students: " + maxStudents);
    }
}
