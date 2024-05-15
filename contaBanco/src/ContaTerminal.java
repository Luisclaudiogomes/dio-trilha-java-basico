import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args){   
          Scanner numero = new Scanner(System.in);  // Create a Scanner object

            System.out.println("Por favor,digite o número da Agencia ");
            String agencia1= numero.nextLine();  // Read user inputluis
        
            System.out.println("Por favor,digite o nome do Cliente");
            String nome1= numero.nextLine();  // Read user inputluis
            
            System.out.println("Por favor,digite o número da Conta");
            int numero1 = numero.nextInt();  // Read user inputluis

            System.out.println("Por favor,digite o saldo");
            Double saldo= numero.nextDouble();  // Read user inputluis

            System.out.println("Olá " + nome1 + " obrigado por criar uma conta em nosso banco, sua agência é " +  agencia1 + " conta "+ numero1 +"e seu saldo " + saldo +" já está disponível para saque.");
    }
}
