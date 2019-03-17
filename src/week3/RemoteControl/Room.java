package week3.RemoteControl;

public class Room {
    private static Room ourInstance = new Room();
    public static Room getInstance() {
        return ourInstance;
    }

    public Television television = new Television();
    public Stereo stereo = new Stereo();
}
