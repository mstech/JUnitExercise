
import org.junit.Assert;
import org.junit.Test;

public class TestEnvelope {

	// Tests the GetTotalCents function for the Envelope class
	@Test
	public void testGetTotalCents() {
		Envelope env = new Envelope(2, 3, 2, 2, 1);
		int expected = 306;
		int actual = env.getTotalCents();
		Assert.assertEquals(expected, actual);
		
		env.setDollars(1);
		env.setQuarters(2);
		env.setDimes(1);
		env.setNickels(0);
		env.setPennies(2);
		expected = 162;
		actual = env.getTotalCents();
		Assert.assertEquals(expected, actual);		
	}
		
}
