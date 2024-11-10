package Basics.StandardIO;
import java.util.ArrayList;
import java.util.List;

class GroceryItem {
    String name;
    int quantity;
    double pricePerUnit;

    public GroceryItem(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

public class GroceryBill {
    public static void main(String[] args) {
        // List of grocery items
        List<GroceryItem> items = new ArrayList<>();
        items.add(new GroceryItem("Milk", 2, 1.50));
        items.add(new GroceryItem("Bread", 1, 2.00));
        items.add(new GroceryItem("Eggs", 1, 3.20));
        items.add(new GroceryItem("Apples", 5, 0.80));
        items.add(new GroceryItem("Rice", 1, 5.00));

        // Display bill header
        System.out.printf("%-10s %10s %15s %15s%n", "Item", "Quantity", "Price per Unit", "Total Price");
        System.out.println("----------------------------------- -------------------------------");

        // Calculate and display each item's total
        double totalBill = 0;
        for (GroceryItem item : items) {
            double totalPrice = item.getTotalPrice();
            totalBill += totalPrice;
            System.out.printf("%-10s %10d %15.2f %15.2f%n", item.name, item.quantity, item.pricePerUnit, totalPrice);
        }

        // Display the final total
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-35s %15.2f%n", "Total Bill:", totalBill);
    }
}
