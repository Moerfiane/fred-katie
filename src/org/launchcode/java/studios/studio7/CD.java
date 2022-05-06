package org.launchcode.java.studios.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public CD(String name, int capacity, String contentType, boolean writable, int dataStored) {
        super(name, capacity, contentType, writable, dataStored);
    }

    public CD(int capacity) {
        super(capacity);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public void write(String contentType, int size) {

    }
}
