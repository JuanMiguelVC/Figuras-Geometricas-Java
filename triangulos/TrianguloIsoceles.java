public class TrianguloIsoceles extends FGTriangulo {

    public TrianguloIsoceles(double base, double altura) {
        super(base, altura);
    }

    public double area() {
        return (getBase() * getAltura()) / 2;
    }
}
