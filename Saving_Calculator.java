import java.util.Scanner;

public class Assignment1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User input
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        scanner.close();

        int savings = calculateSavings(days);

        //Output
        System.out.println("Total Frank's saving (after " + days + " days): " + savings);

    }

    public static int calculateSavings(int days) {
        int savings = 0;
        int week = 1;

        // Adds the current week's savings
        for (int day = 1; day <= days; day++) {
            savings += week; 

        // Increases the week counter every 7 days
            if (day % 7 == 0) {
                week++; 
            }
        }

        return savings;
    }
}

