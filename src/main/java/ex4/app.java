package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<String> termos = new ArrayList<>();
        List<String> result = new ArrayList<>();

        System.out.print("Insira o texto: ");
        String texto = input.nextLine();

        System.out.print("Quantos termos deseja ver a recorrencia: ");
        int qtd = input.nextInt();
        System.out.println("Insira os termos que deseja ver a recorrencia: ");
        for(int i=0; i<qtd; i++){
            input.nextLine();
            String t = input.nextLine();//.charAt();
            termos.add(t);
        }
        System.out.print("Insira quais primeiros termos deseja ver a recorrencia: ");
        int K = input.nextInt();

        int count;
        for (int i=0; i<K; i++){
            List<String> finalResult = result;
            result = termos.stream().filter(x -> x.charAt(finalResult.indexOf(termos.get(i))) > termos.get(i));
            result(i) = count++;
        }

        for (String x: result) {
            System.out.println(x);
        }

        input.close();
    }
}
