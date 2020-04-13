public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public SimpleRemoteControl() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = () -> {
            };
            offCommands[i] = () -> {
            };
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPress(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
        }
    }

    public void offButtonWasPress(int slot) {
        offCommands[slot].execute();
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