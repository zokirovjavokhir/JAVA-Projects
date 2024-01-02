import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome Apple Korea ===");
        int choice;

        do {
            System.out.println("Choose 1 for MacBook");
            System.out.println("Choose 2 for iPhone");
            System.out.println("Choose 3 for AirPods");
            System.out.println("Choose 0 for Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    orderProduct(new MacBook(), scanner);
                    break;

                case 2:
                    orderProduct(new iPhone(), scanner);
                    break;

                case 3:
                    orderProduct(new AirPods(), scanner);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

            System.out.print("Do you want to purchase something else (Yes: 1, No: 0): ");
            choice = scanner.nextInt();
        } while (choice != 0);

        System.out.println("Thank you for your purchase!");
    }
    // This method handles ordering a specific product, taking user input and calculating costs.

    private static void orderProduct(Product product, Scanner scanner) {
        product.displayBaseCost();
        product.selectFeatures(scanner); 
        int quantity = product.selectQuantity(scanner);

                // Generate and display the "Check" output

        String checkOutput = product.getCheckOutput();
        System.out.println(checkOutput);

        double totalCost = product.calculateTotalCost(quantity);
        System.out.println("Total cost for one " + product.getName() + ": $" + (totalCost / quantity));
        System.out.println("Total cost (quantity × " + quantity + "): $" + totalCost);
        // Generate and display the "Check" output
       
    }
}
