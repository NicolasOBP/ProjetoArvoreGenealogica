import java.util.Scanner;

public class Entradas {
    static private Scanner teclado = new Scanner(System.in);

    static String texto(String mensagem) {
        System.out.print(mensagem);
        String text = teclado.nextLine();

        if (text.trim().equals("")) {
            System.out.println("Tem que ser apenas uma letra\n");
            return texto(mensagem);
        } else {
            return text;
        }
    }

    static boolean boleano(String mensagem) {
        int num = Integer.parseInt(texto(mensagem));

        if (num == 0) {
            return false;
        } else if (num == 1) {
            return true;
        } else {
            System.out.println("Tem queser 1 ou 0");
            return boleano(mensagem);
        }
    }

    static int num(String mensagem) {
        try {
            int num = Integer.parseInt(texto(mensagem));
            return num;
        } catch (Exception e) {
            System.out.println("Número inválido\n");
            return num(mensagem);
        }
    }
}
