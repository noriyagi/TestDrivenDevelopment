package tdd.koya;

class Money implements Expression {

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
	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}
	// デバッグ用
	public String toString() {
		return this.amount + " " + this.currency;
	}
}
