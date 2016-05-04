package cl.ubb.agil;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestStack {

	@Test
	public void stackPartevacio(){
		Stack stack = new Stack();
		
		boolean vacia = stack.estaVacio();
		
		assertThat(vacia,equalTo(true));
	}
	@Test
	public void agregarUnoAStack(){
		Stack stack = new Stack();
		
		stack.agregarNumero(1);
		boolean vacia= stack.estaVacio();
		
		assertThat(vacia,equalTo(false));
	}
}
