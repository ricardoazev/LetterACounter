import java.util.Scanner;

public class LetterACounter {

    public static void main(String[] args) {
        // Criação de um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que informe uma string
        System.out.print("Informe uma string: ");
        String inputString = scanner.nextLine();

        // Contando a ocorrência da letra 'a'
        int count = countLetterA(inputString);

        // Exibindo o resultado
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + count + " vezes na string informada.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não foi encontrada na string informada.");
        }

        // Fechando o scanner
        scanner.close();
    }

    public static int countLetterA(String input) {
        int count = 0;
        // Iterando por cada caractere da string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Verificando se o caractere é 'a' ou 'A'
            if (ch == 'a' || ch == 'A') {
                count++;
            }
        }
        return count;
    }
}
