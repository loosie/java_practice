package ch7.spliterator;

public class WordCounter {
	private final int counter;
	private final boolean lastSpace;

	public WordCounter(int counter, boolean lastSpace) {
		this.counter = counter;
		this.lastSpace = lastSpace;
	}

	public WordCounter accumulate(Character c){
		if(Character.isWhitespace(c)){
			return lastSpace ? this : new WordCounter(counter, true);
		}else { // 공백을 만나면 지금까지 탐색한 문자를 단어로 간주하여 단어 수 증가
			return lastSpace ? new WordCounter(counter+1, false) : this;
		}
	}

	public WordCounter combine(WordCounter wordCounter){
		return new WordCounter(counter + wordCounter.counter, wordCounter.lastSpace);
	}

	public int getCounter(){
		return counter;
	}


}
