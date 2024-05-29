public class Glaceon extends Eevee {

    // Construtor
    public Glaceon(String tipo, Double peso, int altura, int hp) {
        super(tipo, peso, altura, hp);
    }
    
    @Override
    public String Ataque(){
        return ("Fragmento de gelo - Ice Shard");
    }

    @Override
    public String Defesa(){
        return ("Granizo - Hail");
    }

    @Override
    public String Defesa2(){
        return ("Proteger - Protect");
    }

}
