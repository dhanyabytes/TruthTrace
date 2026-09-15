package src;

import java.util.Scanner;

public class Investigation {

    private Case caseData;
    private Suspect[] suspects;
    private Evidence[] evidence;
    private Location[] locations;
    private Statement[] statements;
    private TimelineEvent[] timeline;

    private Scanner scanner;

    private boolean[] interviewed;
    private int[] interviewScores;

    private Deduction deduction;

    public Investigation(
            Case caseData,
            Suspect[] suspects,
            Evidence[] evidence,
            Location[] locations,
            Statement[] statements,
            TimelineEvent[] timeline) {

        this.caseData = caseData;
        this.suspects = suspects;
        this.evidence = evidence;
        this.locations = locations;
        this.statements = statements;
        this.timeline = timeline;

        scanner = new Scanner(System.in);

        interviewed = new boolean[suspects.length];
        interviewScores = new int[suspects.length];

        deduction = new Deduction(
                caseData.caseId,
                suspects,
                evidence
        );
    }

    public void startInvestigation() {

        int choice;

        do {

            displayMenu();

            choice = readNumber(
                    "Enter your choice: ",
                    1,
                    11
            );

            switch (choice) {

                case 1:
                    caseData.displayCase();
                    break;

                case 2:
                    displaySuspects();
                    break;

                case 3:
                    displayEvidence();
                    break;

                case 4:
                    examineEvidence();
                    break;

                case 5:
                    interviewSuspect();
                    break;

                case 6:
                    displayLocations();
                    break;

                case 7:
                    displayStatements();
                    break;

                case 8:
                    displayTimeline();
                    break;

                case 9:
                    analyzeEvidence();
                    break;

                case 10:
                    makeFinalDeduction();
                    break;

                case 11:
                    System.out.println();
                    System.out.println("Investigation closed.");
                    System.out.println("Thank you, Detective.");
                    break;
            }

        } while (choice != 11);
    }

    private void displayMenu() {

        System.out.println();
        System.out.println("=================================");
        System.out.println("       TRUTHTRACE INVESTIGATION");
        System.out.println("=================================");
        System.out.println("1. View Case");
        System.out.println("2. View Suspects");
        System.out.println("3. View Evidence");
        System.out.println("4. Examine Evidence");
        System.out.println("5. Interview Suspect");
        System.out.println("6. View Locations");
        System.out.println("7. View Statements");
        System.out.println("8. View Timeline");
        System.out.println("9. Analyze Evidence");
        System.out.println("10. Make Final Deduction");
        System.out.println("11. Exit");
        System.out.println("=================================");
    }

    private void displaySuspects() {

        System.out.println();
        System.out.println("========== SUSPECTS ==========");

        for (int i = 0; i < suspects.length; i++) {

            System.out.println();
            System.out.println("Suspect " + (i + 1));
            suspects[i].displaySuspect();
        }
    }

    private void displayEvidence() {

        System.out.println();
        System.out.println("========== EVIDENCE ==========");

        for (int i = 0; i < evidence.length; i++) {

            System.out.println();
            evidence[i].displayEvidence();
        }
    }

    private void examineEvidence() {

        System.out.println();
        System.out.println("========== EXAMINE EVIDENCE ==========");

        for (int i = 0; i < evidence.length; i++) {

            System.out.println(
                    (i + 1) + ". " + evidence[i].name
            );
        }

        System.out.println(
                (evidence.length + 1) + ". Back"
        );

        int choice = readNumber(
                "Select evidence: ",
                1,
                evidence.length + 1
        );

        if (choice == evidence.length + 1) {
            return;
        }

        evidence[choice - 1].examineEvidence();
    }

    private void interviewSuspect() {

        System.out.println();
        System.out.println("========== SUSPECT INTERVIEW ==========");

        for (int i = 0; i < suspects.length; i++) {

            String status =
                    interviewed[i]
                    ? "Interviewed"
                    : "Not Interviewed";

            System.out.println(
                    (i + 1) + ". "
                    + suspects[i].name
                    + " [" + status + "]"
            );
        }

        System.out.println(
                (suspects.length + 1) + ". Back"
        );

        int choice = readNumber(
                "Select suspect: ",
                1,
                suspects.length + 1
        );

        if (choice == suspects.length + 1) {
            return;
        }

        conductInterview(choice - 1);
    }

