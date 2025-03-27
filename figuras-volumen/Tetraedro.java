public class Tetraedro extends Figura3D{
    private double arista;
    
    public Tetraedro(double arista){
        this.arista = arista;
    }
    
    public double getArista(){
        return arista;
    }
    
    public void setArista(double arista){
        this.arista = arista;
    }
    
    @Override
    public double calcularVolumen(){
        return Math.pow(arista, 3) / (6 * Math.sqrt(2));
    }
    
    @Override
    public double calcularArea(){
        return Math.pow(arista, 2) * Math.sqrt(3);
    }
    
    @Override
    public double calcularPerimetro(){
        return 6 * arista;
    }
}