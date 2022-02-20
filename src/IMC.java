import java.util.Scanner;

/*
Calcular o  IMC
IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 */
public class IMC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite seu peso: ");
        double pesoEmQuilograma = in.nextDouble();
        System.out.println("Por favor, digite sua altura: ");
        double alturaEmMetros = in.nextDouble();
        double imc = pesoEmQuilograma / (alturaEmMetros * alturaEmMetros);

        if ((imc>=20)&& (imc<=25)){
            System.out.println("Peso ideal");
        }else if ((imc>=25) && (imc<=30)){
            System.out.println("Sobrepeso");
        }else if ((imc>=30) && (imc<=35)){
            System.out.println("Obesidade Moderada");
        }else if ((imc>=35) && (imc<=40)){
            System.out.println("Obesidade Severa");
        }else if ((imc>=40) && (imc<=50)){
            System.out.println("Obesidade Mórbida");
        }else if (imc>50){
            System.out.println("Super-Obesidade");
        }

    }
}
