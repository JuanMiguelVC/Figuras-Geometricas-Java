import java.util.Scanner;

class CatalogoFGRegulares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Seleccione una figura geométrica regular:");
        System.out.println("1. Pentágono");
        System.out.println("2. Hexágono");
        System.out.println("3. Heptágono");
        System.out.println("4. Octágono");
        System.out.println("5. Nonágono");
        System.out.println("6. Decágono");
        System.out.print("Opción: ");
        opcion = scanner.nextInt();
        System.out.println("Opción seleccionada: " + opcion);
        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el lado del pentágono: ");
                double ladoPentagono = scanner.nextDouble();
                System.out.print("Ingrese el apotema del pentágono: ");
                double apotemaPentagono = scanner.nextDouble();
                Pentagono pentagono = new Pentagono(ladoPentagono, apotemaPentagono);
                System.out.println("Área del pentágono: " + pentagono.calcularArea());
                System.out.println("Perímetro del pentágono: " + pentagono.calcularPerimetro());
            }
            case 2 -> { 
                System.out.print("Ingrese el lado del hexágono: ");
                double ladoHexagono = scanner.nextDouble();
                Hexagono hexagono = new Hexagono(ladoHexagono);
                System.out.println("Área del hexágono: " + hexagono.calcularArea());
                System.out.println("Perímetro del hexágono: " + hexagono.calcularPerimetro());
            }
            case 3 -> {
                System.out.print("Ingrese el lado del heptágono: ");
                double ladoHeptagono = scanner.nextDouble();
                Heptagono heptagono = new Heptagono(ladoHeptagono);
                System.out.println("Área del heptágono: " + heptagono.calcularArea());
                System.out.println("Perímetro del heptágono: " + heptagono.calcularPerimetro());
            }
            case 4 -> { 
                System.out.print("Ingrese el lado del octágono: ");
                double ladoOctagono = scanner.nextDouble();
                Octogono octagono = new Octogono(ladoOctagono);
                System.out.println("Área del octágono: " + octagono.calcularArea());
                System.out.println("Perímetro del octágono: " + octagono.calcularPerimetro());
            }
            case 5 -> {
                System.out.print("Ingrese el lado del nonágono: ");
                double ladoNonagono = scanner.nextDouble();
                Nonagono nonagono = new Nonagono(ladoNonagono);
                System.out.println("Área del nonágono: " + nonagono.calcularArea());
                System.out.println("Perímetro del nonágono: " + nonagono.calcularPerimetro());
            }
            case 6 -> {
                System.out.print("Ingrese el lado del decágono: ");
                double ladoDecagono = scanner.nextDouble();
                System.out.print("Ingrese el apotema del decágono: ");
                double apotemaDecagono = scanner.nextDouble();
                Decagono decagono = new Decagono(ladoDecagono, apotemaDecagono);
                System.out.println("Área del decágono: " + decagono.calcularArea());
                System.out.println("Perímetro del decágono: " + decagono.calcularPerimetro());
            }
            default -> System.out.println("Opción no válida. Intente de nuevo.");
                
        }

    }
}
