package tdd.koya;

class Money {

	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	// Dollarを返却するMoneyのファクトリメソッド
	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	public boolean equals(Object object){
	Money money = (Money) object;
	return this.amount == money.amount && currency().equals(money.currency());
	}	
	// times()メソッドを共通化したかったが後回し
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	// 通貨種別を返却する
	public String currency(){
		return currency;
	}
	
	// 加法
	public Money plus(Money addend) {
		return new Money(amount + addend.amount, currency);
	}
	// デバッグ用
	public String toString() {
		return this.amount + " " + this.currency;
	}
}
