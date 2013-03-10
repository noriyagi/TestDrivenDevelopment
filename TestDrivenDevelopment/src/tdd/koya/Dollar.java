package tdd.koya;

public class Dollar extends Money{

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	public String currency(){
		return "USD";
	}
	
	

}
