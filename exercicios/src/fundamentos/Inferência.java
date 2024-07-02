package fundamentos;

public class Inferência {

	public static void main(String[] args) {
		
		double a = 0.5;
		System.out.println(a);
		
//		a = "não pode mudar o tipo!!!";
		
		var b = 10;
		b = b*b;
		System.out.println("10 ao quadrado é: " + b);
		
		var c = false;
		System.out.println("Esse bool c é: " + c);
		
		var d = "Olá";
		System.out.println(d + "...");
		
		d = d + " mundo";
		System.out.println(d + "!");
		
		var e = 0.5;
		e = 20;
		System.out.println("double e de valor " + e + " sempre será decimal");
		
		//variáveis comuns:
		double f;//declara
		f = 16.55;//inicializa
		System.out.println(f);//usa
		
		//variáveis inferidas:
		var g = 16.55;//inicializa-se ao declarar
		System.out.println(g);
		
		//NUNCA PODE-SE MUDAR UM TIPO
		//g = false; (XXX)
		//f = "ola mundo?"; (XXX)
		
		//NUNCA SE DECLARA ASSIM:
//		var h;
//		h = 10;
//		System.out.println(h);
	}
	
}
