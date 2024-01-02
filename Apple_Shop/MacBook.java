import java.util.Scanner;

public class MacBook extends Product {
    private String model;
    private String selectedSize;
    private String color;
    private String memory;

    public MacBook() {
        super("MacBook", 1000.0, "M001");
    }

    @Override
                // Prompt the user to select MacBook features

    public void selectFeatures(Scanner scanner) {
        System.out.print("Select the MacBook model (Air or Pro): ");
        model = scanner.next();
        System.out.print("Select the MacBook size (13 inch, 14 inch, or 16 inch): ");
        selectedSize = scanner.next();
        System.out.print("Select the MacBook color (Base, Silver, Gold): ");
        color = scanner.next();
        System.out.print("Select the MacBook memory (128GB, 256GB, 512GB): ");
        memory = scanner.next();
    }

    @Override
                // Calculate the total price of the selected MacBook with specific features

    public double getPrice() {
        double totalPrice = getBasePrice();

                // Adjust the price based on the selected model


        if (model.equals("Pro")) {
            totalPrice += 200.0;
        }

        if (selectedSize.equals("14 inch")) {
            totalPrice += 100.0;
        } else if (selectedSize.equals("16 inch")) {
            totalPrice += 200.0;
        }

                // Adjust the price based on the selected color


        if (color.equals("Gold")) {
            totalPrice += 20.0;
        } else if (color.equals("Silver")) {
            totalPrice += 10.0;
        }

                // Adjust the price based on the selected size


        if (memory.equals("256GB")) {
            totalPrice += 100.0;
        } else if (memory.equals("512GB")) {
            totalPrice += 300.0;
        }

        return totalPrice;
    }

    public String getCheckOutput() {
        String checkOutput = "===== Check =====\n";
    
        if (!model.equals("Air")) {
            checkOutput += "Model (" + model + ") ------ +" + getModelPrice() + "\n";
        }
    
        double sizePrice = Double.parseDouble(getSizePrice());
    
        if (!selectedSize.equals("13 inch")) {
            checkOutput += "Size (" + selectedSize + ") ------ +" + sizePrice + "\n";
        }
    
        if (!color.equals("Base")) {
            checkOutput += "Color (" + color + ") ------ +" + getColorPrice() + "\n";
        }
    
        if (!memory.equals("128GB")) {
            checkOutput += "Memory (" + memory + ") ------ +" + getMemoryPrice() + "\n";
        }
    
        return checkOutput;
    }
    

    @Override
    public String getColorPrice() {
        return (color.equals("Gold") ? "20.0" : color.equals("Silver") ? "10.0" : "0.0");
    }

    @Override
    public String getModelPrice() {
        return (model.equals("Pro") ? "200.0" : "0.0");
    }

    @Override
    public String getMemoryPrice() {
        return (memory.equals("256GB") ? "100.0" : memory.equals("512GB") ? "300.0" : "0.0");
    }

    @Override
public String getSizePrice() {
    if (selectedSize.equals("16 inch")) {
        return "200.0";
    }
    return (selectedSize.equals("14 inch") ? "100.0" : "0.0");
}
}
