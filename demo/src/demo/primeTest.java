package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class primeTest {

	@Test
	public void test() {
		prime num=new prime();
		assertEquals(true,num.PNC(71));
	}

}
