public abstract class Trapecio extends FiguraGeometricaCuadrilatero {

    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // El perímetro de un trapecio se calcula como la suma de las longitudes de sus lados
        // En este caso, asumimos que los lados no paralelos son iguales (isósceles)
        double ladoNoParalelo = Math.sqrt(Math.pow((baseMayor - baseMenor) / 2, 2) + Math.pow(altura, 2));
        return baseMayor + baseMenor + 2 * ladoNoParalelo;
    }
}
