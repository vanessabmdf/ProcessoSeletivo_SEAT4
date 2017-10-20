package desafio4;

public class Palindromo {
	
	 public static void main(String[] args) {
		
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
