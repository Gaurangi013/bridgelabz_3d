
public class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% VAT
    }

    @Override
    public String getTaxDetails() {
        return "5% VAT on Clothing";
    }
}

