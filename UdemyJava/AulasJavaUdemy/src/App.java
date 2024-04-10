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

        /*
         * Funções matemáticas
         * Exemplo | Significado
         * Math.sqrt(x); | Variável A recebe a raiz quadrada de x
         * Math.pow(x, y); | Variável A recebe o resultado de x elevado a y
         * Math.abs(x); | Variável A recebe o valor absoluto de x
         * 
         * double x = 3.0;
         * double y = 4.0;
         * double z = -5.0;
         * double A, B, C;
         * 
         * A = Math.sqrt(x);
         * B = Math.sqrt(y);
         * C = Math.sqrt(25.0);
         * System.out.println("Raiz quadrada de " + x + " = " + A);
         * System.out.println("Raiz quadrada de " + y + " = " + B);
         * System.out.println("Raiz quadrada de 25 = " + C);
         * 
         * A = Math.pow(x, y);
         * B = Math.pow(x, 2.0);
         * C = Math.pow(5.0, 2.0);
         * System.out.printf("%.1f elevado a %.1f = %.1f \n", x, y, A);
         * System.out.printf("%.1f elevado ao quadrado = %.1f\n", x, B);
         * System.out.printf("5 elevado ao quadrdo = %.1f\n", C);
         * 
         * A = Math.abs(y);
         * B = Math.abs(z);
         * System.out.printf("Valor absoluto de %.1f = %.1f\n", y, A);
         * System.out.printf("Valor absoluto de %.1f = %.1f\n\n", z, B);
         * 
         * Scanner mat = new Scanner(System.in);
         * Double delta, b, a, c, X1, X2;
         * 
         * a = mat.nextDouble();
         * mat.hasNextLine();
         * b = mat.nextDouble();
         * mat.nextLine();
         * c = mat.nextDouble();
         * mat.nextLine();
         * delta = Math.pow(b, 2.0) - 4 * a * c;
         * 
         * X1 = (-b + Math.sqrt(delta)) / (2.0 * a);
         * X2 = (-b - Math.sqrt(delta)) / (2.0 * a);
         * System.out.printf("Valor da Expressão de segundo grau x1 = %.1f\n ", X1);
         * System.out.printf("Valor da Expressão de segundo grau x2 = %.1f\n\n ", X2);
         */

        /*
         * Condições if else e switch case
         * 
         * Scanner sc = new Scanner(System.in);
         * int minutos = sc.nextInt();
         * 
         * double conta = 50.0;
         * 
         * if (minutos < 0) {
         * System.out.println("Minutos invalidos!");
         * } else if (minutos > 100) {
         * conta += (minutos - 100) * 2.0;
         * }
         * 
         * System.out.printf("Valor da conta = R$ %.2f \n", conta);
         * 
         * 
         * ---------------------------------------------------------------------
         * Condição ternária
         * double preco = 34.5;
         * double desconto;
         * if(preco <20.0){
         * desconto = preco * 0.1;
         * }else{
         * desconto = preco * 0.05;
         * }
         * 
         * ao invés de fazer if else
         * faça
         * double desconto = (preco <20.0) ? preco *0.1 : preco * 0.05;
         * Ex: (CONDIÇÃO) ? VALOR_SE_VERDADEIRO : VALOR_SE_FALSO
         * System.out.println(desconto);
         * ---------------------------------------------------------------------
         * 
         * 
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Qual dia da semana?");
         * int semana = sc.nextInt();
         * sc.nextLine();
         * 
         * switch (semana) {
         * case 1:
         * System.out.println("Domingo");
         * break;
         * case 2:
         * System.out.println("Segunda-feira");
         * break;
         * case 3:
         * System.out.println("Terça-feira");
         * break;
         * case 4:
         * System.out.println("Quarta-feira");
         * break;
         * case 5:
         * System.out.println("Quinta-feira");
         * break;
         * case 6:
         * System.out.println("Sexta-feira");
         * break;
         * case 7:
         * System.out.println("Sabado");
         * break;
         * default:
         * System.out.println("Dia da semana não existente!");
         * break;
         * }
         */

        /*
         * Laços de repetições
         * 
         * whille
         * Scanner sc = new Scanner(System.in);
         * int x = sc.nextInt();
         * int soma = 0;
         * while (x != 0) {
         * x = sc.nextInt();
         * soma += x;
         * }
         * System.out.println("Total: " + soma);
         * -------------------------------------------
         * for
         * Scanner sc = new Scanner(System.in);
         * int x = sc.nextInt();
         * int soma = 0;
         * for (int i = 0; i < x; i++) {
         * x = sc.nextInt();
         * soma += x;
         * }
         * System.out.println("Total: " + soma);
         * 
         * sc.close();
         */

        /*
         * Checklist
         *
         * Formatar: toLowerCase(), toUpperCase(), trim() -> trim para remover espaços
         * Recortar: substring(inicio),substring(inicio,fim)
         * Substituir: Replace(char,char), replace(string,string)
         * Buscar: IndexOf, LastIndexof
         * Splitar: str.Split("")
         * 
         * segue os exemplos
         * 
         * Scanner sc = new Scanner(System.in);
         * sc.close();
         * String Original = "abcde FGHIJ ABC abc DEFG   ";
         * 
         * String S01 = Original.toLowerCase();
         * String s02 = Original.toUpperCase();
         * String s03 = Original.trim();
         * String s04 = Original.substring(2);
         * String s05 = Original.substring(2, 9);
         * // char ou caractere únicos use aspas simples
         * String s06 = Original.replace('a', 'x');
         * // string use aspas duplas
         * String s07 = Original.replace("abc", "xy");
         * int n01 = Original.indexOf("bc");
         * int n02 = Original.lastIndexOf("bc");
         * 
         * System.out.println("-" + Original + "-");
         * System.out.println("-" + S01 + "-");
         * System.out.println("-" + s02 + "-");
         * System.out.println("-" + s03 + "-");
         * System.out.println("-" + s04 + "-");
         * System.out.println("-" + s05 + "-");
         * System.out.println("-" + s06 + "-");
         * System.out.println("-" + s07 + "-");
         * System.out.println("-" + n01 + "-");
         * System.out.println("-" + n02 + "-");
         * 
         * String s = "potato apple lemon orange";
         * String[] vet = s.split(" ");
         * System.out.println(vet[0]);
         * System.out.println(vet[1]);
         * System.out.println(vet[2]);
         * System.out.println(vet[3]);
         */

        System.out.println("\n\n\nFim po programa");
    }
}
