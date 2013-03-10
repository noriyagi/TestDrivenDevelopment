package tdd.koya;

abstract class Money {

	protected int amount;
	
	public boolean equals(Object object){
		Money money = (Money) object;
		return this.amount == money.amount && getClass().equals(money.getClass());
	}
	// Dollarを返却するMoneyのファクトリメソッド
	static Dollar dollar(int amount) {
		return new Dollar(amount);
	}
	static Franc franc(int amount) {
		return new Franc(amount);
	}
	
	// times()メソッドを共通化したかったが後回し
	abstract Money times(int multiplier);
}
