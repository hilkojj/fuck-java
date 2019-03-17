package week3.RemoteControl;

import java.util.ArrayList;

public class Room {
    private static Room ourInstance = new Room();

    public static Room getInstance() {
        return ourInstance;
    }

    private ArrayList<ElectronicDevice> divices = new ArrayList<>();

    private Room() {
        divices.add( new Television() );
        divices.add( new Stereo() );
    }

    public ArrayList<ElectronicDevice> getDivices() {
        return this.divices;
    }
}
