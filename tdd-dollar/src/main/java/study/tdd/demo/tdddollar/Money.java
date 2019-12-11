package study.tdd.demo.tdddollar;

import java.util.Objects;

public class Money {
	protected int amount;

	@Override
	public boolean equals(Object o) {
		return this.amount == ((Money)o).amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}
}
