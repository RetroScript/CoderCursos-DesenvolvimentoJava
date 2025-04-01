package fundamentos;

public class ConversãoTipoPrimitivoNumérico{

    public static void main(String [] args){

        double a = 1; // implicita
        System.out.println(a);
        
        float b = 1.0F;

        float b1 = (float) 1.1234567888888; //explícita (CAST)
        System.out.println(b1);

        //byte é "menor" (em armazenamento) do que o int

        int c = 4;
        byte d = (byte) c;  //conversão explícita (CAST)
        System.out.println(d);

        //Se eu usar um valor INT em BYTE, eu DEVO fazer um CAST
    

        //DOUBLE possui mais alcance (nos decimais) que o INT
        double e = 1.99999999;
        int f = (int) e; //conversão explícita (CAST)
        System.out.println(f); //O valor final é truncado

        //SEMPRE QUE HAVER ALGUMA PERDA DE INFORMAÇÃO A CONVERSÃO DEVER SER EXPLICITA

    }



}