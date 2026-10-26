package uk.ac.westminster.products_api;

// A Physical Product is a Product because it is a type of Product and subclass of  Product class. Therefore, it inherits properties and behavior of product
// Customer - Because it is not a type of Product
public class PhysicalProduct extends Product{
    double weightKg;
    String dimensions;

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name,  price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public PhysicalProduct(){}

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

}
