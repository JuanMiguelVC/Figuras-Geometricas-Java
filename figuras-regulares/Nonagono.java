public class Nonagono extends FiguraGeometricaRegular {
    private double lado;

    public Nonagono(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (9 * Math.pow(lado, 2) * Math.tan(Math.PI / 9)) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return 9 * lado;
    }
}