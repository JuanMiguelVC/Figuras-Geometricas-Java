public class Esfera extends Figura3D{
    private double radio;
    
    public Esfera(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    @Override
    public double calcularVolumen(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
    
    @Override
    public double calcularArea(){
        return 4 * Math.PI * Math.pow(radio, 2);
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}