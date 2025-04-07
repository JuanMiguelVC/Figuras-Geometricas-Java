import java.util.Scanner;

/**
 *
 * @author Juan Miguel Vime Castillo
 * @version 1.0
 * @since 2025-04-02
 * @description Programa que permite calcular el área de diferentes figuras
 * geométricas cuadriláteras.
 */
public class CatalogoFGCuadrilateros {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Rombo");
            System.out.println("4. Trapecio");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            System.out.println("Opción seleccionada: " + opcion);
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                    System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
                    System.out.println(".Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
                }
                case 2 -> {
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                }
                case 3 -> {
                    System.out.print("Ingrese la diagonal mayor del rombo: ");
                    double diagonalMayorRombo = scanner.nextDouble();
                    System.out.print("Ingrese la diagonal menor del rombo: ");
                    double diagonalMenorRombo = scanner.nextDouble();
                    Rombo rombo = new Rombo(diagonalMayorRombo, diagonalMenorRombo);
                    System.out.println("Área del rombo: " + rombo.calcularArea());
                    System.out.println("Perímetro del rombo: " + rombo.calcularPerimetro());
                }
                case 4 -> {
                    System.out.print("Ingrese la base mayor del trapecio: ");
                    double baseMayorTrapecio = scanner.nextDouble();
                    System.out.print("Ingrese la base menor del trapecio: ");
                    double baseMenorTrapecio = scanner.nextDouble();
                    System.out.print("Ingrese la altura del trapecio: ");
                    double alturaTrapecio = scanner.nextDouble();
                    Trapecio trapecio = new Trapecio(baseMayorTrapecio, baseMenorTrapecio, alturaTrapecio);
                    System.out.println("Área del trapecio: " + trapecio.calcularArea());
                    System.out.println("Perímetro del trapecio: " + trapecio.calcularPerimetro());
                }
                default ->
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Saliendo...");
        System.out.println("Fin del programa.");
        System.out.println("Gracias por usar el catálogo de figuras geométricas.");
        System.out.println("Hasta luego.");
    }
}