    private void conductInterview(int index) {

        Suspect suspect = suspects[index];

        int score = 0;
        boolean interviewFinished = false;

        System.out.println();
        System.out.println("=================================");
        System.out.println("INTERVIEWING: " + suspect.name);
        System.out.println("=================================");
        System.out.println("Role: " + suspect.role);

        while (!interviewFinished) {

            displayInterviewQuestions();

            int question = readNumber(
                    "Enter choice: ",
                    1,
                    5
            );

            if (question == 5) {

                interviewFinished = true;
                interviewed[index] = true;
                interviewScores[index] = score;

                System.out.println();
                System.out.println("Interview recorded.");
                System.out.println(
                        "Interview evidence score: " + score
                );

                continue;
            }

            score += answerQuestion(index, question);
        }
    }

    private void displayInterviewQuestions() {

        System.out.println();

        if (caseData.caseId.equals("TT-001")) {

            System.out.println("Choose a question:");
            System.out.println("1. Where were you at 8:25 PM?");
            System.out.println("2. What did you know about the necklace?");
            System.out.println("3. Did you enter the Study?");
            System.out.println("4. Did you notice anything unusual?");
            System.out.println("5. End Interview");

        }

        else if (caseData.caseId.equals("TT-002")) {

            System.out.println("Choose a question:");
            System.out.println("1. Where were you at 6:15 PM?");
            System.out.println("2. What did you know about the prototype?");
            System.out.println("3. Did you enter the Main Laboratory?");
            System.out.println("4. Did you notice anything unusual with the access scanner?");
            System.out.println("5. End Interview");

        }

        else if (caseData.caseId.equals("TT-003")) {

            System.out.println("Choose a question:");
            System.out.println("1. Where were you at 5:25 PM?");
            System.out.println("2. What did you know about the research file?");
            System.out.println("3. Did you enter the Research Office?");
            System.out.println("4. Did you notice anything unusual with the computer or server?");
            System.out.println("5. End Interview");
        }
    }

