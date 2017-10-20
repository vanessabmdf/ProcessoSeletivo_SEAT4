package desafio7;

public class NumeroPrimo {
	public static void main(String[] args) {
		
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
