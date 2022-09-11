import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//ex uri https://www.beecrowd.com.br/judge/pt/problems/view/1068
public class BalancoDeParenteses {

    private static boolean checkParameters(String input){
        int parameters = 0;
        for (int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                parameters++;
            } else if (input.charAt(i) == ')') {
                parameters--;
            }
            if(parameters < 0){
                return false;
            }
        }
        if(parameters == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        //ler a entrada
        //Scanner scan = new Scanner(System.in);  //outro metodo alternativo
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        //enquanto a entrada foir diferente de null, ou seja não for EOF
        while ((input = br.readLine()) != null) {
            //chama a funcao para verificar os paramtros
            if(checkParameters(input)){
                System.out.println("correct");
            }else{
                System.out.println("incorrect");
            }
        }
    }
}
