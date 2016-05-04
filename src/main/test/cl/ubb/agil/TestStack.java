package cl.ubb.agil;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestStack {
	private Stack stack;
	@Before
	public void setup(){
		stack = new Stack();
	}
	
	@Test
	public void stackPartevacio(){
		
		boolean vacia = stack.estaVacio();
		
		assertThat(vacia,equalTo(true));
	}
	@Test
	public void agregarUnoAStack(){
		
		stack.agregarNumero(1);
		boolean vacia= stack.estaVacio();
		
		assertThat(vacia,equalTo(false));
	}
	@Test 
	public void agregarUnoYDosAStack(){
		
		stack.agregarNumero(1);
		stack.agregarNumero(2);
		
		boolean vacia = stack.estaVacio();
		
		assertThat(vacia,equalTo(false));
	}
	public void agregaUnoYDosYDevuelveTamanioDos(){
		
		stack.agregarNumero(1);
		stack.agregarNumero(2);
		
		int tamanio = stack.devuelveTamanio();
		
		assertThat(tamanio,equalTo(1));
	}
}
