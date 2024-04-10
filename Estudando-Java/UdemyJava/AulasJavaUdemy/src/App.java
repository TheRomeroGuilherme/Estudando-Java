import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!\n\n\n");

        /*
         * Expressão aritímetica
         * soma +
         * subtração -
         * multiplicação *
         * divisão /
         * Mod ou resto %
         */

        /*
         * Variáveis
         * byte------------ -128 a 127
         * short----------- -32768 a 32767
         * int------------- -2147483648 a 2147483647
         * long------------ -9223372036754770000 a 9223372036754770000
         * float----------- -1,4024^-37 a 3,4028^+38
         * double---------- -4,94^-307 a 1,79^+308
         * char------------ '\u0000' a '\uFFFF'
         * boolean--------- {false, true}
         */
        /*
         * int y = 32;
         * double x = 10.35784;
         * System.out.println(y);
         * System.out.println(x);
         * System.out.printf("%.2f \n", x); // Para mostrar formatado com 2 ou mais
         * casas decimais
         * System.out.printf("%.4f \n", x);
         * System.out.printf("resultado: " + x + "Metros\n");
         * System.out.printf("resultado: %.2f Metros\n", x);
         */
        /*
         * String nome = "Maria";
         * int idade = 31;
         * double renda = 4000.0;
         * System.out.println("-----------------------------\n\n");
         * System.out.printf("%s tem %d anos e ganha %.2f reais", nome, idade, renda);
         */

        /*
         * Atribuição Casting
         * 
         * int X, Y;
         * double b, B, h, area, resultado;
         * b = 6.0;
         * B = 8.0;
         * h = 5.0;
         * 
         * X = 5;
         * Y = 2;
         * 
         * resultado = (double) X / Y;
         * area = (b + B) / 2.0 * h;
         * 
         * System.out.println(area);
         * System.out.println(resultado);
         */

        /*
         * Entrada de Dados
         * 
         * Scanner sc = new Scanner(System.in);
         * String LerTeclado;
         * System.out.println("Digite seu primeiro nome...");
         * LerTeclado = sc.next();
         * System.out.println("Seu nome: ' " + LerTeclado + " '");
         * int idade;
         * System.out.println("Quantos anos tem...");
         * idade = sc.nextInt();
         * System.out.println("Sua idade: ' " + idade + " '");
         * 
         * sc.close();
         */
        /*
         * Scanner, como ler até a quebra de linha
         * 
         * Scanner sc = new Scanner(System.in);
         * 
         * int x;
         * String s1, s2, s3;
         * System.out.println("Digite numero e seu nome");
         * x = sc.nextInt();
         * sc.nextLine();
         * s1 = sc.nextLine();
         * s2 = sc.nextLine();
         * s3 = sc.nextLine();
         * 
         * System.out.println("Dados digitados: ");
         * System.out.println(x);
         * System.out.println(s1);
         * System.out.println(s2);
         * System.out.println(s3);
         * sc.close();
         */

        System.out.println("\n\n\nFim do programa");
    }
}
