public class Instrutor extends Pessoa {
    private String cref;
    private String especialidade;

    public Instrutor(String nome, String cpf, String cref, String especialidade) {
        super(nome, cpf);
        this.cref = cref;
        this.especialidade = especialidade;
    }

    public String getCref() {
        return this.cref;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CREF: " + this.cref);
    }
}
