package desafio4;

public class Palindromo {
	
	 public static void main(String[] args) {
		 int multiplicador = 1;
		 int multiplicando= 1;
		 int maiorPalindromo = 1;
		 int produto=1;
		 
		 for(int contadorMultiplicador=1;contadorMultiplicador<=999 ;contadorMultiplicador++){
			 
			 for(int contadorMultiplicando=1;contadorMultiplicando<=999 ;contadorMultiplicando++){
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
		 
		 return 0;
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
