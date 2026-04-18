import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 10;
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        List<Treino> treinos = new ArrayList<>();

        do {
            System.out.println("\n=== SISTEMA DE GESTÃO DE ACADEMIA ===");
            System.out.print("Selecione uma opção: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    cadastrarAluno(scanner, pessoas);
                    break;

                case 2:
                    cadastrarInstrutor(scanner, pessoas);
                    break;

                case 5:
                    associarTreinoAluno(scanner, pessoas, treinos);
                    break;

                default:
                    System.out.println("Selecione uma opção válida.");
                    break;
            }
        } while (op != 0);
    }

    static void associarTreinoAluno(Scanner scanner, List<Pessoa> pessoas, List<Treino> treinos) {

        System.out.println("\n=== ASSOCIAR TREINO A ALUNO ===");

        List<Aluno> alunos = new ArrayList<>();

        // filtra somente os alunos da lista de pessoas (já que ele puxa o cadastro de
        // pessoas).
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Aluno) {
                alunos.add((Aluno) pessoa);
            }
        }

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        // Falta função de cadastro de treino para funcionar essa parte e todas de
        // verificação de treino.
        if (treinos.isEmpty()) {
            System.out.println("Nenhum treino cadastrado.");
            return;
        }

        System.out.println("\nAlunos cadastrados:");
        for (int i = 1; i < alunos.size(); i++) {
            System.out.println(i + ". " + alunos.get(i).getNome() + " - Matrícula: " + alunos.get(i).getMatricula());
        }

        System.out.print("Escolha o número do aluno: ");
        int numeroAluno = Integer.parseInt(scanner.next());

        if (numeroAluno < 0 || numeroAluno >= alunos.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("\nTreinos disponíveis:");
        for (int i = 0; i < treinos.size(); i++) {
            System.out.println(i + ". " + treinos.get(i).getDescricao() + " - Nível: " + treinos.get(i).getNivel());
        }

        System.out.print("Escolha o número do treino: ");
        int numeroTreino = Integer.parseInt(scanner.nextLine());

        if (numeroTreino < 0 || numeroTreino >= treinos.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        Aluno alunoEscolhido = alunos.get(numeroAluno);
        Treino treinoEscolhido = treinos.get(numeroTreino);

        alunoEscolhido.adicionarTreino(treinoEscolhido);

        System.out.println(
                "Treino: " + treinoEscolhido.getDescricao() + ". associado ao aluno: " + alunoEscolhido.getNome());
    }

    static void cadastrarAluno(Scanner scanner, List<Pessoa> pessoas) {

        System.out.println("\n=== CADASTRAR ALUNO ===");

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("CPF: ");
        String cpf = scanner.next();

        for (Pessoa pessoa : pessoas) {
            // Verificação para ver se a pessoa (aluno) já existe no sistema.
            if (pessoa.getCpf().equals(cpf)) {
                System.out.println("CPF já cadastrado.");
                return;
            }
        }

        System.out.print("Matrícula: ");
        String matricula = scanner.next();

        Aluno aluno = new Aluno(nome, cpf, matricula);

        // Adiciona na lista de pessoas que associa ao aluno (é criado na classe aluno
        // de qualquer forma).
        pessoas.add(aluno);

        System.out.println("Aluno cadastrado com sucesso.");
    }

    static void cadastrarInstrutor(Scanner scanner, List<Pessoa> pessoas) {

        System.out.println("\n=== CADASTRAR INSTRUTOR ===");

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("CPF: ");
        String cpf = scanner.next();

        for (Pessoa pessoa : pessoas) {
            // Verificação para ver se a pessoa (instrutor) já existe no sistema.
            if (pessoa.getCpf().equals(cpf)) {
                System.out.println("CPF já cadastrado.");
                return;
            }
        }

        System.out.print("CREF: ");
        String cref = scanner.next();

        System.out.println("Especialidade: ");
        String especialidade = scanner.next();

        // Criando o objeto Instrutor (considerando a versão com extends Pessoa)
        Instrutor instrutor = new Instrutor(nome, cpf, cref, especialidade);

        // Adiciona na lista de pessoas (polimorfismo: Instrutor é uma Pessoa)
        pessoas.add(instrutor);

        System.out.println("Instrutor cadastrado com sucesso.");
    }
}
