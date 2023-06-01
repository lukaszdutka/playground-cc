package org.example.day3;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        throw new RuntimeException();

        //SpringBoot
        //

        //wyjątki?
        //mechanizm dający mozliwośc obsługi błędów

        //TaxCalculator.calculateTaxes()
        //   taxRateProvider
        // metoda3

//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader("test.txt"));
//            br.readLine();
//        } catch (IOException e) {
//            System.out.println("Something");
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

        //try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            br.readLine();
        } catch (IOException e) {
            System.out.println("Something");
        }


        TaxRateProvider taxRateProvider = new TaxRateProvider();
        TaxCalculator taxCalculator = new TaxCalculator(taxRateProvider);

        try {
            int tax = taxCalculator.calculateTaxes(new Employee(-25, 1000));
            System.out.println("Tax=" + tax);
        } catch (TaxRateNotPresentException e) {
            System.out.println("Tax was not calculated because of error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("regular exception");
        }
    }
}
