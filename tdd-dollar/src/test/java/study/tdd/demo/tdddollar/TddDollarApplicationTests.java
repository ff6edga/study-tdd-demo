package study.tdd.demo.tdddollar;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
class TddDollarApplicationTests {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}

	@Test
	public void testEquality() {
		// 삼각 측량 예제 - 상수를 통한 테스트 통과를 막기 위함
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));

		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
	}

	@Test
	public void testFrancMultiplication() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}
}
