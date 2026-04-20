import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 10;
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        List<Treino> treinos = new ArrayList<>();
        List<Plano> plano = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        Instrutor instrutor = new Instrutor();

        do {
            System.out.println("\n=== SISTEMA DE GESTÃO DE ACADEMIA ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Instrutor");
            System.out.println("3 - Cadastrar Plano");
            System.out.println("4 - Criar Treino");
            System.out.println("5 - Associar Treino a Aluno");
            System.out.println("6 - Listar Pessoas");
            System.out.println("7 - Listar Planos");
            System.out.println("8 - Listar Treinos");
            System.out.print("Selecione uma opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    aluno.cadastrarAluno(scanner, pessoas, alunos);
                    break;
                case 2:
                    instrutor.cadastrarInstrutor(scanner, pessoas);
                    break;
                case 3:
                    Plano novoPlano = new Plano();
                    novoPlano.cadastrarPlano();
                    System.out.println("Valor total do Plano: R$ " + novoPlano.calcularValorTotal());
                    // Após cadastrar o plano e calcular o valor dele, adicionei ele na lista de
                    // arrays
                    plano.add(novoPlano);
                    break;
                case 5:
                    aluno.associarTreinoAluno(scanner, pessoas, treinos, alunos);
                    break;
                default:
                    System.out.println("Selecione uma opção válida.");
                    break;
            }
        } while (op != 0);
    }
}