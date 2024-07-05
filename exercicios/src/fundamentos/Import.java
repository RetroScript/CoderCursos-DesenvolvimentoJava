package fundamentos;

import java.util.Date;

public class Import {

	public static void main(String[] args) {
		//Java.lang é padrão e não requer import
		java.lang.String s = "texto1";
		java.lang.System.out.println(s);
		
		//portanto, convém não explita-lo
		String s1 = "texto2";
		System.out.println(s1);
		
		//algumas classes requerem import, que é feito fora do 
		//corpo da classe
		Date d = new Date();
		System.out.println(d);
		
		
	}
	
}
