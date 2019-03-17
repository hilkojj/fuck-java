package week3.RemoteControl;

import java.util.ArrayList;

public class RemoteControl {

    int channel = 0;

    // return a command receiver
    public ElectronicDevice getDevice(){
        
        ArrayList<ElectronicDevice> divices = Room.getInstance().getDivices();
        if(this.channel > 0 && this.channel < divices.size())
            return divices.get(channel);
        else
            return null;
    }

    void setChannel(int nr) {
        this.channel = nr;
    }
}