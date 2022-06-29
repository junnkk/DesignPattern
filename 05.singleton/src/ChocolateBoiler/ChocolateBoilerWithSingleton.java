// 고전적인 싱글턴 방법을 사용하여 수정한 코드 -> 멀티스레드 환경에서 문제 발생 가능

/*
 * 멀티스레드 문제 해결하기
 * 1) getInstance() 동기화하기 
 *    -> public static synchronized ChocolateBoilerWithSingleton getInstance()
 * 2) 처음부터 인스턴스 만들기 
 *    -> private static ChocolateBoilerWithSingleton uniqueChocolateBoiler = new ChocolateBoilerWithSingleton; // 하나뿐인 인스턴스를 저장하는 정적 변수
 * 3) DCL(Double-Checked Locking) 사용해서 동기화하는 부분 줄이기
 */

public class ChocolateBoilerWithSingleton {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoilerWithSingleton uniqueChocolateBoiler; // 하나뿐인 인스턴스를 저장하는 정적 변수

    private ChocolateBoiler(){ // 보일러가 비어있을 때만 돌아가는 코드
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerWithSingleton getInstance() {
        if (uniqueChocolateBoiler == null) { // 인스턴스가 있는지 확인하고, 없으면 동기화된 블록으로 들어감.
            synchronized (ChocolateBoilerWithSingleton.class) { // 처음에만 동기화되도록
                if (uniqueChocolateBoiler == null) {  // 다시 한 번 변수가 null 인지 확인한 다음 인스턴스 생성
                    uniqueChocolateBoiler = new ChocolateBoilerWithSingleton();
                }
            }
        }
        return uniqueChocolateBoiler;
    }

    public void fill() {// 보일러가 비어있을 때만 재료를 넣음.
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
        }
    }

    public void drain() { // 보일러가 비어있지 않고 다 끓여진 상태에서만 재료를 다음 단계로 넘김.
        if (!isEmpty() && isBoiled()) {
            // 끓인 재료를 다음 단계로 넘김
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 재료를 끓임
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
