package minhacalculadora;

public class MatematicaSimples {
    private Double n1;
    private Double n2;    
        
    public Double Somar(){
        return getN1()+getN2();
    }   
    public Double Subtrair(){
        return getN1()-getN2();
    }
    public Double Multiplicar(){
        return getN1()*getN2();
    }
    public Double Dividir(){
        return getN1()/getN2();
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    } 
}