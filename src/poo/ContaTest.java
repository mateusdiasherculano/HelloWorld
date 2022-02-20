package poo;
public class ContaTest {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.cliente = "Mateus";
        conta.saldo = 10_000;
        conta.exibeSaldo();
    }

}
