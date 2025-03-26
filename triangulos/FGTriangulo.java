public class FGTriangulo extends FiguraGeometrica implements FiguraGeometricaDibujable {
    private double base;
    private double altura;

    public FGTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo de base " + base + " y altura " + altura);
    }
}