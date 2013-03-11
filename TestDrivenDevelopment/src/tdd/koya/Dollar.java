package tdd.koya;

public class Dollar extends Money{
	
	private String currency;

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplier) {
		return new Dollar(amount * multiplier, currency);
	}

}
