public class MacroMain {
    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan("Living room");
        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand onWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOff stereoOff = new StereoOff(stereo);

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        Command[] onMacroCommand = {lightOn, onWithCDCommand, highCommand};
        MacroCommand oMacroCommand = new MacroCommand(onMacroCommand);

        Command[] offmacroCommand = {offCommand, stereoOff, lightOff};
        MacroCommand offMacroXComand = new MacroCommand(offmacroCommand);
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setCommand(0, oMacroCommand, offMacroXComand);

        remoteControl.offButtonWasPress(0);
        System.out.println(remoteControl);
    }
}
