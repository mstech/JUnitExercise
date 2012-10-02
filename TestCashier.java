import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestCashier {

	// Tests the makeChange function for the cashier class.
	@Test
	public void testMakeChange() {
		Envelope testEnvelope = new Envelope(2, 5, 4, 0, 2);
		Cashier testCashier = new Cashier();
		Envelope expected = new Envelope(1, 3, 4, 0, 2);
		Envelope actual = new Envelope();
		try{
			actual = testCashier.makeChange(testEnvelope, 1, 50);
		}
		catch(NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertEquals(expected.getTotalCents(), actual.getTotalCents());
	}
	
	// Rule for testing the NegativeNumberException
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	// Tests the NegativeNumberException.
	@Test
	public void testMakeChangeexceptionThrown() {
		Envelope testEnvelope = new Envelope(2, 5, 4, 0, 2);
		Cashier testCashier = new Cashier();
		Envelope actual = new Envelope();
		try{
			testCashier.makeChange(testEnvelope, 5, 50);
			exception.expect(NegativeBalanceException.class);
		}
		catch(NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
