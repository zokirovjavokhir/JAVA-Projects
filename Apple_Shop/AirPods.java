import java.util.Scanner;

public class AirPods extends Product {
    private String model;

    public AirPods() {
        super("AirPods", 120.0, "A001");
    }

    @Override
                // Prompt the user to select AirPods features

    public void selectFeatures(Scanner scanner) {
        System.out.print("Select the AirPods model (AirPods3, AirPodsPro, AirPodsMax): ");
        model = scanner.next();
    }

    @Override
    public double getPrice() {
        // Calculate the AirPods price based on its features
        double totalPrice = getBasePrice();

        if (model.equals("AirPodsPro")) {
            totalPrice += 100.0;
        } else if (model.equals("AirPodsMax")) {
            totalPrice += 200.0;
        }

        return totalPrice;
    }

    public String getCheckOutput() {
        String checkOutput = "===== Check =====\n";

        if (!model.equals("AirPods3")) {
            checkOutput += "Model (" + model + ") ------ +$" + getModelPrice() + "\n";
        }

        return checkOutput;
    }

    @Override
    public String getColorPrice() {
        // vscode quick fix
        return "";
    }

    @Override
    public String getModelPrice() {
        return (model.equals("AirPodsPro") ? "100.0" : model.equals("AirPodsMax") ? "200.0" : "0.0");
    }

    @Override
    public String getMemoryPrice() {
        // vscode quick fix
        return "";
    }

    @Override
    public String getSizePrice() {
        // vscode quick fix
        return ""; 
    }
}
