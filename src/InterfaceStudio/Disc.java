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
}
