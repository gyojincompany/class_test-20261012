package exercise;

import classExer.Car;

public class MainTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temperature temperature = new Temperature(25.0);
		Temperature temperature1 = new Temperature();
		temperature1.celsius = 30.0;
		
		double temp = temperature.toFahrenheit();
		
		System.out.println("화씨 온도: " + temp);
		
		
		classExer.Car car = new Car();
	}

}
