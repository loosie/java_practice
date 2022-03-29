package LambdaEx;

// 람다식의 타입과 형변환 
@FunctionalInterface
interface MyFunction2{
    void run(); // public abstract void run();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {}; // MyFunction2 f = (MyFunction)(()->{});
        Object obj = (MyFunction2)(()->{}); // Object타입으로 형변환이 생략됨
        String str = ((Object) (MyFunction2)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        // System.out.println(()->{}); // error. 람다식은 Object타입으로 형변환 안됨.
        System.out.println((MyFunction2)(()-> {}));
        // System.out.println((MyFunction2)(()-> {}).toString()); // 에러
        System.out.println(((Object)(MyFunction2)(()-> {})).toString());
    }
}
