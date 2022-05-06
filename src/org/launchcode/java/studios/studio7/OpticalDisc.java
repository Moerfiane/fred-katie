package org.launchcode.java.studios.studio7;

public interface OpticalDisc {
    void spinDisc();

    String read();

    void write(String contentType, int size);
}
