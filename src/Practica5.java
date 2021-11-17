import clases.Pajaro;
import clases.Chuck;
import clases.Matilda;
import clases.Red;
import java.util.Random;


public class Practica5 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		//creando tres objetos de tipo pajaro en un arreglo
		Pajaro [] pajaros = new Pajaro[ 3 ];
		for( int i = 0; i < pajaros.length; i++ ) {
			//crea tres objetos con parametros aleatorios para angulo y velocidad 
			pajaros[i] = new Pajaro( rand.nextInt(90) + 1, rand.nextInt(100) + 1 );
		}
		
		//Probar los metos de los objetos pajaros en el arreglo
		for( int i = 0; i < pajaros.length; i++ ) {
			System.out.println( "\nPajaro: " + ( i + 1 ) );
			pajaros[i].lanzar();
			pajaros[i].cerditosDerribados();
		}
		
		//subclase "Chuck"
		Chuck pajaroChuck = new Chuck( rand.nextInt(90) + 1, rand.nextInt(100) + 1 );
		System.out.println(); //salto de linea
		pajaroChuck.lanzar();
		pajaroChuck.usarPoder();
		pajaroChuck.cerditosDerribados();
		
		//subclase "Matilda"
		Matilda pajaroMatilda = new Matilda( rand.nextInt(90) + 1, rand.nextInt(100) + 1 );
		System.out.println(); //salto de linea
		pajaroMatilda.lanzar();
		pajaroMatilda.usarPoder();
		pajaroMatilda.cerditosDerribados();
		
		//subclase "Red"
		Red pajaroRed = new Red( rand.nextInt(90) + 1, rand.nextInt(100) + 1 );
		System.out.println(); //salto de linea
		pajaroRed.lanzar();
		pajaroRed.usarPoder();
		pajaroRed.cerditosDerribados();
	}

}
