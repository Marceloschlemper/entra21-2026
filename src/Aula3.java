import java.util.Scanner;
public class Aula3 {

	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		//exercicio3(); 
		//exercicio4();
		//exercicio5();
		//exercicio6();
		//exercicio7();
		//exercicio8();
		//exercicio9();
		//exercicio10();
		//operadoresmatematicos();
		exercicio11();
	}
	
	

	static void exercicio1() {
		int x;
		x = 10;
		System.out.println("valor " + x);

	}

	static void exercicio2() {
    	String nome = "Marcelo";
        int idade = 17;
        double altura = 1.83;
        
         System.out.println("seu nome é " + nome + ", voce tem " + idade + " anos de idade" + " e " + altura + " metros de altura!");
    }
	
	static void exercicio3() {
		int valor1 = 3;
	    int valor2 = 53; 
	    
	    int soma = valor1 + valor2;
	    
	     System.out.println("a soma dos dois valores é igual a:" + soma);
	}
	
	static void exercicio4() {
		double preço = 53.99;
		
		 System.out.println("o preço do produto é " + preço + " reais"); 
	}
	
    static void exercicio5() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("digite seu nome");
    	String nome = sc.nextLine();
    	
    	System.out.println("seu nome é " + nome); 
    	
    	sc.close();
	}
    
    static void exercicio6() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("qual a sua idade: ");
    	int idade = sc.nextInt();
    	
    	int futuro  = idade + 10;
        
        System.out.println("sua idade daqui a 10 anos vai ser " + futuro  + " anos.");
        
        sc.close();
    			
    			
    }
    
    static void exercicio7() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("digite o primeiro numero: ");
    	int valor1 = sc.nextInt();
    	System.out.print("digite o segundo numero: ");
    	int valor2 = sc.nextInt();
    	
    	int resultado = valor1 + valor2;
    	
    	System.out.println("a soma desses dois numeros é igual a:" + resultado );
          
    	
    	sc.close();
          
          	
    }
    
    static void exercicio8() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("digite um numero decimal");
    	float numero1 = sc.nextFloat();
    	float resultado = numero1 * 2; 
    	
    	System.out.println("o seu numero multiplicado por 2 é igual a: " + resultado);
    	
    	sc.close();
    		
    	
    }
    
    static void exercicio9() { 
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("digite o valor do produto");
    	float produto = sc.nextFloat();
    	double resultado = produto * 0.9;
    	
    	System.out.println("o valor do produto com o desconto é igual : " + resultado);
    	
    	sc.close();
        	
    	
    }
    
    static void exercicio10() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("qual a largura do seu retangulo");
    	float largura = sc.nextFloat();
    	System.out.print("qual a altura do seu retangulo");
    	float altura = sc.nextFloat();
    	
    	float area = largura * altura;
    	
    	System.out.println("a area do seu retangulo é = " + area);
    	
    	sc.close();
    	
    	    	
    	
    }
    
    static void exercicio11() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("qual é sua primeira nota ");
    	float n1 = sc.nextFloat();
    	System.out.print("qual a sua segunda nota");
    	float n2 = sc.nextFloat();
    	System.out.print("qual a sua terceira nota");
    	float n3 = sc.nextFloat();
    	
    	float somn = n1 + n2 + n3;
        float resultado = somn / 3; 
        
        System.out.println("a media de suas notas é: " + resultado);
    	
    	
    	
    	
    }
   
	

}

