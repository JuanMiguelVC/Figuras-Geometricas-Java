public class TrianguloEscaleno extends FiguraGeometricaTriangular {

    private double lado1;
    private double lado2;
    private double lado3;

    public TrianguloEscaleno(double lado1, double lado2, double lado3) {
        this.lado1 = lado1; // Store the first side in this class
        this.lado2 = lado2; // Store the second side in this class
        this.lado3 = lado3; // Store the third side in this class
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

}
