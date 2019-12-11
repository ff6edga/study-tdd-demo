package study.tdd.demo.tdddollar;

public class Dollar extends Money{

	public Dollar times(int multiplier) {
		return new Dollar(this.amount * multiplier);
	}

	public Dollar(int amount) {
		this.amount = amount;
	}
}
