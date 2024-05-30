public class Vaporeon  extends Eevee {

    // Construtor
    public Vaporeon(String nome, String tipo, Double peso, int altura, int hp) {
        super(nome, tipo, peso, altura, hp);
    }
    
    @Override
    public String Ataque(){
        return ("Hidrobomba- Hydro Pump");
    }

    @Override
    public String Especial(){
        return ("Redemoinho - Aqua Ring");
    }

    @Override
    public String Defesa(){
        return ("Hidrocanhão - Hydro Cannon");
    }

}
