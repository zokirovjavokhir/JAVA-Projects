import java.util.Scanner;

public abstract class Product {
    private String name;
    private double basePrice;
    private String code;
    protected String selectedModel;
    private String selectedColor;
    private String selectedMemory;
    private String selectedSize;

    public Product(String name, double basePrice, String code) {
        this.name = name;
        this.basePrice = basePrice;
        this.code = code;
    }

    // Abstract method to calculate the price of the product based on selected features
    public abstract double getPrice();

    public String getName() {
        return name;
    }

    // Get the product code
    public String getCode() {
        return code;
    }

    protected double getBasePrice() {
        return basePrice;
    }

    // Display the base cost of the product
    public void displayBaseCost() {
        System.out.println("Base cost of the " + name + ": $" + basePrice);
    }

    public abstract void selectFeatures(Scanner scanner);

    // Get the quantity of the product
    public int selectQuantity(Scanner scanner) {
        System.out.print("How many do you want to buy: ");
        return scanner.nextInt();
    }

    // Calculate the total cost of the product based on quantity
    public double calculateTotalCost(int quantity) {
        double totalCost = getPrice() * quantity;
        return totalCost;
    }

    public String getSelectedModel() {
        return selectedModel;
    }

    public void setSelectedModel(String selectedModel) {
        this.selectedModel = selectedModel;
    }

    public String getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(String selectedColor) {
        this.selectedColor = selectedColor;
    }

    public String getSelectedMemory() {
        return selectedMemory;
    }

    public void setSelectedMemory(String selectedMemory) {
        this.selectedMemory = selectedMemory;
    }

    // Get the selected size
    public String getSelectedSize() {
        return selectedSize;
    }

    public void setSelectedSize(String selectedSize) {
        this.selectedSize = selectedSize;
    }

    // Abstract method to get the price based on color selection
    public abstract String getColorPrice();

    // Abstract method to get the price based on model selection
    public abstract String getModelPrice();

    // Abstract method to get the price based on memory selection
    public abstract String getMemoryPrice();

    // Abstract method to get the price based on size selection
    public abstract String getSizePrice();

    // Generate a "Check" output for the product
    public abstract String getCheckOutput();
}
