package tdd.koya;

public class Franc extends Money {
	
	public Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, this.currency);
	}

}
