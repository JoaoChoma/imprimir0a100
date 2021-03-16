package teste_programacao;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperacaoTeste {

	@Test
	public void test() {
		
		Operacao op = new Operacao();
		
		assertEquals(op.search(1, 1, "um"), "um");
		assertEquals(op.search(1, 2, "um"), "");
		
	
	}

}
