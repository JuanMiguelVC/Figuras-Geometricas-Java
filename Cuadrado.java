public class Cuadrado extends FiguraGeometrica implements FiguraGeometricaDibujable{
        
        private double lado;
    
        public Cuadrado(double lado) {
            this.lado = lado;
        }
    
        public double getLado() {
            return lado;
        }
    
        public void setLado(double lado) {
            this.lado = lado;
        }
    
        @Override
        public double calcularArea() {
            return lado * lado;
        }
    
        @Override
        public double calcularPerimetro() {
            return 4 * lado;
        }
    
        @Override
        public void dibujar() {
            System.out.println("Dibujando un cuadrado de lado " + lado);
        }
}