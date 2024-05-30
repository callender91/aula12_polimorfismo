public class Jolteon extends Eevee {

    // Construtor
    public Jolteon(String nome, String tipo, Double peso, int altura, int hp) {
        super(nome,tipo, peso, altura, hp);
    }
    
    @Override
    public int getAltura() {
        // TODO Auto-generated method stub
        return super.getAltura();
    }

    @Override
    public String toString() {
        return "Jolteon []";
    }

    @Override
    public int getHp() {
        // TODO Auto-generated method stub
        return super.getHp();
    }

    @Override
    public Double getPeso() {
        // TODO Auto-generated method stub
        return super.getPeso();
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return super.getTipo();
    }

    @Override
    public void setAltura(int altura) {
        // TODO Auto-generated method stub
        super.setAltura(altura);
    }

    @Override
    public void setHp(int hp) {
        // TODO Auto-generated method stub
        super.setHp(hp);
    }

    @Override
    public void setPeso(Double peso) {
        // TODO Auto-generated method stub
        super.setPeso(peso);
    }

    @Override
    public void setTipo(String tipo) {
        // TODO Auto-generated method stub
        super.setTipo(tipo);
    }

    @Override
    public String Ataque(){
        return ("Trovoada - Thunder-Shock");
    }

    @Override
    public String Especial(){
        return ("Raio - Thunderbolt");
    }

    @Override
    public String Defesa(){
        return ("Carga - Wild Charge");
    }

}
