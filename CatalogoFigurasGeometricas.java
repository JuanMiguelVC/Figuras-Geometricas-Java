import java.util.Scanner;

class CatalogoFigurasGeometricas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println("Seleccione una figura geométrica:");
                System.out.println("1. Cuadrado");
                System.out.println("2. Rectángulo");
                System.out.println("3. Círculo");
                System.out.println("4. Triangulo");
                System.out.print("Opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el lado del cuadrado: ");
                        double ladoCuadrado = scanner.nextDouble();
                        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
                    }
                    case 2 -> {
                        System.out.print("Ingrese la base del rectángulo: ");
                        double baseRectangulo = scanner.nextDouble();
                        System.out.print("Ingrese la altura del rectángulo: ");
                        double alturaRectangulo = scanner.nextDouble();
                        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    }
                    case 3 -> {
                        System.out.print("Ingrese el radio del círculo: ");
                        double radioCirculo = scanner.nextDouble();
                        Circulo circulo = new Circulo(radioCirculo);
                        System.out.println("Área del círculo: " + circulo.calcularArea());
                    }
                    case 4 ->
                        System.out.println("Saliendo...");
                    default ->
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } while (opcion != 4);
        }

    }
}
