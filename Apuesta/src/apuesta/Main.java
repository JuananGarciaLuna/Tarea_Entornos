/**
 * @author Juan Antonio García
 */
package apuesta;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
    	Apuesta laApuesta;
        int mi_dinero;

        operativa_Apuesta(0);
    }

	/**
	 * Operativa apuesta.
	 *
	 * @param dinero the dinero
	 */
	private static void operativa_Apuesta(int dinero) {
		Apuesta laApuesta;
		int mi_dinero;
		laApuesta = new Apuesta(1000, 4, 2);
        try {
            System.out.println("Apostando...");
            laApuesta.apostar(25);
        } catch (Exception e) {
            System.out.println("Fallo al realizar la Apuesta");
        }

        try {
            System.out.println("Intento cobrar apuesta segun el resultado del partido");
            laApuesta.cobrar_apuesta(2, 3);
        } catch (Exception e) {
            System.out.println("Fallo al cobrar la apuesta");
        }
        mi_dinero = laApuesta.getDinero_disp();
        System.out.println("El dinero que tengo tras las apuestas es " + mi_dinero);
	}
}
