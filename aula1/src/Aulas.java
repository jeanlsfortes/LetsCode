import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Aulas {
    public static void main(String[] args) {
        String nome = new String("jean ");

        Scanner scan = new Scanner(System.in);

        String sobrenome = new String(scan.nextLine());

        System.out.println("Olá "+ nome + sobrenome);

        //aula 3
        float a, b;

        a = scan.nextFloat();
        b = scan.nextFloat();

        System.out.println("Soma = "+ (a + b));
        System.out.println("Subtracao = " + (a - b));
        System.out.println("multiplicacao = " + (a * b));
        //se int a,b;    era só converter  ((float) a / b)
        System.out.println("divisao = " + (a / b));

        //aula 4
        boolean fimDeSemana = true;
        boolean fazendoSol = false;

        String mensagem = fazendoSol && fimDeSemana ? "Está fazendo sol e é fim de semana" : "Não está fazendo sol ou não é fim de semana";

        System.out.println(mensagem);

        //aula 5
        if (fazendoSol && fimDeSemana){
            System.out.println("Vai ter praia");
        }else{
            System.out.println("Não vai ter praia");
        }

        int nota = 70;

        if(nota >= 90){
            System.out.println("O aluno tirou A");
        }else if(nota >=80 && nota < 90){
            System.out.println("O aluno tirou B");
        }else if(nota >= 70 && nota < 80){
            System.out.println("O aluno tirou C");
        }else{
            System.out.println("O aluno reprovou");
        }

        int numero = 2;

        switch (numero){
            case 1:
                System.out.println("numero = 1");
                break;
            case 2:
                System.out.println("numero = 2");
                break;
            case 3:
                System.out.println("numero = 3");
                break;
            case 4:
                System.out.println("numero = 4");
                break;
            case 5:
                System.out.println("numero = 5");
                break;
            case 6:
                System.out.println("numero = 6");
                break;
            case 7:
                System.out.println("numero = 7");
                break;
            case 8:
                System.out.println("numero = 8");
                break;
            case 9:
                System.out.println("numero = 9");
                break;
            case 10:
                System.out.println("numero = 10");
                break;
            default:
                System.out.println("o número não é um dos 10 primeiros números positivos");
        }

        //aula 6
        LocalDate date = LocalDate.now();

        Locale paisLingua = new Locale("pt","BR");

        LocalDateTime hora = LocalDateTime.now();

        System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.FULL, paisLingua) + hora);

        // obs println = pula uma linha   printf = não pula a linha automaticamente
        System.out.printf("Olha só, %s%n", mensagem);

        //aula 7

    }
}