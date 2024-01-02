import java.util.Scanner;

public class iPhone extends Product {
    private String model;
    private String color;
    private String memory;

    public iPhone() {
        super("iPhone", 800.0, "I001");
    }

    @Override
            // Prompt the user to select iPhone features

    public void selectFeatures(Scanner scanner) {
        System.out.print("Select the iPhone model (iPhone12 or iPhone13): ");
        model = scanner.next();
        System.out.print("Select the iPhone color (Base, Silver, Gold): ");
        color = scanner.next();
        System.out.print("Select the iPhone memory (64, 128, 256, 512): ");
        memory = scanner.next();
    }

    @Override
            // Calculate the total price of the selected iPhone with specific features

    public double getPrice() {
        double totalPrice = getBasePrice();
                
        // Adjust the price based on the selected model


        if (model.equals("iPhone13")) {
            totalPrice += 200.0;
        } else if (model.equals("iPhone12")) {
            totalPrice += 0.0;
        }

                // Adjust the price based on the selected color


        if (color.equals("Gold")) {
            totalPrice += 20.0;
        } else if (color.equals("Silver")) {
            totalPrice += 10.0;
        } else if (color.equals("Base")) {
            totalPrice += 0.0;
        }

                // Adjust the price based on the selected memory


        if (memory.equals("64")) {
            totalPrice += 0.0;
        } else if (memory.equals("128")) {
            totalPrice += 100.0;
        } else if (memory.equals("256")) {
            totalPrice += 200.0;
        } else if (memory.equals("512")) {
            totalPrice += 300.0;
        }

        return totalPrice;
    }

    public String getModelPrice() {
        return "Model (" + model + ") ------ +" + (model.equals("iPhone13") ? 200.0 : 0.0);
    }

    public String getSelectedModelPrice() {
        return "Model (" + model + ") ------ +" + (model.equals("iPhone13") ? 200.0 : 0.0);
    }

    public String getSelectedColorPrice() {
        return "Color (" + color + ") ------ +" + (color.equals("Gold") ? 20.0 : color.equals("Silver") ? 10.0 : 0.0);
    }

    public String getCheckOutput() {
        String checkOutput = "===== Check =====\n";
    
        if (!model.equals("iPhone12")) {
            checkOutput += getModelPrice() + "\n";
        }
    
        if (!color.equals("Base")) {
            checkOutput += getSelectedColorPrice() + "\n";
        }
    
        if (!memory.equals("64")) {
            checkOutput += getMemoryPrice() + "\n";
        }
    
        return checkOutput;
    }
    
    

    @Override
    public String getColorPrice() {
        return (color.equals("Gold") ? "20.0" : color.equals("Silver") ? "10.0" : "0.0");
    }

    @Override
    public String getMemoryPrice() {
        return (memory.equals("128") ? "100.0" : memory.equals("256") ? "200.0" : memory.equals("512") ? "300.0" : "0.0");
    }

    @Override
    public String getSizePrice() {
        //Qick fix from vscode
        return "";
    }
}
