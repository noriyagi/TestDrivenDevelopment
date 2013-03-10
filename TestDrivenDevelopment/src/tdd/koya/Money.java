package tdd.koya;

abstract class Money {

	protected int amount;
	
	public boolean equals(Object object){
		Money money = (Money) object;
		return this.amount == money.amount && getClass().equals(money.getClass());
	}
	// Dollarを返却するMoneyのファクトリメソッド
	static Money dollar(int amount) {
		return new Dollar(amount);
	}
	// 
	abstract Money times(int multiplier);
}
