package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		//VARIÁVEIS 
			/*
			 * são valores que ocupam um certo espaço na memória do
			 * computador, possuindo um nome e um tipo, sendo alteráveis
			 * durante a execução do código
			 */
		
		//CONSTANTES
			/*
			 * continuam sendo espaços de memória do computador com
			 * seus tipos, valores, e nomes, porém, possuem valores 
			 * inalteráveis durante a execução da aplicação.
			 */
		
		//DECLARANDO VARIÁVEIS
		double raio = 3.4;
		final double PI = 3.14159;//usa-se final para constantes
		double area = PI*raio*raio;
		
		System.out.println(area);//usando variavel e seu valor
		
		
		//ALTERANDO VARIÁVEIS
		
		raio = 10;
		area = PI*raio*raio;
		
		System.out.println("Área = " + area);//juntando texto com valor		
		
	}
	
	
}
