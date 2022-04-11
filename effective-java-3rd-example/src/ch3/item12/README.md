# 12. toString을 항상 재정의하라
Object의 기본 toString 메서드가 우리가 작성한 클래스에 적합한 문자열을 반환하는 경우는 거의 없다. 
- 이 메서드는 PhoneNumber@adbbd처럼 단순히 `클래스_이름@16진수로_표시한_해시코드`를 반환할 뿐이다.

<br>

## toString의 일반 규약
toString의 일반 규약에 따르면 ‘간결하면서 사람이 읽기 쉬운 형태의 유익한 정보’를 반환해야 한다.
- PhoneNumber@adbbd는 간결하고 읽기 쉽다고 볼 수도 있지만, 707-867-5309처럼 전화번호를 직접 알려주는 형태가 훨씬 유익한 정보를 담고 있다.
- 또한 toString 규약은 “모든 하위 클래스에서 이 메서드를 재정의하라”고 한다.

<br>

## toString을 재정의 해야 하는 이유
equals와 hashCode 규약(아이템 10, 11)만큼 대단히 중요하진 않지만, toString을 잘 구현한 클래스는 사용하기에 훨씬 즐겁고, 그 클래스를 사용한 시스템은 디버깅하기 쉽다.
- **toString을 잘 구현한 클래스는 사용하기에 훨씬 즐겁고, 그 클래스를 사용한 시스템은 디버깅하기 쉽다.**

toString 메서드는 객체를 println, printf, 문자열 연결 연산자(+), assert 구문에 넘길 때, 혹은 디버거가 객체를 출력할 때 자동으로 불린다. 우리가 직접 호출하지 않더라도 다른 어딘가에서 쓰일 거란 이야기다.
- 예컨대 우리가 작성한 객체를 참조하는 컴포넌트가 오류 메시지를 로깅할 때 자동으로 호출할 수 있다.
- toString을 제대로 재정의하지 않는다면 쓸모없는 메시지만 로그에 남을 것이다.

PhoneNumber용 toString을 제대로 재정의했다면 다음 코드만으로 문제를 진단하기에 충분한 메시지를 남길 수 있다.
- System.out.println(phoneNumber + “에 연결할 수 없습니다.”);

<br> 

toString을 재정의했든 아니든 프로그래머 대부분은 진단 메시지를 이렇게 만들 것이다. 재정의를 하지 않았다면 그다지 쓸모가 없는 메시지가 출력된다. 좋은 toString은 (특히 컬렉션처럼) 이 인스턴스를 포함하는 객체에서 유용하게 쓰인다. 

**실전에서 toString은 그 객체가 가진 주요 정보 모두를 반환하는 게 좋다.** 
- 하지만 객체가 거대하거나 객체의 상태가 문자열로 표현하기에 적합하지 않다면 무리가 있다.
- 이런 상황이라면 “맨해튼 거주자 전화번호부(총 1487536개)”나 “Thread[main, 5, main]” 같은 요약 정보를 담아야 한다.
- 이상적으로는 스스로를 완벽히 설명하는 문자열이어야 한다. (방금의 스레드 예는 이 조건에는 맞지 않는다.)

<br>

## toString을 구현할 때면 반환값의 포맷을 문서화할지 정해야 한다.
이는 아주 중요한 선택이다. 전화번호나 행렬 같은 값 클래스라면 문서화하기를 권한다. 포맷을 명시하면 그 객체는 표준적이고, 명확하고, 사람이 읽을 수 있게 된다. 따라서 그 값 그대로 입출력에 사용하거나 CSV 파일처럼 사람이 읽을 수 있는 데이터 객체로 저장할 수도 있다. 포맷을 명시하기로 했다면, 명시한 포맷에 맞는 문자열과 객체를 상호 전환할 수 있는 정적 팩터리나 생성자를 함께 제공해주면 좋다. 자바 플랫폼의 많은 값 클래스가 따르는 방식이기도 하다.
- BigInter, BigDecimal과 대부분의 기본 타입 클래스가 여기 해당한다.

