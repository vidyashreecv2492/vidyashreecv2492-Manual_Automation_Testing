package Lms;

public class Admin extends User {
    public Admin(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void removeUser(User user) {
        System.out.println("Admin has removed user: " + user.getName());
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin Profile: " + getName() + ", " + getEmail() + ", ID: " + getUserId());
    }
}
