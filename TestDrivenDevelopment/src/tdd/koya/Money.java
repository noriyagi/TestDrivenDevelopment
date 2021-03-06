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
	public Expression times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	// 通貨種別を返却する
	public String currency(){
		return currency;
	}
	
	// 加法
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}
	
	public Money reduce(Bank bank, String to) {
		// CHFからUSDに変換なら…のべたべたの仮実装
		int rate = bank.rate(currency, to);
		return new Money(amount/rate, to);
	}
	
	// デバッグ用
	public String toString() {
		return this.amount + " " + this.currency;
	}
}
