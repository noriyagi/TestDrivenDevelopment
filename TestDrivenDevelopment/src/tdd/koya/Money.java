package tdd.koya;

class Money {

	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	// Dollarを返却するMoneyのファクトリメソッド
	static Dollar dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
	public boolean equals(Object object){
	Money money = (Money) object;
	return this.amount == money.amount && getClass().equals(money.getClass());
	}	
	// times()メソッドを共通化したかったが後回し
	Money times(int multiplier) {
		return null;
	}
	
	// 通貨種別を返却する
	public String currency(){
		return currency;
	}
	
	// デバッグ用
	public String toString() {
		return amount + " " + currency;
	}
}
