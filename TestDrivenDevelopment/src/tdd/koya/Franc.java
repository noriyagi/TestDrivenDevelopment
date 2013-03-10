package tdd.koya;

public class Franc extends Money {
	
	private String currency;
	
	public Franc(int amount, String currency) {
		this.amount = amount;
		// インターフェースを変えずに変えずに貨幣種別を設定する。
		this.currency = "CHF";
	}
	
	public Money times(int multiplier) {
		return new Franc(amount * multiplier, null);
	}
	public String currency(){
		return currency;
	}
}
