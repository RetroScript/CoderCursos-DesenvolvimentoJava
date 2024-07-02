package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		final double factor = 5/9.0;
		final int farenAdjust = 32;
		
		double inputFaren = 86;
		double resultCelsius = (inputFaren - farenAdjust) * factor;
		
		System.out.println("O resultado é: " + resultCelsius + "ºC.");
		
		inputFaren = 150;
		resultCelsius = (inputFaren - farenAdjust) * factor;

		System.out.println("O resultado é: " + resultCelsius + "ºC.");
	}
	
}
