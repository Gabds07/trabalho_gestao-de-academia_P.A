public class Treino {
    private String descricao;
    private String nivel;
    private Instrutor instrutorResponsavel;

    public String getDescricao() {
        return this.descricao;
    }

    public String getNivel() {
        return this.nivel;
    }

    public Instrutor getInstrutorResponsavel() {
        return this.instrutorResponsavel;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setInstrutorResponsavel(Instrutor instrutorResponsavel) {
        this.instrutorResponsavel = instrutorResponsavel;
    }

    public void exibirTreino() {
        System.out.println("\n=== DADOS DO TREINO ===");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Nível: " + this.nivel);
        if (this.instrutorResponsavel != null) {
            System.out.println("Instrutor: " + instrutorResponsavel.getNome());
        } else {
            System.out.println("Instrutor: Não atribuído");
        }
    }
}