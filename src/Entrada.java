import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("qual seu nome?");
        String nome = in.nextLine();
        System.out.println("Bem vindo " + nome);
    }
}
