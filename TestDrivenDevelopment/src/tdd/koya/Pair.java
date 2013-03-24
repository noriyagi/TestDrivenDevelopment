package tdd.koya;

public class Pair {
	private String from;
	private String to;
	
	Pair(String from, String to) {
		this.from = from;
		this.to = to;
	}
	
	// PairはMapキーとして使用するのでequals()とhashCode()を実装しなければならない。
	public boolean equals(Object object) {
		Pair pair = (Pair) object;
		return from.equals(pair.from) && to.equals(pair.to);
	}
	public int hashCode() {
		return 0;
	}

}
