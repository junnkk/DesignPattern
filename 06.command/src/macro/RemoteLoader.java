public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        // 조명용 커맨드 객체
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // 차고 문을 열고 닫는 커맨드 객체
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        // 오디오를 켜고 끄는 객체
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // On 커맨드용 배열과 Off 커맨드용 배열 생성
        Command[] partyOn = {livingRoomLightOn, stereoOnWithCD, garageDoorUp, kitchenLightOn};
        Command[] partyOff = {livingRoomLightOff, stereoOff, garageDoorDown, kitchenLightOff};

        // 각 배열을 전달해서 매크로 커맨드 생성
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // 리모컨 슬롯에 커맨드를 로드
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        
        System.out.println(remoteControl);
        System.out.println("------매크로 on--------");
        remoteControl.onButtonWasPushed(0);
        System.out.println("------매크로 off--------");
        remoteControl.offButtonWasPushed(0);

    }
}
