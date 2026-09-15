package src;

public class Suspect {

    String name;
    int age;
    String role;
    String location;
    String motive;

    // Constructor
    public Suspect(String name, int age, String role, String location, String motive) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.location = location;
        this.motive = motive;
    }

    // Display suspect information
    public void displaySuspect() {
        System.out.println("---------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Last Known Location: " + location);
        System.out.println("Possible Motive: " + motive);
        System.out.println("---------------------------------");
    }
    public void interviewSuspect() {
    System.out.println();
    System.out.println("Interviewing: " + name);
    System.out.println("---------------------------------");
    System.out.println("Role: " + role);
    System.out.println("Last Known Location: " + location);
    System.out.println("Possible Motive: " + motive);
    System.out.println("---------------------------------");
    System.out.println("The suspect is ready to answer questions.");
}
}