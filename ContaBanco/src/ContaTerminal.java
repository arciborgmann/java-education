import java.util.Scanner;
import java.lang.StringBuilder;
import java.text.DecimalFormat;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e Importar a classe Scanner
        // TODO: Exibir as mensagens para o usuário
        // TODO: Obter os valores digitados no terminal
        // TODO: Exibir mensagem criada

        try {
            Scanner sc = new Scanner(System.in);
        
            int numeroConta;
            String agencia;
            String nomeCliente;
            double saldo;

            System.out.println("Por gentileza, nos informe o seu nome:");
            nomeCliente = sc.nextLine();

            System.out.println("Agora digite o número da sua conta:");
            numeroConta = sc.nextInt();

            System.out.println("Agora nos informe o número da sua agência com 4 dígitos");
            agencia = sc.next();
            StringBuilder sb = new StringBuilder(agencia);
            sb.insert(agencia.length() - 1, '-');
            agencia = sb.toString();
            
            System.out.println("Nos informe o seu saldo:");
            saldo = sc.nextDouble();
            DecimalFormat df = new DecimalFormat("#.##");

            sc.close();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ". Sua conta é a " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque. Tenha um ótimo dia!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
