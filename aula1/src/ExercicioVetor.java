import java.util.Arrays;

public class ExercicioVetor {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        String[] letras = {"A", "B", "C", "D", "E"};
        for(int i = 0 ; i <10;i++){
            numeros[i] = i;
        }
        System.out.println(Arrays.toString(numeros));

        for (int j = 0; j < letras.length; j++){
            System.out.println(letras[j]);
        }
    }
}
