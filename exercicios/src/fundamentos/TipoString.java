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
		
		/*
		 * 
		 */
		
		//TEÓRICO**
		String imutavel = "\n\nValores originais";
		System.out.println(imutavel);
		
		//aqui só troquei o valor
		imutavel = "são sempre substituidos";
		
		//aqui eu troquei, mas mesmo que eu tenho modificado o prévio, e o 
		//substituo
		imutavel = imutavel.concat(", sem nunca ser realmente modificados!");
		System.out.println(imutavel);
		
		/*
		 * 
		 */
		
		//
		String apelido1 = "dedé";
		String APELIDO1 = "DEDÉ";
		String apelido2 = "messi";
		
		System.out.println(apelido1.equals(APELIDO1));
		System.out.println(apelido1.equalsIgnoreCase(APELIDO1));
		System.out.println(apelido1.equals(apelido2));
		
		/*
		 * 
		 */
		
		var familia = "francelino";
		System.out.println("Sobrenome contém Lino? " + familia.contains("lino"));
		
	}
	
}
