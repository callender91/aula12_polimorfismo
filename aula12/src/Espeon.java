public class Espeon extends Eevee {

    // Construtor
    public Espeon(String tipo, Double peso, int altura, int hp) {
        super(tipo, peso, altura, hp);
    }

    @Override
    public String Ataque(){
        return ("Psíquico - Psychic");
    }

    @Override
    public String Especial(){
        return ("Reflexo - Reflect");
    }

    @Override
    public String Defesa(){
        return ("Sol Matinal - Morning Sun");
    }

}
