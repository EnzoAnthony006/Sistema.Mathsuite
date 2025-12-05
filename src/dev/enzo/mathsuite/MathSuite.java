package dev.enzo.mathsuite;
import java.util.Scanner;
public class MathSuite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=================================================");
            System.out.println("           SISTEMA MATH SUITE                     ");
            System.out.println("=================================================");
            System.out.println("  ");

            System.out.println(" Quais Das Opções Gostaria De Realizar No MATHSUITE");
            System.out.println(" Escolha Uma das Opções:");
            System.out.println("  ");

            System.out.println(" 1- Raiz Quadrada (sqrt) ");
            System.out.println(" 2- Arredondamento ( round, ceil, floor) ");
            System.out.println(" 3- Valor Absoluto (abs) ");
            System.out.println(" 4- Maximo & mínimo (max/min ) ");
            System.out.println(" 5- Potência (pow) ");
            System.out.println(" 6- Número Aleatório (0 a 1 e 0 a 10) ( random) ");
            System.out.println(" 7- Trigonometria (sin,cos,tan) ");
            System.out.println(" 8- Converção (toDegress / toRadians) ");
            System.out.println(" 0- Sair " );
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite Um Número Para Raiz Quadrada (sqrt): ");
                    double n1 = sc.nextDouble();
                    System.out.println("√" + n1 + " = " + Math.sqrt(n1));
                    break;

                case 2:
                    System.out.println("Digite Um Número Para Arredondar");
                    double n2 = sc.nextDouble();
                    System.out.println("round = " + Math.round(n2));
                    System.out.println("ceil = " + Math.ceil(n2));
                    System.out.println("floor = " + Math.floor(n2));
                    break;

                case 3:
                    System.out.println("Número Para abs: ");
                    double n3 = sc.nextDouble();
                    System.out.println("|" + n3 + "| = " + Math.abs(n3));
                    break;

                case 4:
                    System.out.println("Primeiro Número: ");
                    double a = sc.nextDouble();
                    System.out.println("Segundo Número: ");
                    double b = sc.nextDouble();
                    System.out.println("max = " + Math.max(a, b));
                    System.out.println("min = " + Math.min(a, b));
                    break;

                case 5:
                    System.out.println("Base: ");
                    double base = sc.nextDouble();
                    System.out.println("Exponente: ");
                    double exp = sc.nextDouble();
                    System.out.println("Resultado = " + Math.pow(base, exp));
                    break;

                case 6:
                    System.out.println("Número aleatório entre 0 e 1: " + Math.random());
                    System.out.println("Número aleatório entre 0 e 10: " + (int) (Math.random() * 10));
                    break;

                case 7:
                    System.out.println("Ângulo em graus: ");
                    double graus = sc.nextDouble();
                    double rad = Math.toRadians(graus);
                    System.out.println("cos = " + Math.cos(rad));
                    System.out.println("sin = " + Math.sin(rad));
                    System.out.println("tan = " + Math.tan(rad));
                    break;

                case 8:
                    System.out.println("Digite um valor: ");
                    double valor = sc.nextDouble();
                    System.out.println("toDegress = " + Math.toDegrees(valor));
                    System.out.println("toRadians = " + Math.toRadians(valor));
                    break;

                case 0:
                    System.out.println("Saindo Do MathSuite.......");
                    break;

                default:
                    System.out.println(" Opção inválida!/Essa Opção Não Existe!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
