// 작업 취소 기능을 구현할 때 상태를 사용하는 방법
public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;

	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	public void high() {
		speed = HIGH;
		// 선풍기 코드를 HIGH로 맞추는 코드
	}

	public void medium() {
		speed = MEDIUM;
		// 선풍기 코드를 MEDIUM으로 맞추는 코드

	}

	public void low() {
		speed = LOW;
		// 선풍기 코드를 LOW로 맞추는 코드
	}

	public void off() {
		speed = OFF;
		// 선풍기를 끄는 코드
	}

	public int getSpeed() {
		return speed;
	}
}
