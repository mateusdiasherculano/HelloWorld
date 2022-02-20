import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite sua idade: ");
        int idade = in.nextInt();

        if ((idade>=18) && (idade<65)){
            System.out.println("Maior de idade!");
        }else if(idade<18){
            System.out.println("Menor de idade!");
        }else if (idade>=65){
            System.out.println("Pessoa idosa!");
        }
    }
}

/*
Faça um algoritmo que dada a idade de uma pessoa,
determine sua classificação segundo a seguinte tabela:
 Maior de idade (idade maior ou igual a 18 anos);
 Menor de idade (idade inferior a 18 anos);
 Pessoa idosa (idade superior ou igual a 65 anos);

 */