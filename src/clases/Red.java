package clases;

public class Red extends Pajaro {
	
	public Red( int angulo, int velocidad ) {
		super( angulo, velocidad );
		setTipo( "Red" ); //tipo ahora pasa a ser Red
	}
	
	public void usarPoder(){
		System.out.println( getTipo() + " uso su poder de ondas sonoras!." );
	}

}
