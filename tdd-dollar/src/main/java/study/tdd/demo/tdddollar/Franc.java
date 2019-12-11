package study.tdd.demo.tdddollar;

import java.util.Objects;

public class Franc {
	private int amount;

	public Franc times(int multiplier) {
		return new Franc(this.amount * multiplier);
	}

	public Franc(int amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object o) {
		return this.amount == ((Franc)o).amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}
}
