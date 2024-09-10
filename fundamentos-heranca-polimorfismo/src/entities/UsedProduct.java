package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + " (used) $ " + super.getPrice() + "(Manufacture date: " + fmt.format(manufactureDate) + ")";
    }
}
