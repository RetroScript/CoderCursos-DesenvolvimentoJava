package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//informações do usuário
		System.out.println("GAMELANDIA USER INFO:");
		
		//Capacidade de -138 a 137
		byte idade = 23;
		System.out.println("Idade: " + idade);
		
		//Capacidade de -32768 a 32749
		short horasMensais = 253;
		System.out.println("Horas mensais: " + horasMensais);
		
		//Limite (aproximado) de um INT
		int userID = 2_147_000_000;
		System.out.println("Código de usuário UID: " + userID);
		
		//Quando um long passar o LIMITE Int deve-se constar
		//"l" ou "l"
		long pontosAdiquiridos = 2_148_0240_000L;
		System.out.println("Pontos acumulados: " + pontosAdiquiridos);
		
		//Deve sempre tipar ou valor em "f" ou "F"
		float usoDiário = horasMensais / 30F;
		System.out.println("Consumo diário: " + usoDiário);
		double saldoDasCompras = 2_147_000_000.55;
		System.out.println("Sua compras totalizam: " + saldoDasCompras);
		System.out.println("Este usuário possui " + pontosAdiquiridos / saldoDasCompras + " pontos por compra");
		
		
		boolean inatividadeDaConta = false;
		System.out.println("Esta conta está inativa? " + inatividadeDaConta);
		char classeDaConta = 'A';
		System.out.println("Classe da conta: " + classeDaConta);
		
	}
	
}
