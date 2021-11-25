package item3.singleton_enum;

import item3.SerializationTester;

public class Test extends SerializationTester {
    public static void main(String[] args) {
        Elvis instance = Elvis.INSTANCE;
        Elvis result = (Elvis)deserialize(serialize(instance));

        System.out.println("instance == result : " + (instance == result));
        System.out.println("instance.equals(result) : " + (instance.equals(result)));
    }
}
