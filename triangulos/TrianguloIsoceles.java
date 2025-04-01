public abstract class TrianguloIsoceles extends FiguraGeometricaTriangular {

    private double base;
    private double lado1;
    private double lado2;

    public TrianguloIsoceles(double base, double lado1, double lado2) {
        this.base = base; // Store the base in this class
        this.lado1 = lado1; // Store the first side in this class
        this.lado2 = lado2; // Store the second side in this class
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
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

    @Override
    public double calcularArea() {
        double altura = Math.sqrt(Math.pow(lado1, 2) - Math.pow(base / 2, 2));
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }
}
