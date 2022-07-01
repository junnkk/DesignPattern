public class RemoteLoader {
    public static void main(String[] args) {
        // RemoteControl remoteControl = new RemoteControl();
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

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

        // 리모컨 슬롯에 커맨드를 로드
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        // // 자바 람다 표현식을 사용하여 구상 커맨드 객체의 인스턴스를 생성하는 대신 함수 객체로 리모컨 슬롯에 커맨드를 로드
        // // Command 인터페이스에 추상 메소드가 하나일 경우에만 사용 가능 - execute()
        // remoteControl.setCommand(0, () -> livingRoomLight.on(), () ->
        // livingRoomLight.off());
        // remoteControl.setCommand(1, () -> kitchenLight.on(), () ->
        // kitchenLight.off());
        // remoteControl.setCommand(2, () -> garageDoor.up(), () -> garageDoor.down());
        // remoteControl.setCommand(3, () -> stereo.on(), () -> stereo.off());

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoBottonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
