package dominio;

public class IMC {
    
    private double peso;
    private double altura;

    public double CalcularIMC(){
        return peso / (altura * altura);
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
