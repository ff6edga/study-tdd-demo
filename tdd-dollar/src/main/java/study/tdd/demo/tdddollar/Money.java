package study.tdd.demo.tdddollar;

import java.util.Objects;

public class Money {
	protected int amount;

	@Override
	public boolean equals(Object o) {
		// 지저분 하다만 일단 이렇게 가자.
		return (this.amount == ((Money)o).amount)
				&& (this.getClass().equals(o.getClass()));
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}
}
