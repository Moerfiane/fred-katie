package InterfaceStudio;

import java.util.ArrayList;

public abstract class Disc {

    private String name;
    private int storageCapacity;
    private int remainCapacity;
    private int useCapacity;
    private ArrayList <String> contents;

    public Disc(String name, int storageCapacity, int remainCapacity, int useCapacity, ArrayList<String> contents) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainCapacity = remainCapacity;
        this.useCapacity = useCapacity;
        this.contents = contents;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getRemainCapacity() {
        return remainCapacity;
    }

    public void setRemainCapacity(int remainCapacity) {
        this.remainCapacity = remainCapacity;
    }

    public int getUseCapacity() {
        return useCapacity;
    }

    public void setUseCapacity(int useCapacity) {
        this.useCapacity = useCapacity;
    }

    public int storageLeft() {
        return this.storageCapacity - this.useCapacity;

    }

}
