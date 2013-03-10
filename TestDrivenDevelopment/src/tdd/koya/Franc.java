package tdd.koya;

public class Franc extends Money {
	
	private String currency;
	
	public Franc(int amount) {
		this.amount = amount;
		// インターフェースを変えずに変えずに貨幣種別を設定する。
		currency = "CHF";
	}
	
	public Money times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	public String currency(){
		return currency;
	}
}
