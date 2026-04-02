import java.util.Scanner;

public class listacondicionais {

	public static void main(String[] args) {
    //exercicio1();
	//exercicio2();
	//exercicio3();
	//exercicio4();
    //exercicio5();
	//exercicio6();
		exercicio7();
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
	
	static void exercicio5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("qual a sua idade");
		int idade = sc.nextInt();
		 if (idade < 16) {
			 System.out.println("voce nao pode votar!");
		 } else {
			 System.out.println("voce ja pode votar");
			 
		sc.close();
		 }
		
		
		
		
	}
	
	static void exercicio6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("qual o primeiro numero");
		int numero1 = sc.nextInt();
		System.out.print("qual o segundo numero");
		int numero2 = sc.nextInt();
		System.out.print("qual o terceiro numero");
		int numero3 = sc.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("o numero 1 é maior");
		} else if (numero2 >= numero3 && numero2 >= numero1) {
		    System.out.println("numero 2 é o maior");
		} else {
			System.out.println("numero 3 é maior");
			
		sc.close();
		}
		
		
		
		}
		
		static void exercicio7() {
			Scanner sc = new Scanner(System.in);

			System.out.print("qual foi a sua nota");
			int nota1 = sc.nextInt();
			
			if (nota1 >= 0 && nota1 <= 4) {
				System.out.println("sua nota foi insuficiente");
			} else if (nota1 > 4 && nota1 <= 6) {
			    System.out.println("sua nota foi regular");
			} else if (nota1 > 6 && nota1 <=8) {
				System.out.println("sua nota foi boa");
			} else {
				System.out.println("sua nota foi excelente!!!");
			    
			}
			
	
		
		
		
		
		
	}

}
