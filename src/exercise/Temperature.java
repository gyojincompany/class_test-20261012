package exercise;

public class Temperature {
	
	double celsius; //섭씨 온도

	public Temperature() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Temperature(double celsius) {
		super();
		this.celsius = celsius;
	}
	
	public double toFahrenheit() {		
		
		return celsius * 1.8 + 32;
	}
}
