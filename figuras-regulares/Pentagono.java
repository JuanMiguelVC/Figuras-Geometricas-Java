public class Pentagono extends FiguraGeometricaRegular {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }

}