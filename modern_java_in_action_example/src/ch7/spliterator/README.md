# Spliterator 인터페이스
Spliterator는 분할할 수 있는 반복자라는 의미다. iterator처럼 소스의 요소 탐색 기능을 제공한다는 점은 같지만 병렬 작업에 특화되어 있다.

~~~
public interface Spliterator<T> {
    boolean tryAdvance(Consumer<? super T> action);
    Spliterator<T> trySplit();
    long estimateSize();
    int characteristics();
}
~~~

tryAdvance 메서드
-  Spliterator의 요소를 하나씩 순차적으로 소비하면서 탐색해야 할 요소가 남아있으면 참을 반환한다.

trySplit 메서드
- 반면 trySplit 메서드는 Spliterator의 일부 요소를 분할해서 두 번째 Spliterator를 생성하는 메서드다.

estimateSize 메서드
- estimateSize 메서드로 탐색해야 할 요소 수 정보를 제공한다.

characteristics 메서드
-  Spliterator 자체의 특성 집합을 포함하는 int를 반환한다.
- ORDERED, DISTINCT, SORTED, SIZED, NONNULL, IMMUTABLE, CONCURRENT, SUBSIZED