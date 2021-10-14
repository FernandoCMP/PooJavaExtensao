import java.util.Scanner;
public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");
        System.out.println("Informe a operação:");
        int operacao = tc.nextInt();
        float v1 = 5, v2 = 2;
        System.out.println();
        switch (operacao) {
            case 1:
                System.out.printf("Soma = %.2f", v1 + v2);
                break;
            case 2:
                System.out.printf("Subtração = %.2f", v1 - v2);
                break;
            case 3:
                System.out.printf("Multiplicação = %.2f", v1 * v2);
                break;
            case 4:
                System.out.printf("Divisão = %.2f", v1 / v2);
                break;
            default:
                System.out.printf("Operação inválida.");
        }
    }
}
