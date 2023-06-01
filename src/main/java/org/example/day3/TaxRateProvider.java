package org.example.day3;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class TaxRateProvider {
    public int getRate(int age) throws TaxRateNotPresentException {
        //zawołanie do bazy danych
        //zawołanie do innego serwisu (GET)
        throw new TaxRateNotPresentException("informacja");

//        if (age < 0) {
//            throw new IllegalArgumentException("age was negative!");
//            //checked - Exception
//            //unchecked - RuntimeException
//            //errors -
//        }
//
//
//        return 5;
    }
}
