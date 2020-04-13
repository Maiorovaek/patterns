public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living room");
        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand onWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOff stereoOff = new StereoOff(stereo);

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        Light kitchenRoomLight = new Light("Kitchen");
        LightOnCommand kitchenRoomOnLight = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenRoomOffLight = new LightOffCommand(kitchenRoomLight);

        Light livingRoomLight = new Light("Living room");
        LightOnCommand livingRoomOnLight = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOffLight = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, onWithCDCommand, stereoOff);
        remoteControl.setCommand(1, lightOn, lightOff);
        remoteControl.setCommand(2, doorOpenCommand, doorCloseCommand);
        remoteControl.setCommand(3, kitchenRoomOnLight, kitchenRoomOffLight);
        remoteControl.setCommand(4, livingRoomOnLight, livingRoomOffLight);
        remoteControl.setCommand(5, highCommand, offCommand);


        remoteControl.onButtonWasPress(0);
        remoteControl.onButtonWasPress(1);
        remoteControl.onButtonWasPress(2);
        remoteControl.offButtonWasPress(3);
        remoteControl.onButtonWasPress(4);
        remoteControl.undoCButtonWasPress();
        remoteControl.onButtonWasPress(5);
        remoteControl.offButtonWasPress(5);
        remoteControl.undoCButtonWasPress();

        System.out.println(remoteControl);
    }
}
