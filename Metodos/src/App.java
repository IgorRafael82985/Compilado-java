import java.util.Scanner;
public class App {
    public static int somar (int a, int b) {
        return a + b;
    }

    public static int mutiplicar (int a, int b) {
        return a * b;
    }

    public static int subtrair (int a, int b) {
        return a - b;
    }

    public static int dividir (int a, int b) {
        return a / b;
    }
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--------------------------------------------");
            System.out.print("Digite o primeiro valor: ");
            int n1 = scanner.nextInt();

            System.out.println("--------------------------------------------");
            System.out.print("Digite o segundo valor: ");
            int n2 = scanner.nextInt();

            System.out.println("--------------------------------------------");
            System.out.println("Você digitou os números: " + n1 + " e " + n2 );
            System.out.println("--------------------------------------------");
            System.out.print("A somatoria é: ");
            System.out.println(somar(n1,n2));

            System.out.println("--------------------------------------------");

            System.out.print("A diferença é: ");
            System.out.println(subtrair(n1,n2));

            System.out.println("--------------------------------------------");

            System.out.print("A multiplicação é: ");
            System.out.println(mutiplicar(n1,n2));

            System.out.println("--------------------------------------------");

            System.out.print("A Divisão é: ");
            System.out.println(dividir(n1,n2));
            System.out.println("--------------------------------------------");

            scanner.close();
        }
    }
}