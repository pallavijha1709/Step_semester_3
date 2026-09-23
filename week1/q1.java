package week1;
import java.util.Scanner;

public class q1 {

    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;

        System.out.println("Duplicate Seat Numbers:");

        // Compare every seat with every other seat
        for (int i = 0; i < seatNumbers.length; i++) {

            boolean alreadyPrinted = false;

            for (int j = 0; j < i; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < seatNumbers.length; j++) {

                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] seatNumbers = new int[n];

        System.out.println("Enter the seat numbers:");

        for (int i = 0; i < n; i++) {
            seatNumbers[i] = sc.nextInt();
        }

        checkDuplicateSeats(seatNumbers);

        sc.close();
    }
}
