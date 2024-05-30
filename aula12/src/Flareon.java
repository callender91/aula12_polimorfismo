public class Flareon  extends Eevee {

    // Construtor
    public Flareon(String nome, String tipo, Double peso, int altura, int hp) {
        super(nome, tipo, peso, altura, hp);
    }
    
    @Override
    public String Ataque(){
        return ("Lança-chamas - Flamethrower");
    }

    @Override
    public String Especial(){
        return ("Giro de fogo - Fire Spin");
    }

    @Override
    public String Defesa(){
        return ("Explosão de Fogo - Fire Blast");
    }

}
