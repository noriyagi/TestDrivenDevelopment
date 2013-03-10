package tdd.koya;

public class Franc extends Money {
	
	private String currency;
	
	public Franc(int amount, String currency) {
		this.amount = amount;
		// インターフェースを変えずに変えずに貨幣種別を設定する。
		this.currency = currency;
	}
	
	public Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
	public String currency(){
		return currency;
	}
}
