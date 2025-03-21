public abstract class Trapecio extends FiguraGeometrica implements FiguraGeometricaDibujable{
    private double baseMayor;
    private double baseMenor;
    private double altura;
    
    public Trapecio(double baseMayor, double baseMenor, double altura){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    
    public double getBaseMayor(){
        return baseMayor;
    }
    
    public void setBaseMayor(double baseMayor){
        this.baseMayor = baseMayor;
    }
    
    public double getBaseMenor(){
        return baseMenor;
    }
    
    public void setBaseMenor(double baseMenor){
        this.baseMenor = baseMenor;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double area(){
        return ((baseMayor + baseMenor) * altura) / 2;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un trapecio de bases " + getBaseMayor() + " y " + getBaseMenor() + " y altura " + getAltura());
    }
}