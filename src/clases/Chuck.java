package clases;

public class Chuck extends Pajaro {
	
	public Chuck( int angulo, int velocidad ) {
		super( angulo, velocidad );
		setTipo( "Chuck" ); //tipo ahora pasa a ser Chuck
	}
	
	public void usarPoder() {
		System.out.println( getTipo() + " uso su poder de acelerar!." );
	}
}
