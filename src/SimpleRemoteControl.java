//244 page
public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public SimpleRemoteControl() {
        onCommands = new Command[6];
        offCommands = new Command[6];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 5; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPress(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];

        }
    }

    public void offButtonWasPress(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoCButtonWasPress() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n -- Remote control --\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("slot[" + i + "]   " + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + " \n");
        }
        return stringBuff.toString();
    }
}