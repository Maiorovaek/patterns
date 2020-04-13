public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = new Light();
        Light kitchenRoomLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        Command stereoOnWithCD = () -> {stereo.on(); stereo.setCd();stereo.setVolume(11);};
        remoteControl.setCommand(0, stereoOnWithCD, stereo::off);
        remoteControl.setCommand(1, light::on, light::off);
        remoteControl.setCommand(2, ()->{garageDoor.up();}, ()->{garageDoor.close();});
        remoteControl.setCommand(3, kitchenRoomLight::on, kitchenRoomLight::off);
        remoteControl.setCommand(4, ceilingFan::high, ceilingFan::off);

        remoteControl.onButtonWasPress(0);
        remoteControl.offButtonWasPress(0);
        remoteControl.onButtonWasPress(1);
        remoteControl.onButtonWasPress(2);
        remoteControl.offButtonWasPress(3);
        remoteControl.onButtonWasPress(4);

        System.out.println(remoteControl);


    }
}
