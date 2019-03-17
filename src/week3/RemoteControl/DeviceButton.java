package week3.RemoteControl;

import java.util.Stack;

// invoker
public class DeviceButton {
    Stack<Command> history = new Stack<>();
    
    public void execute(Command cmd){
        System.out.println("Device button is pressed !");
        history.add(cmd);
        cmd.execute();
    }

    public void undo(){
        System.out.println("Device undo is pressed !");
        history.pop().undo();
    }
}