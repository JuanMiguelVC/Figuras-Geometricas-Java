import java.util.Scanner;

class CatalogoFGCurva {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Círculo");
            System.out.println("2. Elipse");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            System.out.println("Opción seleccionada: " + opcion);
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el radio del círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    Circulo circulo = new Circulo(radioCirculo);
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                }
                case 2 -> {
                    System.out.print("Ingrese el semieje mayor de la elipse: ");
                    double semiejeMayorElipse = scanner.nextDouble();
                    System.out.print("Ingrese el semieje menor de la elipse: ");
                    double semiejeMenorElipse = scanner.nextDouble();
                    Elipse elipse = new Elipse(semiejeMayorElipse, semiejeMenorElipse);
                    System.out.println("Área de la elipse: " + elipse.calcularArea());
                    System.out.println("Perímetro de la elipse: " + elipse.calcularPerimetro());
                }
                default ->
                    System.out.println("Opción no válida.");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
