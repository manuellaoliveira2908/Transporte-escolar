import java.util.Scanner;

public class Transporteescolartiaedna {
    public static void main(String[] args) {
        // Defina a capacidade do ônibus
        int capacidadeOnibus = 45;
        
        // Solicita o número de pessoas inscritas para a viagem
        try ( // Crie um scanner para receber entrada do usuário
                Scanner scanner = new Scanner(System.in)) {
            // Solicita o número de pessoas inscritas para a viagem
            System.out.print("Digite o número de pessoas inscritas para a viagem: ");
            int totalPessoas = scanner.nextInt();
            // Calcula o número de ônibus necessários
            int numOnibus = totalPessoas / capacidadeOnibus;
            int pessoasRestantes = totalPessoas % capacidadeOnibus;
            // Exibe o resultado
            System.out.println("Número de ônibus necessários: " + numOnibus);
            System.out.println("Número total de pessoas que serão transportadas em vans: " + pessoasRestantes);
            // Fecha o scanner
        }
    }
}