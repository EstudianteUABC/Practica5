package clases;

public class Matilda extends Pajaro{
	
	public Matilda( int angulo, int velocidad ) {
		super( angulo, velocidad );
		setTipo( "Matilda" ); //tipo ahora pasa a ser Matilda
	}
	
	public void usarPoder() {
		System.out.println( getTipo() + " uso su poder de lanzar huevos explosivos!." );
	}

}
