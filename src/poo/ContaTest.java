package poo;
public class ContaTest {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.cliente = "Mateus";
        conta.saldo = 10_000;
        conta.exibeSaldo();

        Conta destino = new Conta();
        destino.cliente = "Tairo";
        destino.saldo = 8_000.00;
        destino.exibeSaldo();

        conta.transferePara(destino, 1550);
        conta.exibeSaldo();
        destino.exibeSaldo();
    }

}
