import java.util.Scanner;

public class listacondicionais {

	public static void main(String[] args) {
    exercicio1();
		
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
		
	}

}
