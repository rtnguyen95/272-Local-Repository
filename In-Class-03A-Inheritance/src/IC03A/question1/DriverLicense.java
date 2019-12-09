package IC03A.question1;

public class DriverLicense extends Card {
	private int expYear;
	
	public DriverLicense(String n, int expYear) {
		super(n);
		this.expYear = expYear;
		
	}
	
	public String format() {
		return super.format() + " " + "Expiration Year: " + expYear;
	}

}
