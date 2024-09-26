import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para receber entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declarar as variáveis
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // Solicitar informações ao usuário
        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt(); // Lê um número inteiro
        
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.next(); // Lê uma string (agência)
        
        // Limpa o buffer do scanner
        scanner.nextLine(); 

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine(); // Lê uma linha de texto (nome do cliente)
        
        System.out.print("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble(); // Lê um número decimal

        // Exibir a mensagem final com as informações inseridas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numero + 
                           " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fecha o scanner
        scanner.close();
    }
}
