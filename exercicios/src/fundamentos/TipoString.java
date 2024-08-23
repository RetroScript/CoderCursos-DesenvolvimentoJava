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
		
		System.out.println("\n\n");
		System.out.println("Esse 'dedé' e 'DEDÉ' são iguais? " + apelido1.equals(APELIDO1));
		System.out.println("Descosiderando os tamanhos esse 'dedé' e 'DEDÉ' são iguais? "
				+ apelido1.equalsIgnoreCase(APELIDO1));
		System.out.println("E 'messi', é igual a 'dedé'? " + apelido1.equals(apelido2));
		
		/*
		 * 
		 */
		
		//MÉTODO CONTAINS
		var familia = "francelino";
		System.out.println("\n\n");
		System.out.println("Sobrenome contém Lino? " + familia.contains("lino"));
		
		/*
		 * 
		 */
		
		//MÉTODO CONCAT
		
		String sorvete = "sorvete de...";
		String saborDeSorvete = " Chocolate!";
		
		System.out.println("\n\n");
		System.out.println(sorvete);
		
		//DEVE-SE ATRIBUIR! somente modificar com "concat" não atualiza o valor
		sorvete = sorvete.concat(saborDeSorvete);
		System.out.println(sorvete);
		
		/*
		 * 
		 */
		
		//MÉTODOS TOUPPERCASE E TOLOWERCASE
		
		String aumentar = "aumentado!";
		String diminuir = "DIMINUIDO!";
		
		System.out.println("\n\n");
		System.out.println("ANTES DA CIRURGIA!");
		
		System.out.println(aumentar);
		System.out.println(diminuir);
		
		aumentar = aumentar.toUpperCase();
		diminuir = diminuir.toLowerCase();
		
		System.out.println("\n");
		System.out.println("DEPOIS DA CIRURGIA!");
		
		System.out.println(aumentar);
		System.out.println(diminuir);
	}
	
}
