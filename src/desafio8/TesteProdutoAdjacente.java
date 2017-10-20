package desafio8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoAdjacente {

	@Test
	public void testProdutoDaString() {
		int resultado = 1;
		String sequencia= "1111";
		
		assertEquals(resultado, ProdutoAdjacente.produtoDaString(sequencia));
	}
	
	@Test
	public void testProdutoDaStringNumerosVariados() {
		int resultado = 24;
		String sequencia= "1234";
		
		assertEquals(resultado, ProdutoAdjacente.produtoDaString(sequencia));
	}
	
	@Test
	public void testProdutoDaStringSequenciaZero() {
		int resultado = 0;
		String sequencia= "1089";
		
		assertEquals(resultado, ProdutoAdjacente.produtoDaString(sequencia));
	}

}
