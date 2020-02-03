package demo;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class AgeTest2 {
	private int input;
	private String output;
	public AgeTest2(int input,String output)
	{
		this.input=input;
		this.output=output;

	}
@Before
	public void init()
	{
		Age age = new Age();
	}
@Parameterized.Parameters
public static Collection aget()
{
	return Arrays.asList(new Object[][]{
			{14,"not eligible to vote"},
		{20,"eligible to vote"}
			}
			);
}
@Test
public void addtest()
{
	assertEquals(output,Age.election(input));
}

}
