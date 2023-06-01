package org.example.day3;

import java.io.Closeable;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws TaxRateNotPresentException {
        try {
            String value = extracted();
        } catch (IOException e) {
            throw new TaxRateNotPresentException("info");
        }
    }

    private static String extracted() throws IOException {
        try (MyFile myFile = new MyFile()) {
            System.out.println("Inside");
            throw new IOException();
//            return myFile.getString();
        }
    }


}

class MyFile implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Zamykamy zasób!");
    }

    public String getString() {
        return "";
    }
}