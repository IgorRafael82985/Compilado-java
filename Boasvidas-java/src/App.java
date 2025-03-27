import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o ano atual: ");
            int ano_atual = scanner.nextInt();

            System.out.println("Bem vindo ao ano de " + ano_atual);
        }
    }
}
