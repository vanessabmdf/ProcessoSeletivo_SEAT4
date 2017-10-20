package desafio7;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteNumeroPrimo {

	@Test
	public void testNumeroPrimo() {
		assertTrue(NumeroPrimo.verificaNumeroPrimo(7));
	}
	
	@Test
	public void testNumeroNaoPrimo() {
		assertFalse(NumeroPrimo.verificaNumeroPrimo(14));
	}

}
