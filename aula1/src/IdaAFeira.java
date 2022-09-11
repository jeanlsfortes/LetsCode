import java.util.Scanner;

//ex uri https://www.beecrowd.com.br/judge/pt/problems/view/1281

//.contains() = verificar se tem o elemnto que vc definir

public class IdaAFeira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i <N; i++){
            String entrada;
            int M = scan.nextInt();
            String[] productsName = new String[M];
            float[] products = new float[M];
            //clear scan
            scan.nextLine();
            for (int j=0; j< M;j++){
                entrada = scan.nextLine();
                productsName[j] = entrada.substring(0,entrada.indexOf(" "));
                products[j] = Float.parseFloat(entrada.substring((entrada.indexOf(" ") + 1),entrada.length()));
                System.out.println(productsName[j] + " " + products[j]);
            }

            int P = scan.nextInt();
            String[] productsAmount = new String[P];
            int[] productsNumber = new int[P];
            scan.nextLine();
            for (int j=0; j< P;j++){
                entrada = scan.nextLine();
                productsAmount[j] = entrada.substring(0,entrada.indexOf(" "));
                productsNumber[j] = Integer.parseInt(entrada.substring((entrada.indexOf(" ") + 1),entrada.length()));
                System.out.println(productsAmount[j] + " " + productsNumber[j]);
            }


        }

    }
}
