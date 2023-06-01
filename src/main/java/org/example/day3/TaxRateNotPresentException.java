package org.example.day3;

public class TaxRateNotPresentException extends Exception {
    public TaxRateNotPresentException(String info) {
        super(info);
    }
}
