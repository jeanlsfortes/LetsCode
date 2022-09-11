import java.util.ArrayList;
import java.util.Scanner;

//ex uri https://www.beecrowd.com.br/judge/pt/problems/view/1110
public class JogandoCartasFora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;

        while ((input = scan.nextInt()) > 0){
            if(input > 50){
                break;
            }

            ArrayList<Integer> row = new ArrayList<Integer>();
            ArrayList<Integer> rowDiscart = new ArrayList<Integer>();

            for (int i = 0; i < input; i++){
                row.add(input-(i));
            }

            for (int i = input-1; i > 0; i--){
                if(row.size() > 1){

                    rowDiscart.add(row.get(i));
                    row.remove(i);

                    row.add(0,row.get(i-1));
                    row.remove(i);
                }
            }

            System.out.print("Discarded cards: "+ rowDiscart.toString().replace("]","\n").replace("[",""));
            System.out.println("Remaining card: "+row.get(0));
        }
    }
}
