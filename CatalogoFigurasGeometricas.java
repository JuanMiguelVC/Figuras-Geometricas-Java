import java.util.Scanner;
class CatalogoFigurasGeometricas{
    public static void main(String[] args) {
        System.out.println("Selecciona una figura geomertrica:");
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        System.out.println("4. Circulo");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println("Introduce la base del triangulo:");
                double base = sc.nextDouble();
                System.out.println("Introduce la altura del triangulo:");
                double altura = sc.nextDouble();
                Triangulo triangulo = new Triangulo(base, altura);
                System.out.println("El area del triangulo es: " + triangulo.calcularArea());
                System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());
                triangulo.dibujar();
            }
            case 2 -> {
                System.out.println("Introduce el lado del cuadrado:");
                double lado = sc.nextDouble();
                Cuadrado cuadrado = new Cuadrado(lado);
                System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
                System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());
                cuadrado.dibujar();
            }
            case 3 -> {
                System.out.println("Introduce la base del rectangulo:");
                double base = sc.nextDouble();
                System.out.println("Introduce la altura del rectangulo:");
                double altura = sc.nextDouble();
                Rectangulo rectangulo = new Rectangulo(base, altura);
                System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
                System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
                rectangulo.dibujar();
            }
            case 4 -> {
                System.out.println("Introduce el radio del circulo:");
                double radio = sc.nextDouble();
                Circulo circulo = new Circulo(radio);
                System.out.println("El area del circulo es: " + circulo.calcularArea());
                System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());
                circulo.dibujar();
            }
            default -> System.out.println("Opcion no valida");
        }
    }
}