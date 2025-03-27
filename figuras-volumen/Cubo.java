public class Cubo extends Figura3D {

    private double arista;

    public Cubo(double arista) {
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(arista, 3);
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(arista, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 12 * arista;
    }
}