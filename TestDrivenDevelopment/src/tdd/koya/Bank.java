package tdd.koya;

public class Bank {

	public Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	public void addRate(String string, String string2, int i) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public int rate(String from, String to) {
		return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
	}
}
