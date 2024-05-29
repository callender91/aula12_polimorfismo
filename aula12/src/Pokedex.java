public class Pokedex {
    public static void main(String[] args) throws Exception {
    Eevee e = new Eevee("Original",6.5,30,100);
    Jolteon j = new Jolteon("Elétrico",10.0,40,120);


    System.out.println("Ataque" + e.Ataque());
    System.out.println("Especial" + e.Especial());
    System.out.println("Defesa" + e.Defesa());
    System.out.println("---------------------------");
    
    //Aponta Pokemon
    e = j;

    System.out.println("Ataque: " + e.Ataque());
    System.out.println("Especial: " + e.Especial());
    System.out.println("Defesa: " + e.Defesa());
    }
}

