public class Sylveon  extends Eevee {

    // Construtor
    public Sylveon(String nome, String tipo, Double peso, int altura, int hp) {
        super(nome, tipo, peso, altura, hp);
    }
    
    @Override
    public String Ataque(){
        return ("Vento de Fada - Fairy Wind");
    }

    @Override
    public String Especial(){
        return ("Terreno Nebuloso - Misty Terrain");
    }

    @Override
    public String Defesa(){
        return ("Explosão Lunar - Moonblast ");
    }

}
