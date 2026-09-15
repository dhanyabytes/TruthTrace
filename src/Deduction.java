package src;

public class Deduction {

    private String caseId;
    private Suspect[] suspects;
    private Evidence[] evidence;

    // Internal investigation scores
    // These are NOT displayed to the player.
    private int[] scores;

    private int culpritIndex;

    public Deduction(
            String caseId,
            Suspect[] suspects,
            Evidence[] evidence) {

        this.caseId = caseId;
        this.suspects = suspects;
        this.evidence = evidence;

        scores = new int[suspects.length];

        determineCulprit();
    }

    // Determines the correct suspect for each case.
    private void determineCulprit() {

        if (caseId.equals("TT-001")) {

            // The Missing Necklace
            culpritIndex = 3;

        } 
        else if (caseId.equals("TT-002")) {

            // The Vanishing Prototype
            culpritIndex = 2;

        } 
        else if (caseId.equals("TT-003")) {

            // The Missing Research File
            culpritIndex = 3;
        }
    }

    // Calculates internal investigation scores.
    // Scores are used only by the program and are never shown to the player.
    public void analyzeCase(
            int[] interviewScores,
            boolean[] interviewed) {

        for (int i = 0; i < suspects.length; i++) {

            scores[i] = 0;

            if (interviewed[i]) {
                scores[i] += interviewScores[i];
            }

            if (caseId.equals("TT-001")) {

                if (i == 0) {
                    scores[i] += 10;
                } 
                else if (i == 1) {
                    scores[i] += 15;
                } 
                else if (i == 2) {
                    scores[i] += 25;
                } 
                else if (i == 3) {
                    scores[i] += 50;
                }

            } 
            else if (caseId.equals("TT-002")) {

                if (i == 0) {
                    scores[i] += 10;
                } 
                else if (i == 1) {
                    scores[i] += 15;
                } 
                else if (i == 2) {
                    scores[i] += 55;
                } 
                else if (i == 3) {
                    scores[i] += 25;
                }

            } 
            else if (caseId.equals("TT-003")) {

                if (i == 0) {
                    scores[i] += 10;
                } 
                else if (i == 1) {
                    scores[i] += 25;
                } 
                else if (i == 2) {
                    scores[i] += 20;
                } 
                else if (i == 3) {
                    scores[i] += 55;
                }
            }
        }
    }

    // Displays the evidence without revealing suspect scores or hints.
    public void displayAnalysis() {

        System.out.println();
        System.out.println("========== EVIDENCE ANALYSIS ==========");

        System.out.println();
        System.out.println("The following evidence has been collected:");

        System.out.println();

        for (Evidence e : evidence) {

            System.out.println("---------------------------------");

            // Uses the Evidence object's own display method.
            e.displayEvidence();
        }

        System.out.println("---------------------------------");

        System.out.println();
        System.out.println(
                "Analyze the evidence and suspect statements carefully."
        );

        System.out.println(
                "Use your own reasoning before making the final deduction."
        );
    }

    // Displays the result after the detective makes an accusation.
    public void displayFinalResult(int accusedIndex) {

        System.out.println();

        if (accusedIndex == culpritIndex) {

            System.out.println("=================================");
            System.out.println("       DEDUCTION CORRECT");
            System.out.println("=================================");

            System.out.println();

            System.out.println(
                    "You identified "
                    + suspects[culpritIndex].name
                    + " correctly."
            );

            System.out.println();

            System.out.println(
                    "The evidence supports your deduction."
            );

            displayCaseResolution();

        } 
        else {

            System.out.println("=================================");
            System.out.println("       DEDUCTION INCORRECT");
            System.out.println("=================================");

            System.out.println();

            System.out.println(
                    "Your accusation was: "
                    + suspects[accusedIndex].name
            );

            System.out.println();

            System.out.println(
                    "The evidence does not sufficiently support this suspect."
            );

            System.out.println();

            System.out.println(
                    "Review the evidence and suspect statements again."
            );
        }
    }

    // Displays the resolution only after the correct deduction.
    private void displayCaseResolution() {

        System.out.println();
        System.out.println("========== CASE RESOLUTION ==========");

        if (caseId.equals("TT-001")) {

            System.out.println(
                    "Sophie had financial pressure and access to the gathering."
            );

            System.out.println(
                    "The black fabric evidence and her statements raise"
            );

            System.out.println(
                    "the strongest connection to the missing necklace."
            );

        } 
        else if (caseId.equals("TT-002")) {

            System.out.println(
                    "Arjun had legitimate access to laboratory equipment."
            );

            System.out.println(
                    "The prototype carrying case was found near the"
            );

            System.out.println(
                    "equipment room, linking his access to the disappearance."
            );

        } 
        else if (caseId.equals("TT-003")) {

            System.out.println(
                    "Tanya had a strong research competition motive."
            );

            System.out.println(
                    "A partial copy of the confidential file was found"
            );

            System.out.println(
                    "in the Conference Room where she claimed to be working."
            );
        }

        System.out.println();
        System.out.println("CASE SOLVED.");
    }
}