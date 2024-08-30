package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		
		Byte b = 100;
		Byte b1 = Byte.parseByte("100");
		System.out.println("Byte b = 100; -> " + b);
		System.out.println("Byte b = Byte.parseByte('100') -> " + b1 + "\n\n");
		
		
		Short s = 10000;
		Short s1 = Short.parseShort("10000");
		System.out.println("Short s = 10000; -> " + s);
		System.out.println("Short s1 = Short.parseShort(\"10000\"); -> " + s1 + "\n\n");
		
		Integer i = 1000000000;
		Integer i1 = Integer.parseInt("1000000000");
		System.out.println("Integer i = 1000000000; -> " + i);
		System.out.println("Integer i1 = Integer.parseInt(\"1000000000\"); -> " + i1 + "\n\n");
		
		Long l = 1000000000000000000l;
		Long l1 = Long.parseLong("1000000000000000000");
		System.out.println("Long l = 1000000000000000000l; -> " + l);
		System.out.println("Long l1 = Long.parseLong(\"1000000000000000000\"); -> " + l1 + "\n\n---\n");
		
		Float f = 1000.0F;
		Float f1 = Float.parseFloat("100.0");
		System.out.println("Float f = 1000.0F; -> " + f);
		System.out.println("Float f1 = Float.parseFloat(\"100.0\"); -> " + f1 + "\n\n");
		
		Double d = 1000.0;
		Double d1 = Double.parseDouble("1000.0");
		System.out.println("Double d = 1000.0; -> " + d);
		System.out.println("Double d1 = Double.parseDouble(\"1000.0\"); -> " + d1 + "\n\n\n\n");	
		
		Boolean bo = false;
		Boolean bo1 = Boolean.parseBoolean("false");
		System.out.println("Boolean bo = false; -> " + bo);
		System.out.println("Boolean bo1 = Boolean.parseBoolean(\"false\"); -> " + bo1 + "\n\n");
		
		Character ch = 'a';
		System.out.println("Character ch = 'a'; -> " + ch + "\n\n");

				
	}
	
}
