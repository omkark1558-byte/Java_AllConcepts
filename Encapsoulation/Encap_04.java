package Encapsoulation;	
// File: PropertyValuation.java
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Encap_04 {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Property object (encapsulation)
        
        Property property = new Property();

        System.out.println("=== Property Valuation Calculator ===");

        // Input area (sq ft)
        System.out.print("Area (sq.ft): ");
        double area = safeReadDouble(sc);
        property.setArea(area);

        // Ask user: enter rate manually or choose location
        System.out.print("Kya aap rate khud dena chahte hain? (y/n): ");
        String choice = sc.next().trim().toLowerCase();
        if (choice.equals("y")) {
            System.out.print("Rate per sq.ft: ");
            double rate = safeReadDouble(sc);
            property.setRatePerSqFt(rate);
        } else {
            // Simple location-based default rates (example)
            System.out.println("Location options: 1) City-Centre 2) Suburban 3) Rural");
            System.out.print("Option (1/2/3): ");
            int opt = safeReadInt(sc);
            switch (opt) {
                case 1: property.setRatePerSqFt(8000); break; // example rupees per sq.ft
                case 2: property.setRatePerSqFt(3500); break;
                case 3: property.setRatePerSqFt(1200); break;
                default: property.setRatePerSqFt(2000); break;
            }
            System.out.println("Selected rate per sq.ft set to: " + property.getRatePerSqFt());
        }

        // Compute and show valuation
        property.computeValuation();

        // Format as currency (India)
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        System.out.println("\n--- Result ---");
        System.out.println("Area (sq.ft): " + property.getArea());
        System.out.println("Rate per sq.ft: " + property.getRatePerSqFt());
        System.out.println("Valuation: " + nf.format(property.getValuation()));

        sc.close();
    }

    // helper - safe double read
    private static double safeReadDouble(Scanner sc) {
        while (true) {
            try {
                String s = sc.next();
                double v = Double.parseDouble(s);
                if (v < 0) {
                    System.out.print("Negative value nahi chalega. Dobara daalen: ");
                    continue;
                }
                return v;
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Dobara daalen: ");
            }
        }
    }

    // helper - safe int read
    private static int safeReadInt(Scanner sc) {
        while (true) {
            try {
                String s = sc.next();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.print("Invalid integer. Dobara daalen: ");
            }
        }
    }
}

// File: Property.java
class Property {
    // Encapsulated fields (private)
    private double areaSqFt;        // sq.ft
    private double ratePerSqFt;     // Rs per sq.ft
    private double valuation;       // computed

    // Setter with validation
    public void setArea(double areaSqFt) {
        if (areaSqFt < 0) throw new IllegalArgumentException("Area negative nahi ho sakta.");
        this.areaSqFt = areaSqFt;
    }

    // Getter
    public double getArea() {
        return areaSqFt;
    }

    public void setRatePerSqFt(double ratePerSqFt) {
        if (ratePerSqFt < 0) throw new IllegalArgumentException("Rate negative nahi ho sakta.");
        this.ratePerSqFt = ratePerSqFt;
    }

    public double getRatePerSqFt() {
        return ratePerSqFt;
    }

    // Business method: compute valuation and store internally
    public void computeValuation() {
        // simple formula: area * rate
        this.valuation = this.areaSqFt * this.ratePerSqFt;
    }

    // Getter for computed valuation
    public double getValuation() {
        return valuation;
    }
}
