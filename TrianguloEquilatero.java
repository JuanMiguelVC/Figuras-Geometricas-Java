public class TrianguloEquilatero extends FGTriangulo implements FiguraGeometricaDibujable {

    public TrianguloEquilatero(double lado) {
        super(lado, lado * Math.sqrt(3) / 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo equilátero de lado " + getBase());
    }

}