package src;

public class Evidence {

    String evidenceId;
    String name;
    String description;
    String location;
    String importance;

    // Constructor
    public Evidence(String evidenceId, String name, String description,
                    String location, String importance) {

        this.evidenceId = evidenceId;
        this.name = name;
        this.description = description;
        this.location = location;
        this.importance = importance;
    }

    // Display evidence information
    public void displayEvidence() {

        System.out.println("---------------------------------");
        System.out.println("Evidence ID: " + evidenceId);
        System.out.println("Evidence: " + name);
        System.out.println("Description: " + description);
        System.out.println("Found At: " + location);
        System.out.println("Importance: " + importance);
        System.out.println("---------------------------------");
    }
    public void examineEvidence() {
    System.out.println();
    System.out.println("Examining: " + name);
    System.out.println("Description: " + description);
    System.out.println("Found At: " + location);
    System.out.println("Importance: " + importance);
    System.out.println("Evidence examined successfully.");
}
}