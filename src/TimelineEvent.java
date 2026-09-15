package src;

public class TimelineEvent {

    String time;
    String event;
    String location;

    // Constructor
    public TimelineEvent(String time, String event, String location) {
        this.time = time;
        this.event = event;
        this.location = location;
    }

    // Display timeline event
    public void displayEvent() {

        System.out.println("---------------------------------");
        System.out.println("Time: " + time);
        System.out.println("Event: " + event);
        System.out.println("Location: " + location);
        System.out.println("---------------------------------");
    }
}