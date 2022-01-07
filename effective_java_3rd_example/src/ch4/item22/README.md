# 22. 인터페이스는 타입을 정의하는 용도로만 사용하라
인터페이스는 자신을 구현한 클래스의 인스턴스를 참조할 수 있는 타입 역할을 한다. 달리 말해, 클래스가 어떤 인터페이스를 구현한다는 것은 자신의 인스턴스로 무엇을 할 수 있는지를 클라이언트에 얘기해주는 것이다. 인터페이스는 오직 이 용도로만 사용해야 한다.


## 상수 인터페이스 - 잘못된 사용
이 지침에 맞는 않는 예로 소위 상수 인터페이스라는 것이 있다. 상수 인터페이스란 메서드 없이, 상수를 뜻하는 static final 필드로만 가득 찬 인터페이스를 말한다.

그리고 이 상수들을 사용하려는 클래스에서는 정규화된 이름(qualified name)을 쓰는 걸 피하고자 그 인터페이스를 구현하곤 한다. 다음의 예를 보자.

[ 상수 인터페이스 안티패턴 - 사용금지! ]
~~~
public interface PhysicalConstants {
   // 아보가드로 수 (1/몰)
   public static final doubleAVOGADROS_NUMBER= 6.022_140_857e23;
   // 볼츠만 상수 (J/K)
   public static final doubleBOLTZMANN_CONST= 1.380_648_52e-23;
   // 전자 질량 (kg)
   public static final doubleELECTRON_MASS= 9.109_383_56e-31;
}
~~~

<br>

### 상수 인터페이스 안티패턴은 잘못 사용한 예다

클래스 내부에서 사용하는 상수는 외부 인터페이스가 아니라 내부 구현에 해당한다. 따라서 상수 인터페이스를 구현하는 것은 이 내부 구현을 클래스의 API로 노출하는 행위다.

- 클래스가 어떤 상수 인터페이스를 사용하든 사용자에게는 아무런 의미가 없다. 오히려 사용자에게 혼란을 주기도 하며, 더 심하게는 클라이언트 코드가 내부 구현에 해당하는 이 상수들에 종속되게 한다.
- 그래서 다음 릴리스에서 이 상수들을 더는 쓰지 않게 되더라도 바이너리 호환성을 위해 여전히 상수 인터페이스를 구현하고 있어야 한다.
- final이 아닌 클래스가 상수 인터페이스를 구현한다면 모든 하위 클래스의 이름공간이 그 인터페이스가 정의한 상수들로 오염되어 버린다.

java.io.ObjectStreamConstants 등, 자바 플랫폼 라이브러리에도 상수 인터페이스가 몇 개 있으나, 인터페이스를 잘못 활용한 예이니 따라 해서는 안된다.

<br>

## 상수와 연관된 클래스나 인터페이스 자체에 추가하자
상수를 공개할 목적이라면 더 합당한 선택지가 몇 가지 있다. 특정 클래스나 인터페이스와 강하게 연관된 상수라면 그 클래스나 인터페이스 자체에 추가해야 한다. 
- 모든 숫자 기본 타입의 박싱 클래스가 대표적으로, Integer, Double에 선언된 MIN_VALUE, MAX_VALUE가 대표적인 예다.

<br>

## 상수는 열거 타입 혹은 유틸리티 클래스에 담아서 공개하자.
열거 타입으로 나타내기 적합한 상수라면 열거 타입으로 만들어 공개하면 된다(아이템 34). 그것도 아니라면, 인스턴스화 할 수 없는 유틸리티 클래스(아이템 4)에 담아 공개하자. 다음 코드는 앞서 보여준 PhysicalConstants의 유틸리티 클래스 버전이다.

[ 상수 유틸리티 클래스 ]
~~~
public class PhysicalConstants {
   private PhysicalConstants() {} // 인스턴스화 방지

   // 아보가드로 수 (1/몰)
   public static final doubleAVOGADROS_NUMBER= 6.022_140_857e23;
   // 볼츠만 상수 (J/K)
   public static final doubleBOLTZMANN_CONST= 1.380_648_52e-23;
   // 전자 질량 (kg)
   public static final doubleELECTRON_MASS= 9.109_383_56e-31;
}
~~~

<br>

유틸리티 클래스에 정의된 상수를 클라이언트에서 사용하려면 클래스 이름까지 함께 명시해야 한다. 
- PhysicalConstants.AVOGADROS_NUMBER처럼 말이다.
- 유틸리티 클래스의 상수를 빈번히 사용한다면 static import하여 클래스 이름을 생략할 수 있다.

[ 정적 임포트를 사용해 상수 이름만으로 사용하기 ] 
~~~
import static ch4.item22.PhysicalConstants.*;

public class Test {
   double atoms(double mols){
      returnAVOGADROS_NUMBER* mols;
   }

    // ... 
    // PhysicalConstants를 빈번히 사용한다면 정적 임포트가 값어치를 한다. 
}
~~~

<br>

## 핵심 정리
인터페이스는 타입을 정의하는 용도로만 사용해야 한다. 상수 공개용 수단으로 사용하지 말자.

<br>

--- 

💡 본문은 [개발 블로그](https://loosie.tistory.com/658) 에 있습니다.