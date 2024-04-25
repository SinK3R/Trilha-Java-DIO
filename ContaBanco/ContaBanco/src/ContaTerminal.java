import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o núemro da sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor do seu saldo");
        double saldo = scanner.nextDouble(); 

        System.out.println("Seja bem vindo " + nomeCliente + "!" + " O número da sua conta é: " + agencia + ", com um saldo de: " + saldo + " valor em reais");
    }
}
