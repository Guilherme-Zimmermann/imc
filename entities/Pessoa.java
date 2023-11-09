public class Pessoa {

    private Double peso;
    private Double altura;

    public Pessoa(){
    }

    public Pessoa(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public Double calcularIMC() {
        Double imc = getPeso() / (getAltura() * getAltura());
        return imc;
    }
    
}