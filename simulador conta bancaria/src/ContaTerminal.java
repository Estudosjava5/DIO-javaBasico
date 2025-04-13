
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
  
        //TODO:conhecer e importar a class scaner 

        //exibir as messagns para o usario

        //obter pela a class scaner os valores digitados no terminals
       
        //exibir a mensagem criada
     
        //criando o scaner para receber os dados clientes

        Scanner Scanner = new Scanner(System.in);

    // solicitando dados clinete

    System.out.println("por favor , digite o numero da Agência:");
    String agencia = Scanner.nextLine();

    
    // solicitando o numero a conta
  System.err.println("por favor, digite o numero da conta:");
  int numero = Scanner.nextInt();
  Scanner.nextLine();

//recebendo nome cliente
System.err.println("por favor digiti po seu nome:");
String nomeCliente = Scanner.nextLine();

     //recebendo o valor do saldo
     
System.err.println("por favor digite o saldo inicial");
double saldo = Scanner.nextDouble();
 

//mensagem final

String mensagem = "olá "+ nomeCliente +  ",obrigado por cria uma conta em nosso banco, sua agência é" + agencia +
"conta" + numero + "e seu saldo é" +saldo + " já esta disponivel para saque";

System.err.println(mensagem);



        
        


    }

}
