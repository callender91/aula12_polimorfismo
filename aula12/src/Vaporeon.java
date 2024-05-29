public class Vaporeon  extends Eevee {

    // Construtor
    public Vaporeon(String tipo, Double peso, int altura, int hp) {
        super(tipo, peso, altura, hp);
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
