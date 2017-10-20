package desafio4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPalindromo {

	@Test
	public void testInversaoDeString() {
		String stringDeTeste = "ame a ema";
		
		assertEquals(stringDeTeste, Palindromo.stringInversa(stringDeTeste));
	}
	
	@Test
	public void testInversaoDeStringNaoPalindroma() {
		String stringDeTeste = "vanessa";
		String inversao = "assenav";
		
		assertEquals(inversao, Palindromo.stringInversa(stringDeTeste));
		assertNotEquals(stringDeTeste, Palindromo.stringInversa(stringDeTeste));
	}
	
	@Test
	public void testNumeroNaoPalindromo() {
		int numeroTeste = 1234;
		
		assertFalse(Palindromo.numeroPalindromo(numeroTeste));
	}
	
	@Test
	public void testNumeroPalindromo() {
		int numeroTeste = 9009;
		
		assertTrue(Palindromo.numeroPalindromo(numeroTeste));
	}
	
	@Test
	public void testMaximoNdigitos(){
		int digitos=3;
		
		assertEquals(999, Palindromo.maximoNdigitos(digitos));
	}
}
