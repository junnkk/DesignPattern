package pizza;

// import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    
    abstract void prepare();
    // {
    //     System.out.println("준비중: "+name);
    //     System.out.println("도우를 돌리는 중");
    //     System.out.println("소스를 뿌리는 중");
    //     System.out.println("토핑을 올리는 중");
    //     for (String topping: toppings){
    //         System.out.println(" " + topping);
    //     }
    // }

    void bake(){
        System.out.println("175도에서 25분 간 굽기");
    }
    void cut(){
        System.out.println("피자를 사선으로 자르기");
    }
    void box(){
        System.out.println("상자에 피자를 담기");
    }
  
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
    
    public String toString(){
        // 피자 이름을 출력하는 부분
        return name;
    }
}
