public class Eevee {
    String tipo;
    Double peso;
    int altura;
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    int hp;

    // Construtor
    public Eevee(String tipo, Double peso, int altura, int hp) {
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.hp = hp;
    }

    public String Ataque(){
        return "Ataque rápido";
    }

    public String Defesa(){
        return "Desvio";
    }

    public String Especial(){
        return "Tri-ataque";
    }

    public String Defesa2(){
        return "Super defesa";
    }
}
