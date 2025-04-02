import java.util.Scanner;

class CatalogoFGTriangulos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            System.out.println("Seleccione un triángulo:");
            System.out.println("1. Triángulo equilátero");
            System.out.println("2. Triángulo isósceles");
            System.out.println("3. Triángulo escaleno");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            System.out.println("Opción seleccionada: " + opcion);
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el lado del triángulo equilátero: ");
                    double ladoEquilatero = scanner.nextDouble();
                    TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(ladoEquilatero);
                    System.out.println("Área del triángulo equilátero: " + trianguloEquilatero.calcularArea());
                    System.out.println("Perímetro del triángulo equilátero: " + trianguloEquilatero.calcularPerimetro());
                }
                case 2 -> {
                    System.out.print("Ingrese el lado base del triángulo isósceles: ");
                    double baseIsosceles = scanner.nextDouble();
                    System.out.print("Ingrese el lado igual del triángulo isósceles: ");
                    double ladoIgualIsosceles = scanner.nextDouble();
                    double lado2 = ladoIgualIsosceles; // Assuming the second side is equal to the first side
                    TrianguloIsoceles trianguloIsosceles = new TrianguloIsoceles(baseIsosceles, ladoIgualIsosceles, lado2);
                    System.out.println("Área del triángulo isósceles: " + trianguloIsosceles.calcularArea());
                    System.out.println("Perímetro del triángulo isósceles: " + trianguloIsosceles.calcularPerimetro());
                }
                case 3 -> {
                    System.out.print("Ingrese el lado A del triángulo escaleno: ");
                    double ladoA = scanner.nextDouble();
                    System.out.print("Ingrese el lado B del triángulo escaleno: ");
                    double ladoB = scanner.nextDouble();
                    System.out.print("Ingrese el lado C del triángulo escaleno: ");
                    double ladoC = scanner.nextDouble();
                    TrianguloEscaleno trianguloEscaleno = new TrianguloEscaleno(ladoA, ladoB, ladoC);
                    System.out.println("Área del triángulo escaleno: " + trianguloEscaleno.calcularArea());
                    System.out.println("Perímetro del triángulo escaleno: " + trianguloEscaleno.calcularPerimetro());
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}