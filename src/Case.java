package src;

public class Case {

    String caseId;
    String title;
    String description;
    String location;

    // Constructor
    public Case(String caseId, String title, String description, String location) {
        this.caseId = caseId;
        this.title = title;
        this.description = description;
        this.location = location;
    }

    // Display case information
    public void displayCase() {
        System.out.println("=================================");
        System.out.println("CASE ID: " + caseId);
        System.out.println("TITLE: " + title);
        System.out.println("LOCATION: " + location);
        System.out.println("=================================");
        System.out.println("DESCRIPTION:");
        System.out.println(description);
        System.out.println();
    }
}