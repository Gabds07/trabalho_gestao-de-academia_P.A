import java.util.Scanner;

public class Plano {

    Scanner scanner = new Scanner(System.in);

    private String nomePlano;
    private double valorMensal;
    private int duracaoMeses;

    public Plano() {
    }

    public Plano(String nomePlano, double valorMensal, int duracaoMeses) {
        this.nomePlano = nomePlano;
        this.valorMensal = valorMensal;
        this.duracaoMeses = duracaoMeses;
    }

    public String getNomePlano() {
        return this.nomePlano;
    }

    public double getValorMensal() {
        return this.valorMensal;
    }

    public int getDuracaoMeses() {
        return this.duracaoMeses;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    public void cadastrarPlano() {

        double valor = 0;
        int duracaoMeses = 0;

        System.out.println("\n === CADASTRAR PLANO ===");
        System.out.print("\nInforme o nome do plano: ");
        this.nomePlano = scanner.nextLine();
        System.out.print("Informe o valor do plano: R$ ");
        valor = scanner.nextDouble();

        // Verificar se o valor do plano não é um número negativo

        if (valor < 0) {
            System.out.println("Valor Inválido");
            return;
        } else {
            this.valorMensal = valor;
        }
        System.out.print("Informe a duração do plano em meses: ");
        duracaoMeses = scanner.nextInt();

        // Verificar se a duração do plano não é um número negativo

        if (duracaoMeses < 0) {
            System.out.println("Valor Inválido");
            return;
        } else {
            this.duracaoMeses = duracaoMeses;
        }

        System.out.println("Plano Cadastrado com Sucesso!");
    }

    public double calcularValorTotal() {
        double calculo = 0;

        calculo = this.duracaoMeses * this.valorMensal;

        return calculo;

    }
}