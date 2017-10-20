package desafio4;

import java.util.Scanner;

public class Palindromo {
	
	 public static void main(String[] args) {
		 int multiplicador = 1;
		 int multiplicando= 1;
		 int maiorPalindromo = 1;
		 int produto=1;
		 int numeroMaximo;
		 
		 
		 System.out.println("Quantidade de digitos do numero: ");
		 
		 Scanner entradaDados = new Scanner(System.in);
		 numeroMaximo = maximoNdigitos(entradaDados.nextInt());
		 
		 for(int contadorMultiplicador=1;contadorMultiplicador<=numeroMaximo ;contadorMultiplicador++){
			 
			 for(int contadorMultiplicando=1;contadorMultiplicando<=numeroMaximo ;contadorMultiplicando++){
				 produto = contadorMultiplicador*contadorMultiplicando;
				 
				 if(numeroPalindromo(produto) && produto>maiorPalindromo){
					 maiorPalindromo = produto;
					 multiplicador = contadorMultiplicador;
					 multiplicando = contadorMultiplicando;						 
				}
				 
			 } 
		 }
		 System.out.println("Maior palindromo do produto de dois numeros com 3 digitos: "+ maiorPalindromo+"\nProduto de "+multiplicador+ " com "+multiplicando);
	}
	 
	 public static int maximoNdigitos(int digitos){
		 String numeroTemporario = "";
		 
		 int contador=0;
		 while(contador<digitos){
			 numeroTemporario = numeroTemporario+"9";
			 contador++;
		 }
		 return Integer.parseInt(numeroTemporario);
	 }
	 
	 public static boolean numeroPalindromo(int numeroTestado){
		 String numero = Integer.toString(numeroTestado);
		 String numeroInverso = stringInversa(numero);
		 
		 if(numero.equalsIgnoreCase(numeroInverso))
			 return true;
		 
		 return false;
	 }
	 
	 public static String stringInversa(String stringParaInversao){
		 String stringInversa = new String();
		 
		 for (int i = stringParaInversao.length()-1; i >=0 ; i--) {
			stringInversa = stringInversa+stringParaInversao.charAt(i);
		}
		 
		 return stringInversa;
	 }
}
