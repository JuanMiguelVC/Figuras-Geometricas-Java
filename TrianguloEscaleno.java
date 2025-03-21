public class TrianguloEscaleno extends FGTriangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public TrianguloEscaleno(double lado1, double lado2, double lado3) {
        super(0, 0); // Call the superclass constructor with 0, 0
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

    public double area() {
        double p = (getLado1() + getLado2() + lado3) / 2;
        return Math.sqrt(p * (p - getLado1()) * (p - getLado2()) * (p - lado3));
    }

}
