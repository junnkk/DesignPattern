
public class EnumSingletonClient {
	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.UNIQUE_INSTANCE;
        // 여기서 싱글톤 사용
		System.out.println("싱글톤@");
	}
}
