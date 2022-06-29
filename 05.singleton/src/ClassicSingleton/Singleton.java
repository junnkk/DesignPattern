// 고전적인 싱글턴 패턴 구현법 -> 멀티 스레드에서 문제 발생

public class Singleton {
    private static Singleton uniqueInstance; // Singleton 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
    
    // 기타 인스턴스 변수

    private Singleton(){} // 생성자를 private으로 선언했으므로 Singleton 에서만 클래스의 인스턴스를 만들 수 있음.

    public static Singleton getInstacnce(){
        if (uniqueInstance == null){ // 아직 인스턴스가 생성되지 않았으면
            uniqueInstance = new Singleton(); // 인스턴스가 필요한 상황이 닥치기 전까지 아예 인스턴스를 생성하지 않게 됨 -> lazyinstantation
        }
        return uniqueInstance;
    }
    
    // 기타 메소드
    
}
