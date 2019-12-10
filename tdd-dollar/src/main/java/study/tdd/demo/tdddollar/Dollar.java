package study.tdd.demo.tdddollar;

import java.util.Objects;

public class Dollar {
	int amount;


	public Dollar times(int multiplier) {
		return new Dollar(this.amount * multiplier);
	}

	public Dollar(int amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object o) {
		return this.amount == ((Dollar)o).amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}
}
