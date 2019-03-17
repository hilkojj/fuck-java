package week3.RemoteControl;

// the client
public class PlayWithRemote{
    
    public static void main(String[] args){
        
        // create command receiver
        RemoteControl remote = new RemoteControl();
        ElectronicDevice newDevice = remote.getDevice();
        
        // create a concrete command, register the receiver
        TurnTVOn onCommand = new TurnTVOn(newDevice);
        
        // create invoker
        DeviceButton b = new DeviceButton();
        
        // invoke command
        b.execute(onCommand);
        
        // create another concrete command        
        TurnTVOff offCommand = new TurnTVOff(newDevice);
        
        // invoke another concrete command
        b.execute(offCommand);
    }
}