package week3.RemoteControl;

public class RemoteControl {

    // return a command receiver
    public static ElectronicDevice getDevice(int channel){
        if (channel == 0)
            return Room.getInstance().television;
        if (channel == 1)
            return Room.getInstance().stereo;
        return null;
    }
}