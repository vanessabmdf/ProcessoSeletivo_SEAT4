package desafio7;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		int termo;
		
		System.out.println("Termo:");
		Scanner entradeDeDados = new Scanner(System.in);
		termo = entradeDeDados.nextInt();
		
		System.out.println("Primo de termo "+termo+" : "+termoPrimo(termo));
	}
	
	public static int termoPrimo(int termo){
		
		int contador =1;
		int numeroTestado =2;
		
		while(contador!=termo){
			numeroTestado++;
			
			if(verificaNumeroPrimo(numeroTestado))
				contador++;
		}
		return numeroTestado;
		
	}
	
	public static boolean verificaNumeroPrimo(int numero){
		for(int divisor=2;divisor <numero; divisor++){
			if(numero%divisor==0){
				return false;
			}
		}
		
		return true;
	}
}
