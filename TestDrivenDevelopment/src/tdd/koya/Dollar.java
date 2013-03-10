package tdd.koya;

public class Dollar extends Money{
	
	private String currency;

	public Dollar(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}
	
	public String currency(){
		return currency;
	}
	
	

}
