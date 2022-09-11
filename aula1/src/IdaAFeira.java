import java.util.Scanner;

//ex uri https://www.beecrowd.com.br/judge/pt/problems/view/1281
public class IdaAFeira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i <N; i++){
            int M = scan.nextInt();
            String[] productsName = new String[M];
            float[] products = new float[M];
            scan.nextLine();
            for (int j=0; j< M;j++){
                productsName[i] = scan.nextLine();
                //products[i] = Integer.parseInt(productsName[i].substring(productsName[i].indexOf(" "),productsName[i].length()));
                System.out.println(productsName[i].substring((productsName[i].indexOf(" ") + 1),productsName[i].length()));
            }
        }

    }
}
