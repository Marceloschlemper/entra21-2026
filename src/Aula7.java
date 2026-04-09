import java.util.Scanner;

public class Aula7 {

	public static void main(String[] args) {

    //exemplo();
	//exercicio();
	//exercicio2();
     //exercicio3();
	//exercicio4();
		exercicio5();
	}
	static void exemplo() {
			String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		System.out.println(cars[2]);
		
		cars[2] = "chevrolet";
		System.out.println(cars[2]);
		
		System.out.println("");
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(i +  " -> " +cars[i]);
			
		}
		
		System.out.println("");
		int x = 0;
		while(x < cars.length) {
			System.out.println(x + " -> " + cars[x]);
			x++;
			
		} 
		
		//nao indexado - interativo
		System.out.println("");
		for(String c : cars ) { 
			System.out.println(c);
		}
			
			
		
		
		}
    static void exercicio() {
    	 Scanner sc = new Scanner(System.in);
		 int[] numeros = new int[5];
		   
		 for (int i = 0; i < 5; i++) {
    	 System.out.print("digite um numero para a posiçao" + i + ":");
		 numeros[i] =  sc.nextInt();
		 }
		 
		//MOSTRANDO OS NUMEROS 
		 System.out.println("/nNumeros dobrados");
		 for(int i = 0; i < 5; i++) {
			 int dobro = numeros[i] * 2;
			 System.out.println("posiçao " + i + ": " + dobro);
		 }
		 sc.close();
		 }
    
    static void exercicio2() {
    	Scanner sc = new Scanner(System.in);
    	int[] numeros = new int[10];
		 
		 //CAPTANDO OS NUMEROS 
    	for (int i = 0; i < 10; i++) {
	    	 System.out.print("digite um numero para a posiçao" + i + ":");
		 numeros[i] =  sc.nextInt();
		 }
		
		 //DETECTANDO OS NUMEROS PARES E IMPARES E PASSANDO PARA O USUARIO
    	for (int i = 0; i < 10; i++) {
		    if (numeros[i] % 2 == 0) {
			 System.out.println("o numero " + numeros[i] + " é par");
		 } else {
			 System.out.println("o numero " +  numeros[i] + " é impar");
		 
		 }  
		 sc.close(); 
		 }
		 
		 }
		 
		 static void exercicio3() {
			 Scanner sc = new Scanner(System.in);
		    	int[] numeros = new int[10];
		    	
		    	for (int i = 0; i < 10; i++) {
			    	 System.out.print("digite um numero para a posiçao" + i + ":");
				 numeros[i] =  sc.nextInt();
		    	}
		    	for (int i = 10 -1; i >=0; i--) {
		    	System.out.println("a sequencia de traz pra frente é..." + numeros[i]);
		    	
		    	
		    		
		    	}
		 }
		 
		 static void exercicio4() {
			 Scanner input = new Scanner(System.in);
		    	int[] numeros = new int[15];
		    	//LENDO 15 NUMEROS
		    	for (int i = 0; i < 15; i++) {
			    	 System.out.print("digite um numero para a posiçao" + i + ":");
				     numeros[i] =  input.nextInt();
		    	}
		    	//ACHANDO O MAIOR
		    	int maior = numeros[0];
		    	for (int i = 0; i < 15; i++) {
		    		if(numeros[i]> maior) {
		    			maior = numeros[i];
		    		}		 
		    		
		    		}
		    		 System.out.println("o numero maior é" + maior);
		    		
		    
		    			
		    	
		    	System.out.println("e esta localizado em");
		    	for(int i = 0; i < 15; i++) {
		    		if(numeros[i] == maior) {
		    			System.out.print((i + 1) + " ");
		    		}
		    	}
		    	input.close();
		    	
		    	  		
		    	}
		 
		 static void exercicio5() {
			 Scanner input = new Scanner(System.in);
		    	int[] numeros = new int[8];
		    	//LENDO 8 NUMEROS
		    	for (int i = 0; i < 8; i++) {
			    	 System.out.print("digite um numero para a posiçao" + i + ":");
				     numeros[i] =  input.nextInt();
		    	}
		    	for (int i = 0; i < 8; i++) {
		    		for(int j = i + 1; j < 8; j++) {
		    			
		    			if (numeros[i] > numeros[j]) {
		    				int temp = numeros[i];
		    				numeros[i] = numeros[j];
		    				numeros[j] = temp;
		    			
		    			}
		    		}
		    	}
		    	
		    	System.out.println("ordem crescente:");
		    	for(int i = 0; i < 8; i++) {
		    	   System.out.println(numeros[i] + " ");
		    	
		    	   input.close();
		    	} 
		    	
		    	  
		    	
			 
		 }
		    	
		    	}
		 

    

		 
		 
		   
    
   
    
    
     
	

	



