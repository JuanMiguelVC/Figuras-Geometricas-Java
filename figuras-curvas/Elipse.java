public class Elipse extends FiguraGeometricaCurva{
    private double semiejeMayor;
    private double semiejeMenor;

    public Elipse(double semiejeMayor, double semiejeMenor) {
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    public double getSemiejeMayor() {
        return semiejeMayor;
    }

    public double getSemiejeMenor() {
        return semiejeMenor;
    }

    public void setSemiejeMayor(double semiejeMayor) {
        this.semiejeMayor = semiejeMayor;
    }

    public void setSemiejeMenor(double semiejeMenor) {
        this.semiejeMenor = semiejeMenor;
    }

    @Override
    public double calcularArea() {
        return Math.PI * semiejeMayor * semiejeMenor;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * Math.sqrt((Math.pow(semiejeMayor, 2) + Math.pow(semiejeMenor, 2)) / 2);
    }
    
}