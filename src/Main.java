import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = sc.nextLine().toCharArray();
        //char prohibida = "e";

        for (int i = 0; i < letras.length; i++) {

            if (letras[i] == 'e'){
                letras[i] = 'a';
            }
        }

        String frase = new String(letras);
        String palabras[] = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        System.out.println("fin");
    }
}