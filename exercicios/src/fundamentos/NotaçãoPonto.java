package fundamentos;

public class NotaçãoPonto {

	public static void main(String[] args) {
		
		//String não é Primitivo!!
		String s = "Eu posso";
		s = s.concat(" usar métodos");
		System.out.println(s);
		//alteração por extenso
		
		String s1 = "que alteram o conteúdo".toLowerCase();
		System.out.println(s1);
		//atribuição de uma execução durante criação
		
		String s2 = "DE DIVERSAS MANEIRAS".toLowerCase().concat("!!");
		System.out.println(s2);
		//execuções em sequência
		
		System.out.println("Todo texto é um objeto".toUpperCase());
		//propriedades dos literais não primitivos
		
		//O ponto "." me permite acessar coisas!
		System.out.println(s.charAt(0));
		//veja como "charAt()" está sumbmetido a 's'!
		
		
		
		//NÃO É POSSÍVEL! char um primitivo não possui comportamento de
		//String: "toUpperCase()"
//		String s3 = "Essa string tem texto";
//		s3.toLowerCase().charAt().toUpperCase();
		
	}
	
}
