import java.util.Scanner;
public class Area {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o tamanho do quadrado: ");
            float tamanho = scanner.nextFloat();

            float resultado = tamanho * tamanho;

            System.out.println("A área do quadrado é de " + resultado + " M²");
        }
    }
}
