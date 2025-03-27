public class Cono extends Figura3D{
    private double radio;
    private double altura;
    
    public Cono(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    @Override
    public double calcularVolumen(){
        return Math.PI * Math.pow(radio, 2) * altura / 3;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * radio * (radio + Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2)));
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}