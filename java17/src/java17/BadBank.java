package java17;

public class BadBank extends Bank{
	double intertsetRate;
	
	public double getInterestRate() {
		intertsetRate = 10.0;
		return intertsetRate;
	}
}
