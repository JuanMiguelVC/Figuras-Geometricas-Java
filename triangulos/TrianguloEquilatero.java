public abstract class TrianguloEquilatero extends FiguraGeometrica implements FiguraGeometricaDibujable {

    private final double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo equilátero de lado " + lado);
    }

}
