import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir a mensagem para o usuario
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a menssagem conta criada

        int numero = 5482;
        String agencia = "000-2";
        String nome;
        double saldo = 254.55;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira seu nome:");
        nome = scanner.next();

        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
