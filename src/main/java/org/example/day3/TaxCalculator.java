package org.example.day3;

public class TaxCalculator {

    private final TaxRateProvider taxRateProvider;

    public TaxCalculator(TaxRateProvider taxRateProvider) {
        this.taxRateProvider = taxRateProvider;
    }

    public int calculateTaxes(Employee e) throws TaxRateNotPresentException {
        int rate = taxRateProvider.getRate(e.age());

        return e.salary() * rate;
    }
}
