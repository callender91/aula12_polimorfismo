public class Floreon  extends Eevee {

    // Construtor
    public Floreon(String tipo, Double peso, int altura, int hp) {
        super(tipo, peso, altura, hp);
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
