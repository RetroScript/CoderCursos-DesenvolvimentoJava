package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		//"print()" executa somente a String sem pular linha
		System.out.print("Eu gosto...");
		System.out.print(" eu gosto de ler!");
		System.out.print("\nAinda mais quando estiver livre ou sozinho.");
		//o "\n" pula uma linha
		
		//"println()" executa tanto a String quanto pula uma linha
		System.out.println("\n\nLeio muitos Livros!");
		System.out.println("Para o mundo melhor ver");
		//tive que quebrar duas vezes, uma para separar as linhas,
		//outra paragrafos
		
		//"printf()" executa a String e a formata mas não pula linha
		System.out.printf("\nMeu livro favorito é %s", "pequeno príncipe");
		System.out.printf("\nEle possui mais ou menos %d páginas", 200);
		
		/*
		 * 
		 */
		
		//Esse tipo "escaneia" coisas, nesse exemplo ele lê as teclas ("System.in")
		Scanner entrada = new Scanner(System.in);
		
		//note os as quebras e espaços!
		System.out.print("\n\nQual seu livro favorito? ");
		String livroFav = entrada.nextLine();
		
		//usa-se "entrada.nextLine();" pois o console recebe "x\n" da entrada
		//sendo que só "x" é usado em "nextInt()". Para o "\n" não intervir nas próximas 
		//perguntas ele é lido em "entrada.nextLine();"
		System.out.print("Quantas páginas ele tem? ");
		int numeroPag = entrada.nextInt();
		entrada.nextLine();
		
		//Os métodos "nextLine()" e etc, quebram linha após executados!
		System.out.print("Quem o escreveu? ");
		String autor = entrada.nextLine();
		
		System.out.print("Qual o gênero desse livro? ");
		String genero = entrada.nextLine();
		
		//deve-se desligar o scanner para não gastar memória
		entrada.close();
	}
	
}
