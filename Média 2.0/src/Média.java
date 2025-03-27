import java.util.Scanner;
public class Média {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite o Valor 1: ");
            double n1 = scanner.nextDouble();
            
            System.out.print("Digite o Valor 2: ");
            double n2 = scanner.nextDouble();

            System.out.print("Digite o Valor 3: ");
            double n3 = scanner.nextDouble();

            System.out.print("Digite o Valor 4: ");
            double n4 = scanner.nextDouble();
            
            double resultado = (n1 + n2 + n3 + n4) / 4;
            
            if (resultado >= 5) {
                System.out.println("Parabéns," + nome + "você está aprovado, sua média é: " + resultado);
            } else {
                System.out.println(nome + " Você foi reprovado, sua média é: " + resultado);
            }
        }
    }
}