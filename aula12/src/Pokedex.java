public class Pokedex {
    public static void main(String[] args) throws Exception {


    Eevee e = new Eevee("Eevee", "Original", 6.5, 30, 100);
    Jolteon j = new Jolteon("Jolteon", "Electric",8.0, 40, 120);
    Flareon f = new Flareon("Flareon","Fire", 6.5, 60, 150);
    Espeon es = new Espeon("Espeon", "Psychic", 6.8, 35, 110);
    Glaceon g = new Glaceon("Glaceon","Ice",6.5, 34,170);
    Leafeon l = new Leafeon("Leafeon", "Grass", 6.5, 40, 100);
    Sylveon s = new Sylveon("Silveon", "Fairy", 6.5, 30, 105);
    Umbreon u = new Umbreon("Umbreon","Dark", 5.5, 32, 175);
    Vaporeon v = new Vaporeon("Vaporeon","Water", 5.0, 42, 170);

    e.imprimir();
    j.imprimir();
    f.imprimir();
    es.imprimir();
    g.imprimir();
    l.imprimir();
    s.imprimir();
    u.imprimir();
    v.imprimir();
    
    e = g;
    e = es;
    e = j;
    e = l;
    e = f;
    e = v;
    e = u;
    e = s;
    e = l; 

    }
}
    
