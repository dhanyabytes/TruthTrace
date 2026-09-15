package src;

public class Statement {

    String suspectName;
    String statementText;
    String time;
    String location;

    // Constructor
    public Statement(String suspectName, String statementText,
                     String time, String location) {

        this.suspectName = suspectName;
        this.statementText = statementText;
        this.time = time;
        this.location = location;
    }

    // Display statement
    public void displayStatement() {

        System.out.println("---------------------------------");
        System.out.println("Suspect: " + suspectName);
        System.out.println("Statement: " + statementText);
        System.out.println("Time: " + time);
        System.out.println("Location: " + location);
        System.out.println("---------------------------------");
    }
}