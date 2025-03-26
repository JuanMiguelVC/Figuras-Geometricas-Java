public class Decagono extends FiguraGeometrica {
    private double lado;
    private double apotema;

    public Decagono(double lado, double apotema) {
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
        return (5 * lado * apotema);
    }

    @Override
    public double calcularPerimetro() {
        return 10 * lado;
    }

}