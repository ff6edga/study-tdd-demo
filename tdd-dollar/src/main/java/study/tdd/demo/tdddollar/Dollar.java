package study.tdd.demo.tdddollar;

public class Dollar {
	int amount;

	public int times(int multiplier) {
		return this.amount * multiplier;
	}

	public Dollar(int amount) {
		this.amount = amount;
	}
}
