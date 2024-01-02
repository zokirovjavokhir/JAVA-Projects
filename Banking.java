import java.util.Scanner;


public class Assignment1_1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Input from the user
        System.out.print("Your name: ");
        String name = scanner.nextLine();

        System.out.print("Initial Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Percentage: ");
        double percentage = scanner.nextDouble();

        System.out.print("Number of years: ");
        int years = scanner.nextInt();

        //Calculates the final amount of(balance/percentage/years)
        double finalAmount = calculateFinalAmount(balance, percentage, years);

        //Output
        System.out.println(" ");
        System.out.println("User name: " + name);

        System.out.println("Percentage: " + percentage);

        System.out.println("Your balance (after 3 years): " + finalAmount);
        scanner.close();
    }

        public static double calculateFinalAmount(double finalBalance, double percentage, int years) {
            double balance = finalBalance;
            
            //Calculate the interst based on specific number of years
            for (int i= 0; i < years; i++) {
                balance += balance * percentage / 100;
            }
            return balance;
        }
    }