package src;

public class Location {

    String name;
    String description;

    // Constructor
    public Location(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Display location information
    public void displayLocation() {

        System.out.println("---------------------------------");
        System.out.println("Location: " + name);
        System.out.println("Description: " + description);
        System.out.println("---------------------------------");
    }
}