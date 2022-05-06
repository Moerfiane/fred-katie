package org.launchcode.java.studios.studio7;

public abstract class BaseDisc {
    private int capacity;
    private String contentType;
    private int dataStored;
    private boolean writable;
    private String name;

    public BaseDisc(String name, int capacity, String contentType, boolean writable, int dataStored) {
        this.name = name;
        this.capacity = capacity;
        this.contentType = contentType;
        this.writable = writable;
        this.dataStored = dataStored;
    }

    public BaseDisc(int capacity) {
        this("Empty disc", capacity, "none", true, 0);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDataStored() {
        return dataStored;
    }

    public void setDataStored(int dataStored) {
        if (!writable) {
            // "error: can't write to this disk"
        } else if (dataStored > capacity) {
            // "error: not enough disc space"
        } else {
            this.dataStored = dataStored;
        }
    }

    public int getStorageRemaining() {
        return capacity - dataStored;
    }

    public String getContentType() {
        return contentType;
    }

    public boolean isWritable() {
        return writable;
    }

    public void setWritable(boolean writable) {
        this.writable = writable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
