
import java.util.Scanner;
/**
 * Clase de prueba COMPLETAR EL CODIGO DEL METODO procesar Opcion 
 * @author Pablo Asiain
 */
public class TestAlmacen1 {

    static public void main(String[] argv) {

        Almacen1 prueba = new Almacen1();
        Scanner sc = new Scanner(System.in);
        int opcion;

        mostrarMenu();
        opcion = sc.nextInt();
        while (opcion != 0) {
            procesarOpcion(opcion, prueba);
            mostrarMenu();
            opcion = sc.nextInt();
        }
        sc.close();
        
    }
	/**
	 *metodo para mostrar el menu del almacen
	 */
    static void mostrarMenu() {
        System.out.println("--- MENU DE  CONTROL DEL ALMACEN -----");
        System.out.println(" 1.- Mostrar contenido del Almacen");
        System.out.println(" 2.- Poner un Valor  ");
        System.out.println(" 3.- Buscar un Valor ");
        System.out.println(" 4.- Borrar un Valor");
        System.out.println(" 5.- Contar posiciones ocupadas.");
        System.out.println(" 6.- Contar posiciones libres.");
        System.out.println(" 0.- Terminar");
            System.out.print(" Introduzca una opcion:[1-6]:");
    }

	/**
	 * Procesa la opción introducida operando sobre el objeto Almacen1
	 * @param opcion
	 * @param parAlmacen
	 */
    static void procesarOpcion(int opcion, Almacen1 parAlmacen) {
		Scanner sc = new Scanner(System.in);
		switch (opcion) {
		case 1:
			System.out.println("Contenido almacen = " + parAlmacen.toString());
		case 2:
			int num = sc.nextInt();
			System.out.println("Valor a poner = " + parAlmacen.ponValor(num));
		case 3:
			int num1 = sc.nextInt();
			System.out.println("Valor a buscar = " + parAlmacen.estaValor(num1));
		case 4:
			int num2 = sc.nextInt();
			System.out.println("Valor a borrar = " + parAlmacen.sacarValor(num2));
		case 5:
			System.out.println("Contenido almacen = " + parAlmacen.numPosicionesOcupadas());
		case 6:
			System.out.println(" Posiciones libres = " + parAlmacen.numPosicionesLibres());
        }

    }

}
