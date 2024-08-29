package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = "texto";
		String s2 = new String("texto2");
		s.toUpperCase();
		
		//WRAPPERS
		//é a "objetificação" de um tipo primitivo
		int a = 123;
		System.out.println(a);
		
		
	}
	
}
