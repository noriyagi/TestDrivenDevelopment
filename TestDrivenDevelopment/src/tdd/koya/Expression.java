package tdd.koya;

public interface Expression {

	public Money reduce(Bank bank, String to);

	public Expression plus(Expression tenFrancs);

	public Expression times(int multiplier);
}
