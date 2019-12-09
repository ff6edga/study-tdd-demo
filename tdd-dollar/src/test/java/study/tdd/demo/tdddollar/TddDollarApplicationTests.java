package study.tdd.demo.tdddollar;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class TddDollarApplicationTests {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

}
