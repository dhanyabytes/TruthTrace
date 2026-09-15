package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("          TRUTHTRACE");
        System.out.println("  Digital Crime Investigation");
        System.out.println("=================================");

        System.out.println();
        System.out.println("Welcome, Detective.");
        System.out.println();

        System.out.println("========== SELECT CASE ==========");
        System.out.println();
        System.out.println("1. TT-001 - The Missing Necklace");
        System.out.println("2. TT-002 - The Vanishing Prototype");
        System.out.println("3. TT-003 - The Missing Research File");
        System.out.println("4. Exit");
        System.out.println();

        int choice;

        while (true) {

            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {

                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice >= 1 && choice <= 4) {
                    break;
                }
            }

            else {
                scanner.nextLine();
            }

            System.out.println(
                    "Invalid choice. Enter a number between 1 and 4."
            );
        }

        if (choice == 4) {

            System.out.println();
            System.out.println("TruthTrace closed.");
            scanner.close();
            return;
        }

        Investigation investigation =
                CaseManager.loadCase(choice);

        if (investigation != null) {

            System.out.println();
            System.out.println("Case loaded successfully.");
            System.out.println();

            investigation.startInvestigation();
        }

        scanner.close();
    }
}