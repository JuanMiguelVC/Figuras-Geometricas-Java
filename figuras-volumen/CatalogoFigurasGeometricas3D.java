import java.util.Scanner;

class CatalogoFigurasGeometricas3D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Selecciona una figura geomertrica:");
            System.out.println("1. Prisma");
            System.out.println("2. Cubo");
            System.out.println("3. Tetraedro");
            System.out.println("4. Esfera");
            System.out.println("5. Cono");
            System.out.println("6. Cilindro");
            System.out.println("7. Piramide");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce la base del prisma:");
                    double base = sc.nextDouble();
                    System.out.println("Introduce la altura del prisma:");
                    double altura = sc.nextDouble();
                    System.out.println("Introduce la profundidad del prisma:");
                    double profundidad = sc.nextDouble();
                    Prisma prisma = new Prisma(base, altura, profundidad);
                    System.out.println("El volumen del prisma es: " + prisma.calcularVolumen());
                    System.out.println("El area del prisma es: " + prisma.calcularArea());
                    System.out.println("El perimetro del prisma es: " + prisma.calcularPerimetro());
                }
                case 2 -> {
                    System.out.println("Introduce la arista del cubo:");
                    double arista = sc.nextDouble();
                    Cubo cubo = new Cubo(arista);
                    System.out.println("El volumen del cubo es: " + cubo.calcularVolumen());
                    System.out.println("El area del cubo es: " + cubo.calcularArea());
                    System.out.println("El perimetro del cubo es: " + cubo.calcularPerimetro());
                }
                case 3 -> {
                    System.out.println("Introduce la arista del tetraedro:");
                    double arista = sc.nextDouble();
                    Tetraedro tetraedro = new Tetraedro(arista);
                    System.out.println("El volumen del tetraedro es: " + tetraedro.calcularVolumen());
                    System.out.println("El area del tetraedro es: " + tetraedro.calcularArea());
                    System.out.println("El perimetro del tetraedro es: " + tetraedro.calcularPerimetro());
                }
                case 4 -> {
                    System.out.println("Introduce el radio de la esfera:");
                    double radio = sc.nextDouble();
                    Esfera esfera = new Esfera(radio);
                    System.out.println("El volumen de la esfera es: " + esfera.calcularVolumen());
                    System.out.println("El area de la esfera es: " + esfera.calcularArea());
                    System.out.println("El perimetro de la esfera es: " + esfera.calcularPerimetro());
                }
                case 5 -> {
                    System.out.println("Introduce el radio del cono:");
                    double radio = sc.nextDouble();
                    System.out.println("Introduce la altura del cono:");
                    double altura = sc.nextDouble();
                    Cono cono = new Cono(radio, altura);
                    System.out.println("El volumen del cono es: " + cono.calcularVolumen());
                    System.out.println("El area del cono es: " + cono.calcularArea());
                    System.out.println("El perimetro del cono es: " + cono.calcularPerimetro());
                }
                case 6 -> {
                    System.out.println("Introduce el radio del cilindro:");
                    double radio = sc.nextDouble();
                    System.out.println("Introduce la altura del cilindro:");
                    double altura = sc.nextDouble();
                    Cilindro cilindro = new Cilindro(radio, altura);
                    System.out.println("El volumen del cilindro es: " + cilindro.calcularVolumen());
                    System.out.println("El area del cilindro es: " + cilindro.calcularArea());
                    System.out.println("El perimetro del cilindro es: " + cilindro.calcularPerimetro());
                }
                case 7 -> {
                    System.out.println("Introduce el area de la base de la piramide:");
                    double areaBase = sc.nextDouble();
                    System.out.println("Introduce la altura de la piramide:");
                    double altura = sc.nextDouble();
                    Piramide piramide = new Piramide(areaBase, altura);
                    System.out.println("El volumen de la piramide es: " + piramide.calcularVolumen());
                    System.out.println("El area de la piramide es: " + piramide.calcularArea());
                    System.out.println("El perimetro de la piramide es: " + piramide.calcularPerimetro());
                }
                default -> System.out.println("Opción no válida.");
            }
            // Close the scanner to avoid resource leaks
            sc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Saliendo...");
        }
    }
}