public class Octogono extends FiguraGeometricaRegular {
    private double lado;

    public Octogono(double lado) {
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
        return 2 * Math.pow(lado, 2) * (1 + Math.sqrt(2));
    }

    @Override
    public double calcularPerimetro() {
        return 8 * lado;
    }
}