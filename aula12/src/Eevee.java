public class Eevee {
    String nome;
    String tipo;
    Double peso;
    int altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
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

    public Eevee(String nome, String tipo, Double peso, int altura, int hp) {
        this.nome = nome;
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

    public void imprimir() {
        System.out.println("Detalhes do Pokémon: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("HP: " + hp);
        System.out.println("Ataque: " + Ataque());
        System.out.println("Especial: " + Especial());
        System.out.println("Defesa: " + Defesa());
        System.out.println("---------------------------");
    }
}
