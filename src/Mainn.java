import java.util.Scanner;

public class Mainn {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);      // Declaración de variables 
		String descripcionProducto = "";
		String fraseNueva = "";
		int cantidadProducto = 0;
		double valorUnitario = 0;
		double total = 0;
		double iva = 0;
		double totalItem = 0;

		String nombre = solicitarNombre(scan);															//Solicita los datos del comprador
		String domicilio = solicitarDomicilio(scan);
		System.out.println("  MENU\n1 Ingresar producto\n2 Salir del programa ");
		int opcion = scan.nextInt();
		while (opcion != 2) {

			if (opcion == 1) {

				descripcionProducto = solicitarDescripcionProducto(scan);
				cantidadProducto = solicitarCantidadProducto(scan);
				valorUnitario = solicitarValorUnitario(scan);
				totalItem = calcularSubtotalItem(cantidadProducto, valorUnitario);
				total += calcularTotal(totalItem);
				iva = calcularIva(total);
				imprimirResultados(nombre, domicilio, cantidadProducto, descripcionProducto, valorUnitario,
						totalItem); /* imprime una línea, con los datos de compra del item ingresado */
				fraseNueva += fraseN(cantidadProducto, descripcionProducto, valorUnitario,
						totalItem); /* Guarda cada item nuevo ingresado para su posterior impresión en pantalla */
			}
			else if (opcion != 1 && opcion != 2) {
				System.out.println(
						"Número de opción incorrecta, por favor intentelo de nuevo\n"); /*
																						 * Control de excepción en caso
																						 * de que ingrese un número
																						 * incorrecto
																						 */
			}
			System.out.println("\n MENU\n1 Ingresar producto\n2 Salir del programa \n\n");
			System.out.println("------------------------------------------------------");
			opcion = scan.nextInt();
		}

		imprimir(nombre, domicilio, fraseNueva, cantidadProducto, descripcionProducto, valorUnitario, totalItem, iva,
				total);
		System.out.println("---PROGRAMA FINALIZADO---");

	}


	private static double calcularIva(double total) {
		double iva = total * 0.21;
		return iva;
	}

	private static String fraseN(int cantidadProducto, String descripcionProducto, double valorUnitario,
			double totalItem) {
		String frase = "-------------------------------------------------------------------------------------\n"
				+ "  " + cantidadProducto + "      |\t" + descripcionProducto + " \t\t|\t " + valorUnitario
				+ "\t\t|\t " + totalItem
				+ "\n-------------------------------------------------------------------------------------\n";
		return frase;
	}

	private static String imprimir(String nombre, String domicilio, String fraseNueva, int cantidadProducto,
			String descripcionProducto,
			double valorUnitario, double totalItem, double iva, double total) {

		System.out.println("*************************************************************************************\n");
		System.out.println("Fecha  24/4/1879\n");
		System.out.println("*************************************************************************************\n");
		System.out.println("Nombre: " + nombre );
		System.out.println("Domicilio: " + domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("Cantidad |\t Descripción\t |\t P.unit.\t |\t P.total\t|");
		System.out.println(fraseNueva);
		System.out.println("IVA: " + iva);
		System.out.println("Subtotal (sin IVA): " + total);
		System.out.println("Total:" + (total + iva));
		System.out.println("*************************************************************************************");
		return null;
	}

	private static String solicitarNombre(Scanner scan) {
		System.out.println("Ingrese razón social: ");
		String razonSocial = scan.nextLine();
		return razonSocial;
	}

	private static String solicitarDomicilio(Scanner scan) {
		System.out.println("Ingrese domicilio: ");
		String domicilio = scan.nextLine();
		return domicilio;

	}

	private static String solicitarDescripcionProducto(Scanner scan) {
		System.out.println("Ingresar descripción del producto: ");
		String descripcionProducto = scan.next();
		return descripcionProducto;
	}

	private static int solicitarCantidadProducto(Scanner scan) {
		System.out.println("Cantidad de producto: ");
		int cantidadProducto = scan.nextInt();
		return cantidadProducto;
	}

	private static double solicitarValorUnitario(Scanner scan) {
		System.out.println("Valor unitario: ");
		double valorUnitario = scan.nextDouble();
		return valorUnitario;
	}

	private static double calcularSubtotalItem(int cantidad, double valorUnitario) {
		double total = cantidad * valorUnitario;
		return total;

	}

	private static double calcularTotal(double subtotalItem) {
		double total = 0;
		total += subtotalItem;
		return total;

	}

	private static void imprimirResultados(String nombre, String domicilio, int cantidadProducto,
			String descripcionProducto, double valorUnitario, double total) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("Razón social: " + nombre + "\nDomicilio: " + domicilio);
		System.out.println("---------------------------------------------------------------");
		System.out.println("| CANTIDAD: " + cantidadProducto + " | DESCRIPCION: " + descripcionProducto
				+ "| VALOR UNITARIO: $" + valorUnitario + " |" + "SUBTOTAL: $" + total);
		System.out.println("---------------------------------------------------------------\n");

	}



}
