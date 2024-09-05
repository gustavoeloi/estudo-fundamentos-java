package entities;

public class CurrencyConverter {

    public static final double IOF = 6; // Here is the tax to be paid over every dollar purchased

    public static double dollarConverter(double priceDollar, double dollarToBePurchased) {
        double priceDollarAfterTax = priceDollar + ((IOF * priceDollar) / 100);

        double finalPrice = priceDollarAfterTax * dollarToBePurchased;

        return finalPrice;
    }

}
