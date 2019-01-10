package fp.daw.examen;

public class Ejercicio3 {

	/* 
	 * 2,5 puntos
	 * 
	 * Crea después de este comentario un método llamado escalera que, utilizando bucles anidados,
	 * cree y retorne un vector de cadenas de caracteres en el que se almacenen las cadenas  necesarias
	 * para representar una escalera de asteriscos. El método recibirá dos parámetros: el número de peldaños
	 * y un número entero que representará la orientación (0 = izquierda, 1 = derecha). Las cadenas se
	 * almacenarán en el vector de forma que el método main que se incluye al final muestre por pantalla
	 * los ejemplos siguientes:   
	 * 
	 *   Escalera de 7 peldaños con orientación izquierda:
	 * 
	 *   **
	 *   ****
	 *   ******
	 *   ********
	 *   **********
	 *   ************
	 *   **************
	 *      
	 *   Escalera de 5 peldaños con orientación derecha:
	 * 
	 *           **
	 *         ****
	 *       ******
	 *     ********
	 *   **********
	 *       
	 */  
	
	public static char[] escalera(int peldaños, int orientacion) {
		char [] vector = new char[peldaños * 2];
		int asteriscos = 0;
		
		if (orientacion == 0) {
			for(int i=0;i<vector.length;i++) {
				asteriscos = asteriscos + 2;
				for (int j=0;j<;j++) {
					System.out.println("*");
				}
			}
		}
		if (orientacion == 1) {
			for (int i=vector.length;i<=0;i--) {
				for (int j=;j<=0;j--) {
					
				}
			}
		}
		
		return vector;
		
		
	}

	
	public static void mostrarEscalera(String [] escalera) {
		for (int i=0; i<escalera.length; i++)
			System.out.println(escalera[i]);
	}
	
	public static void main(String[] args) {
		System.out.println("Escalera de 7 peldaños con orientación izquierda: ");
		System.out.println();
		mostrarEscalera(escalera(7, 0));
		System.out.println();
		System.out.println("Escalera de 5 peldaños con orientación derecha: ");
		System.out.println();
		mostrarEscalera(escalera(5, 1));
	}

}
