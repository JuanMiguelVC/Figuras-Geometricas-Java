public class Hexagono extends FiguraGeometricaRegular {
    private double lado;

    public Hexagono(double lado) {
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
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }
}