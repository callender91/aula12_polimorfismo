public class Leafeon  extends Eevee {

    // Construtor
    public Leafeon(String tipo, Double peso, int altura, int hp) {
        super(tipo, peso, altura, hp);
    }
    
    @Override
    public String Ataque(){
        return ("Folha Afiada - Leaf Blade");
    }

    @Override
    public String Especial(){
        return ("Espinho - Leaf Shield");
    }

    @Override
    public String Defesa(){
        return ("Síntese - Synthesis");
    }

}
