public class Plano {
    private String nomePlano;
    private double valorMensal;
    private int duracaoMeses;

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
}
