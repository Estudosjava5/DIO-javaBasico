import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
       
        int numeroSecreto = random.nextInt(50); 
        int tentativa = 0;

        int chut=0; 

        while (chut != numeroSecreto) {
            System.out.print("Digite o seu chute: ");
            chut = scanner.nextInt(); // Lê o valor do chute

            if (chut < numeroSecreto) {
                System.err.println("Muito baixo! Tente novamente");
            } else if (chut > numeroSecreto) {
                System.err.println("Muito alto! Tente novamente");
            } else {
                System.err.println("Parabéns! Você acertou!");
            }
        }

        scanner.close();
    }
}
