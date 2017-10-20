package desafio8;

import java.util.Scanner;

public class ProdutoAdjacente {

	public static void main(String[] args) {
		
		String grandeNumero;
		int digitosAdjacentes;
		
		Scanner entradeDeDados = new Scanner(System.in);
		
		System.out.println("Forneca os numeros para analise:");
		grandeNumero = entradeDeDados.nextLine();
		
		System.out.println("Forneca a quantidade de digitos adjacentes:");
		digitosAdjacentes = entradeDeDados.nextInt();
		
		System.out.println("Maior produto com "+digitosAdjacentes+" digitos adjacentes e: "+maiorNumeroSequencia(grandeNumero,digitosAdjacentes));
	}
	
	public static int maiorNumeroSequencia(String grandeNumero, int digitosAdjacentes){
		int maiorNumero = 0;
		int produto=1;
		
		for(int ponteiro=0;ponteiro <= 1000-digitosAdjacentes;ponteiro++){
			
			produto =  produtoDaString(grandeNumero.substring(ponteiro, ponteiro+digitosAdjacentes));
			
			if(produto > maiorNumero)
				maiorNumero =produto;
		}
		
		return maiorNumero;
	}
	
	public static int produtoDaString(String sequencia){
		int produto =1;
		
		for(int caracter=0; caracter < sequencia.length();caracter++){
			produto = produto * Integer.parseInt(sequencia.substring(caracter, caracter+1));
		}
		
		return produto;
	}

}
