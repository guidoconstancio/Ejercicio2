import java.util.Scanner;

public class Mainn {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cantidadProducto = 0;
		String descripcionProducto = "";
		double valorUnitario = 0;

		String nombre = solicitarNombre(scan);
		String domicilio = solicitarDomicilio(scan);

		System.out.println("  MENU\n1 Ingresar producto\n2 Salir del programa ");
		int opcion = scan.nextInt();
		while (opcion != 2) {

			if (opcion == 1) {
				descripcionProducto = solicitarDescripcionProducto(scan);
				cantidadProducto = solicitarCantidadProducto(scan);
				valorUnitario = solicitarValorUnitario(scan);
				imprimirResultados(nombre, domicilio, cantidadProducto, descripcionProducto, valorUnitario);
			} else if (opcion != 1 && opcion != 2) {
				System.out.println("Número de opción incorrecta, por favor intentelo de nuevo\n");
			}
			System.out.println("  MENU\n1 Ingresar producto\n2 Salir del programa ");
			opcion = scan.nextInt();
		}
		System.out.println("---PROGRAMA FINALIZADO---");
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

	private static void imprimirResultados(String nombre, String domicilio, int cantidadProducto,
			String descripcionProducto, double valorUnitario) {
		System.out.println("---------------------------------------------------------------");
		System.out.println("Razón social: " + nombre + "\nDomicilio: " + domicilio);
		System.out.println("---------------------------------------------------------------");
		System.out.println("| CANTIDAD: " + cantidadProducto + " | DESCRIPCION: " + descripcionProducto
				+ "| VALOR UNITARIO: $" + valorUnitario + " |");
		System.out.println("---------------------------------------------------------------\n");

	}



}
