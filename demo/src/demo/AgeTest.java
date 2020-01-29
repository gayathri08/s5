package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {

	@Test
 public	void test() {
		Age age=new Age();
		assertEquals("eligible to vote",age.election(23));
	}

}