    private int answerQuestion(int index, int question) {

        String name = suspects[index].name;

        System.out.println();

        // =========================
        // CASE TT-001
        // =========================

        if (caseData.caseId.equals("TT-001")) {

            if (index == 0) {

                if (question == 1) {
                    System.out.println(
                            name + ": I was in the Library."
                    );
                    return 0;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew the necklace was valuable."
                    );
                    return 0;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": No, I had no reason to enter the Study."
                    );
                    return 0;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": I noticed nothing unusual."
                    );
                    return 0;
                }
            }

            else if (index == 1) {

                if (question == 1) {
                    System.out.println(
                            name + ": I was upstairs in my bedroom."
                    );
                    return 0;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": Everyone knew about the necklace."
                    );
                    return 0;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": No, I stayed upstairs."
                    );
                    return 0;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": I heard some movement downstairs."
                    );
                    return 0;
                }
            }

            else if (index == 2) {

                if (question == 1) {
                    System.out.println(
                            name + ": I was checking the Main Entrance."
                    );
                    return 5;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew it was kept in the Study."
                    );
                    return 5;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": I did not enter the Study."
                    );
                    return 0;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": The security camera stopped temporarily."
                    );
                    return 5;
                }
            }

            else {

                if (question == 1) {
                    System.out.println(
                            name + ": I stayed in the Dining Room."
                    );
                    return 0;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew the necklace was being displayed."
                    );
                    return 5;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": No, I remained with the guests."
                    );
                    return 5;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": I noticed several people moving around."
                    );
                    return 5;
                }
            }
        }

        // =========================
        // CASE TT-002
        // =========================

        else if (caseData.caseId.equals("TT-002")) {

            if (index == 0) {

                if (question == 1) {
                    System.out.println(
                            name + ": I was working in the Testing Room."
                    );
                    return 0;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew the prototype was being tested."
                    );
                    return 0;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": I did not enter the Main Laboratory."
                    );
                    return 0;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": I noticed the testing equipment was still running."
                    );
                    return 0;
                }
            }

            else if (index == 1) {

                if (question == 1) {
                    System.out.println(
                            name + ": I was in the Research Office."
                    );
                    return 0;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew the prototype was important."
                    );
                    return 0;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": I did not enter the Main Laboratory."
                    );
                    return 0;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": I heard the access scanner malfunctioning."
                    );
                    return 0;
                }
            }

            else if (index == 2) {

                if (question == 1) {
                    System.out.println(
                            name + ": I was checking equipment."
                    );
                    return 5;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew the prototype was stored in the laboratory."
                    );
                    return 5;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": I had to enter the Main Laboratory to check equipment."
                    );
                    return 10;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": The access scanner stopped recording entries."
                    );
                    return 5;
                }
            }

            else {

                if (question == 1) {
                    System.out.println(
                            name + ": I remained in the Main Laboratory."
                    );
                    return 5;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew about the prototype because I coordinated the project."
                    );
                    return 5;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": Yes, I was coordinating work there."
                    );
                    return 5;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": I noticed the access scanner was malfunctioning."
                    );
                    return 5;
                }
            }
        }

        // =========================
        // CASE TT-003
        // =========================

        else if (caseData.caseId.equals("TT-003")) {

            if (index == 0) {

                if (question == 1) {
                    System.out.println(
                            name + ": I was working in the Digital Archive."
                    );
                    return 0;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew the research file existed."
                    );
                    return 0;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": I did not enter the Research Office."
                    );
                    return 0;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": I noticed nothing unusual."
                    );
                    return 0;
                }
            }

            else if (index == 1) {

                if (question == 1) {
                    System.out.println(
                            name + ": I was organizing documents in the Research Office."
                    );
                    return 5;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew the file contained confidential research."
                    );
                    return 5;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": Yes, I was working in the office."
                    );
                    return 5;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": I noticed the computer had been accessed."
                    );
                    return 5;
                }
            }

            else if (index == 2) {

                if (question == 1) {
                    System.out.println(
                            name + ": I was checking the server systems."
                    );
                    return 5;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew the server contained sensitive information."
                    );
                    return 5;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": I had no reason to enter the Research Office."
                    );
                    return 0;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": The server recorded an unusual access request."
                    );
                    return 5;
                }
            }

            else {

                if (question == 1) {
                    System.out.println(
                            name + ": I was preparing for a meeting in the Conference Room."
                    );
                    return 0;
                }

                if (question == 2) {
                    System.out.println(
                            name + ": I knew the research was important to the project."
                    );
                    return 5;
                }

                if (question == 3) {
                    System.out.println(
                            name + ": I did not enter the Research Office."
                    );
                    return 0;
                }

                if (question == 4) {
                    System.out.println(
                            name + ": I noticed a printed document in the Conference Room."
                    );
                    return 10;
                }
            }
        }

        return 0;
    }

    private void displayLocations() {

        System.out.println();
        System.out.println("========== LOCATIONS ==========");

        for (Location location : locations) {

            System.out.println();
            location.displayLocation();
        }
    }

    private void displayStatements() {

        System.out.println();
        System.out.println("========== STATEMENTS ==========");

        for (Statement statement : statements) {

            System.out.println();
            statement.displayStatement();
        }
    }

    private void displayTimeline() {

        System.out.println();
        System.out.println("========== TIMELINE ==========");

        for (TimelineEvent event : timeline) {

            System.out.println();
            event.displayEvent();
        }
    }

    private void analyzeEvidence() {

        System.out.println();
        System.out.println("========== CASE ANALYSIS ==========");

        System.out.println();
        System.out.println("Checking evidence...");
        System.out.println("Comparing suspect statements...");
        System.out.println("Checking timeline...");
        System.out.println("Evaluating interview responses...");

        deduction.analyzeCase(
                interviewScores,
                interviewed
        );

        deduction.displayAnalysis();
    }

    private void makeFinalDeduction() {

        System.out.println();
        System.out.println("=================================");
        System.out.println("         FINAL DEDUCTION");
        System.out.println("=================================");

        int interviewedCount = 0;

        for (boolean status : interviewed) {

            if (status) {
                interviewedCount++;
            }
        }

        System.out.println();
        System.out.println(
                "Suspects interviewed: "
                + interviewedCount
                + "/" + suspects.length
        );

        System.out.println();
        System.out.println("Who do you believe is responsible?");
        System.out.println();

        for (int i = 0; i < suspects.length; i++) {

            System.out.println(
                    (i + 1) + ". " + suspects[i].name
            );
        }

        System.out.println();

        int accused = readNumber(
                "Enter your accusation: ",
                1,
                suspects.length
        );

        deduction.analyzeCase(
                interviewScores,
                interviewed
        );

        deduction.displayFinalResult(accused - 1);
    }

    private int readNumber(
            String message,
            int minimum,
            int maximum) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();
                scanner.nextLine();

                if (number >= minimum && number <= maximum) {
                    return number;
                }
            }

            else {
                scanner.nextLine();
            }

            System.out.println(
                    "Invalid input. Enter a number between "
                    + minimum + " and " + maximum + "."
            );
        }
    }
}