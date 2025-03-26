public class Heptagono extends FiguraGeometrica {
    private double lado;

    public Heptagono(double lado) {
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
        return (7 * Math.pow(lado, 2) * Math.tan(Math.PI / 7)) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return 7 * lado;
    }
}