package tdd.koya;

public class Sum implements Expression {
	public Sum(Expression augend, Expression addend) {
		this.augend = augend;
		this.addend = addend;
	}
	Expression augend;
	Expression addend;
	
	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}

	@Override
	public Expression plus(Expression tenFrancs) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
