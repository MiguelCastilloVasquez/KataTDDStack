package cl.ubb.agil;

public class Stack {
	private int tamanio;
	public Stack(){
		tamanio=0;
	}
	
	public boolean estaVacio(){
		if(tamanio==0){
			return true;
		}
		else 
			return false;
	}
	public void agregarNumero(int n){
		tamanio++;
	}
	
	public int devuelveTamanio(){
		return 1;
	}
}
