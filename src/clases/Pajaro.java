package clases;

import java.util.Random;

public class Pajaro {
	private String tipo;
	private int angulo;
	private int velocidad;
	private Random rand = new Random();
	
	public Pajaro( int angulo, int velocidad ) {
		this.angulo = angulo;
		this.velocidad = velocidad;
		//El tipo por defecto es "Pajaro" cambia cuando se crean objetos 
		//de otras subclases
		setTipo( "Pajaro" ); 
	}
	
	public void setTipo( String tipo ) {
		this.tipo = tipo;
	}
	
	public void setAngulo(int angulo) {
		this.angulo = angulo;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	
	public String getTipo() {
		return tipo;
	}
	
	public int getAngulo() {
		return angulo;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	//genera un numero aleatorio de cerditos derribados 
	public void cerditosDerribados() {
		int noCerditos = rand.nextInt( 6 );
		System.out.println( "Derribo " + noCerditos + " cerditos. " );
	}
	
	public void lanzar() {
		System.out.print( getTipo() + " fue lanzado con un angulo de " + getAngulo() + " grados," );
		System.out.println( " a una velocidad de " + getVelocidad() + "km/h." );
	}
}
