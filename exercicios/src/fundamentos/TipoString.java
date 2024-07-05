package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		//"printf" facilita uso de valores em strings
		String nome = "André";
		System.out.printf("Meu nome é %s", nome);
		
		int idade = 18;
		System.out.printf("\nTenho %d anos", idade);
		
		double altura = 1.65;
		System.out.printf("\nTenho %.2f metros de altura", altura);
		
		//alternativa mais direta
		System.out.println("\n");
		System.out.printf("Meu nome é %s \nTenho %d anos \nTenho %.2f metros de altura"
				, nome, idade, altura);
		
		//usando "format()" para concatenar dinamicamente, assim como "printf()"
		String sobrenome = "Miguel";
		String nomeCompleto = String.format("Meu nome completo é %s %s", nome, sobrenome);
		System.out.println("\n\n" + nomeCompleto);
		
		
		
	}
	
}
