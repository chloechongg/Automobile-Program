import java.util.Scanner;

public class Automobile { //define and instantiate objects that contain the field and methods defined in the UML diagram 

    private String make; //instance data declared
    private String model;
    private int year;
    private String color;
    private double basePrice;
    private double discount;
    private double taxRate;

    public void setMake(String make) { //allow data to pass into object 
        this.make = make;
    }

    public String getMake() { //allow data to be retrieved from object 
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setDiscountRate(double discount) {
        this.discount = discount;
    }

    public double getDiscountRate() {
        return discount;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double retrieveDiscountedPrice() {
        return basePrice - (basePrice * (discount));
    }

    public double retrieveCalculatedTax() {
        return retrieveDiscountedPrice() * (taxRate);
    }

    public double retrieveTotalCost() {
        return retrieveDiscountedPrice() + retrieveCalculatedTax();
    }

    public boolean inputAll() {
        Scanner scanner = new Scanner(System.in); //scanner class to allow user input 
        System.out.print("Enter make: ");
        make = scanner.nextLine();
        if (make.isEmpty()) {
            return false;
        }
        System.out.print("Enter model ");
        model = scanner.nextLine();
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter color: ");
        color = scanner.nextLine();
        System.out.print("Enter base price: ");
        basePrice = scanner.nextDouble();
        System.out.print("Enter discount rate: ");
        discount = scanner.nextDouble();
        System.out.print("Enter tax rate: ");
        taxRate = scanner.nextDouble();
        return true;
    }

    public boolean equals(Automobile other) {
        //return true if make, model and color of current obj matches the make, model and color of the objects passed as an argument 
        return make.equals(other.make) && model.equals(other.model) && color.equals(other.color);  
    }                                                                                             

    @Override
    public String toString() { //return string containing formatted output 
        return "make=" + make + "\n" +
                "model=" + model + "\n" +
                "year=" + year + "\n" +
                "color=" + color + "\n" +
                "basePrice=$ " + basePrice + "\n" +
                "discountedPrice=$ " + retrieveDiscountedPrice() + "\n" +
                "salesTax=$ " + retrieveCalculatedTax() + "\n" +
                "totalCost=$ " + retrieveTotalCost();
    }
}
