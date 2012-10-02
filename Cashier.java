
public class Cashier {

	public Envelope makeChange(Envelope env, int dollars, int cents) throws NegativeBalanceException {
		int numberOfCentsRemaining = (env.getTotalCents() - (dollars * 100 + cents));
		//try {
			if (numberOfCentsRemaining < 0) {
				throw new NegativeBalanceException("Price exceeds envelope contents by " + numberOfCentsRemaining + " cents.");
			} else {
				//calculate amount off numberOfCentsRemaining
				Envelope ret = new Envelope();
				if (numberOfCentsRemaining >= 100) {
					int numDollars = (int) Math.floor(numberOfCentsRemaining / 100);
					ret.setDollars(numDollars);
					numberOfCentsRemaining -= (numDollars * 100);
				}
				if (numberOfCentsRemaining >= 25) {
					int numQuarters = (int) Math.floor(numberOfCentsRemaining / 25);
					ret.setQuarters(numQuarters);
					numberOfCentsRemaining -= (numQuarters * 25);	
				}
				if (numberOfCentsRemaining >= 10) {
					int numDimes = (int) Math.floor(numberOfCentsRemaining / 10);
					ret.setDimes(numDimes);
					numberOfCentsRemaining -= (numDimes * 10);					
				}
				if (numberOfCentsRemaining >= 5) {
					int numNickels = (int) Math.floor(numberOfCentsRemaining / 05);
					ret.setNickels(numNickels);
					numberOfCentsRemaining -= (numNickels * 05);
				}
				if (numberOfCentsRemaining >= 1) {
					int numPennies = numberOfCentsRemaining;
					ret.setPennies(numPennies);
					numberOfCentsRemaining -= (numPennies);
				}
				
				return ret;
			}
	}	
	
	
}
