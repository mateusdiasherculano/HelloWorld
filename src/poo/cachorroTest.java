package poo;

public class cachorroTest {
    public static void main(String[] args) {

        Cachorro pitbull = new Cachorro();
        pitbull.raça = "Pitbull";
        pitbull.tamanho = 40;
        pitbull.latir();

        Cachorro viraLata = new Cachorro();
        viraLata.raça = "Vira-lata";
        viraLata.tamanho = 30;
        viraLata.latir();
    }
}
