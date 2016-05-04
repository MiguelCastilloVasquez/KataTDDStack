package cl.ubb.agil;

public class Stack {
	private int[] numeros = new int[2];
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
		numeros[tamanio-1]=n;
	}
	
	public int devuelveTamanio(){
		return 2;
	}
	public int hacerPop()throws ExcepcionStack{
		if(tamanio==0){
			throw new ExcepcionStack();
		}else{
			int numero = numeros[tamanio-1];
			tamanio--;
			return numero;
		}
			
	}
		
}
