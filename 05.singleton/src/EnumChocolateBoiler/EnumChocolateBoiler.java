
public enum EnumChocolateBoiler {

    uniqueEnumChocolateBoiler;

    public EnumChocolateBoiler getInstance() {
        return uniqueEnumChocolateBoiler;
    }

    // public void fill() {// 보일러가 비어있을 때만 재료를 넣음.
    //     if (isEmpty()) {
    //         empty = false;
    //         boiled = false;
    //         // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
    //     }
    // }

    // public void drain() { // 보일러가 비어있지 않고 다 끓여진 상태에서만 재료를 다음 단계로 넘김.
    //     if (!isEmpty() && isBoiled()) {
    //         // 끓인 재료를 다음 단계로 넘김
    //         empty = true;
    //     }
    // }

    // public void boil() {
    //     if (!isEmpty() && !isBoiled()) {
    //         // 재료를 끓임
    //         boiled = true;
    //     }
    // }

    // public boolean isEmpty() {
    //     return empty;
    // }

    // public boolean isBoiled() {
    //     return boiled;
    // }

}