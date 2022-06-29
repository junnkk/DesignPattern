
public class EnumSingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.UNIQUE_INSTANCE;
        // 여기서 싱글톤 사용
	}
}

public enum EnumSingleton {
	UNIQUE_INSTANCE;
 
	// 기타 필요한 코드

}
