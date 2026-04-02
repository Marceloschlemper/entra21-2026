import java.util.Scanner;

public class listacondicionais {

	public static void main(String[] args) {
    //exercicio1();
	//exercicio2();
	//exercicio3();
	exercicio4();
	}
	
	static void exercicio1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite um numero inteiro");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("o numero é par!");
		} else {
			System.out.println("o numero é impar!");
		
			sc.close();
		}
		
	}
	
	static void exercicio2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite o primeiro numero");
		int numero1 = sc.nextInt();
		
		System.out.print("digite o segundo numero");
		int numero2 =  sc.nextInt();
		
		if (numero1 > numero2 ) {
		    System.out.println("o primeiro numero é maior!");
        } else { 
		   System.out.println("o segundo numero é maior!"); 
        }	
		sc.close();
		
		
	}
	
	static void exercicio3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite um numero");
		int numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("o numero é positivo!");
		} else if (numero < 0) {
			System.out.println ("o numero é negativo");
		} else 
			System.out.println("o numero é zero!");
		sc.close();
		
	}
	
	static void exercicio4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("qual foi sua nota");
		float nota = sc.nextFloat();
		 if (nota < 7) {
			 System.out.println("voce foi reprovado");
		 } else {
			 System.out.println("voce foi aprovado");
			 
         sc.close();
		 }
		
		
	}

}