### 단점도 있다.
포맷을 한번 명시하면 (그 클래스가 많이 쓰인다면) 평생 그 포맷에 얽매이게 된다. 이를 사용하는 프로그래머들이 그 포맷에 맞춰 파싱하고, 새로운 객체를 만들고, 영속 데이터로 저장하는 코드를 작성할 것이다. 
- 만약 향후 릴리스에서 포맷을 바꾼다면 이를 사용하던 코드들과 데이터들은 엉망이 될 것이고, 프로그래머들은 절규할 것이다.
- 반대로 포맷을 명시하지 않는다면 향후 릴리스에서 정보를 더 넣거나 포맷을 개선할 수 있는 유연성을 얻게 된다.

<br>

## 포맷을 명시하든 아니든 의도는 명확히 밝혀야 한다.
포맷을 명시하려면 아주 정확하게 해야 한다. 아이템 11에서 다룬 PhoneNumber 클래스용 toString메서드를 보자.

~~~ 
/** 포맷 명시한 경우
 * 이 전화번호의 문자열 표현을 반환한다.
 * 이 문자열은 "XXX-YYY-ZZZZ" 형태의 12글자로 구성된다.
 * XXX는 지역 코드, YYY는 프리픽스, ZZZZ는 가입자 번호다.
 * 각각의 대문자는 10진수 숫자 하나를 나타낸다.
 *
 * 전화번호의 각 부분의 값이 너무 작아서 자릿수를 채울 수 없다면,
 * 앞에서부터 0으로 채워나간다. 예컨대 가입자 번호가 123이라면
 * 전화번호의 마지막 네 문자는 "0123"이 된다.
 */
@Override public String toString() {
   // ...
}
~~~

포맷을 명시하지 않기로 했다면 다음처럼 작성할 수 있을 것이다.
~~~
/** 포맷 명시하지 않은 경우
 * 이 약물에 관한 대략적인 설명을 반환한다.
 * 다음은 이 설명의 일반적인 형태이나,
 * 상세 형식은 정해지지 않았으며 향후 변경될 수 있다.
 *
 * "[약물 #9: 유형=사랑, 냄새=테레빈유, 겉모습=먹물]"
 */
@Override public String toString() {
   // ...
}
~~~

이러한 설명을 읽고도 이 포맷에 맞춰 코딩하거나 특정 값을 빼내어 영구 저장한 프로그래머는 나중에 포맷이 바뀌어 피해를 입어도 자기 자신을 탓할 수 밖에 없을 것이다. 포맷 명시 여부와 상관없이 **toString이 반환한 값에 포함된 정보를 얻어올 수 있는 API를 제공하자.** 예컨대 PhoneNumber 클래스는 지역 코드, 프리픽스, 가입자 번호용 접근자를 제공해야 한다. 
- 그렇지 않으면 이 정보가 필요한 프로그래머는 toString의 반환값을 파싱할 수밖에 없다.
- 성능이 나빠지고, 필요하지도 않은 작업이다. 게다가 향후 포맷을 바꾸면 시스템이 망가지는 결과를 초래할 수 있다.
- 접근자를 제공하지 않으면 (변경될 수 있다고 문서화했더라도) 그 포맷이 사실상 준-표준 API나 다름없어진다.

정적 유틸리티 클래스(아이템 4)는 toString을 제공할 이유가 없다. 또한 대부분의 열거 타입(아이템 34)도 자바가 이미 완벽한 toString을 제공하니 따로 재정의하지 않아도 된다.

하지만 하위 클래스들이 공유해야 할 문자열 표현이 있는 추상화 클래스라면 toString을 재정의해줘야 한다. 예컨대 대다수의 컬렉션 구현체는 추상 컬렉션 클래스들의 toString 메서드를 상속해 쓴다.
- 아이템 10에서 소개한 AutoValue 프레임워크는 toString도 생성해준다(대부분의 IDE도 마찬가지다).
- AutoValue는 각 필드의 내용을 멋지게 나타내 주기는 하지만 클래스의 ‘의미’까지 파악하지는 못한다.

<br>

## 핵심 정리
- 모든 구체 클래스에서 Object의 toString을 재정의하자. 
- 상위 클래스에서 이미 알맞게 재정의한 경우는 예외다. 
- toString을 재정의한 클래스는 사용하기도 즐겁고 그 클래스를 사용한 시스템을 디버깅하기 쉽게 해준다. 
- toString은 해당 객체에 관한 명확하고 유용한 정보를 읽기 좋은 형태로 반환해야 한다.


--- 


💡 본문은 [개발 블로그](https://loosie.tistory.com/618) 에 있습니다.