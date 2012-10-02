
// Class Envelope is a simulated envelope of money containing Dollars, Quarters, Nickels, Dimes and Pennies.
public class Envelope {
	
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	


	public Envelope(int dollars, int quarters, int dimes, int nickels,
			int pennies) {
		super();
		this.dollars = dollars;
		this.quarters = quarters;
		this.dimes = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}


	public Envelope() {
		this.dollars = this.quarters = this.dimes = this.nickels = this.pennies = 0;
	}


	public int getDollars() {
		return dollars;
	}


	public void setDollars(int dollars) {
		this.dollars = dollars;
	}


	public int getQuarters() {
		return quarters;
	}


	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}


	public int getDimes() {
		return dimes;
	}


	public void setDimes(int dimes) {
		this.dimes = dimes;
	}


	public int getNickels() {
		return nickels;
	}


	public void setNickels(int nickels) {
		this.nickels = nickels;
	}


	public int getPennies() {
		return pennies;
	}


	public void setPennies(int pennies) {
		this.pennies = pennies;
	}
	
	// returns the total number of cents in the envelope.
	public int getTotalCents() {
		return dollars*100 + quarters*25 +dimes*10 +nickels*5 + pennies;
	}

	
}
