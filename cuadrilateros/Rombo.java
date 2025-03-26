public abstract class Rombo extends FiguraGeometrica implements FiguraGeometricaDibujable{
    private double diagonalMayor;
    private double diagonalMenor;
    
    public Rombo(double diagonalMayor, double diagonalMenor){
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    
    public double getDiagonalMayor(){
        return diagonalMayor;
    }
    
    public void setDiagonalMayor(double diagonalMayor){
        this.diagonalMayor = diagonalMayor;
    }
    
    public double getDiagonalMenor(){
        return diagonalMenor;
    }
    
    public void setDiagonalMenor(double diagonalMenor){
        this.diagonalMenor = diagonalMenor;
    }
    
    public double area(){
        return (diagonalMayor * diagonalMenor) / 2;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un rombo de diagonales " + getDiagonalMayor() + " y " + getDiagonalMenor());
    }
}