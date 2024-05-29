public class Umbreon  extends Eevee {

    // Construtor
    public Umbreon(String tipo, Double peso, int altura, int hp) {
        super(tipo, peso, altura, hp);
    }

    @Override
    public String Ataque(){
        return ("Ataque Sombrio - Feint attack");
    }

    @Override
    public String Especial(){
        return ("Luz lunar - Moonlight");
    }

    @Override
    public String Defesa(){
        return ("Pulso Sombrio - Dark Pulse");
    }

}
