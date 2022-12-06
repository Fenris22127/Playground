package de.medieninformatik;

import java.io.FileNotFoundException;

public class Main {
    //TODO: Add XML to implement scheme
    public static void main(String[] args) {
        try {
            ReadXML.read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}