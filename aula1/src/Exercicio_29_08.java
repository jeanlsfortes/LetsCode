import java.util.Scanner;

public class Exercicio_29_08 {

    public static void main(String[] args) {
        //Escreva um algoritmo que recebe um valor e imprima a sua tabuada
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número : ");
        int numero = scan.nextInt();

        for (int i = 0; i <= 10;i++){
            System.out.println(numero + " X "+i +" = "+ (numero * i) );
        }

    }
}
