// enum을 활용하여 ChocolateBoiler 수정

public class EnumChocolateBolierClient {
    public static void main(String[] args) {
        EnumChocolateBoiler enumChocolateBoiler = EnumChocolateBoiler.uniqueEnumChocolateBoiler;
        // 여기서 싱글턴 사용

        // System.out.println(enumChocolateBoiler.isEmpty()+ " "+ enumChocolateBoiler.isEmpty());
        
        // enumChocolateBoiler.fill();
        // System.out.println(enumChocolateBoiler.isEmpty()+ " "+ enumChocolateBoiler.isEmpty());

    }
}
