public class Piramide extends Figura3D{
    private double areaBase;
    private double altura;
    
    public Piramide(double areaBase, double altura){
        this.areaBase = areaBase;
        this.altura = altura;
    }
    
    public double getAreaBase(){
        return areaBase;
    }
    
    public void setAreaBase(double areaBase){
        this.areaBase = areaBase;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    @Override
    public double calcularVolumen(){
        return (areaBase * altura) / 3;
    }
    
    @Override
    public double calcularArea(){
        return areaBase + 2 * Math.sqrt((areaBase / 4) + Math.pow(altura, 2));
    }
    
    @Override
    public double calcularPerimetro(){
        return 4 * Math.sqrt(areaBase);
    }
}