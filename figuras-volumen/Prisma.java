public class Prisma extends Figura3D{
    private double areaBase;
    private double altura;
    private double profundidad;
    
    public Prisma(double areaBase, double altura, double profundidad){
        this.areaBase = areaBase;
        this.altura = altura;
        this.profundidad = profundidad;
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

    public double getProfundidad(){
        return profundidad;
    }

    public void setProfundidad(double profundidad){
        this.profundidad = profundidad;
    }
    
    @Override
    public double calcularVolumen(){
        return areaBase * altura;
    }
    
    @Override
    public double calcularArea(){
        return 2 * areaBase + 2 * areaBase;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4 * Math.sqrt(areaBase);
    }
}