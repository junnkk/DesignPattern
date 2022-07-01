public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand; // UNDO 버튼을 눌렀을 때를 대비해서 마지막으로 사용한 커맨드 객체를 넣는 변수

    // 생성자
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    // 슬롯 번호와 그 슬롯에 저장할 On, Off 커맨드 객페를 인자로 전달 받음.
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        // 각 커맨드 객체는 나중에 사용하기 편하도록 onCommand와 offCommand 배열에 저장.
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoBottonWasPushed(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---------리모컨----------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "   "
                    + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getName()+"\n");
        return stringBuffer.toString();

    }
}
