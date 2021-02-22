package piedpipergamaacademia.projetofinaljava.response;

import java.util.List;

public class AlunoResponse {

    //TODO definir quais dados vão ser retornado na resposta

    private String nome;
    private String telefone;
    private List<EnderecoResponse> endereco;
    private List<DisciplinaResponse> disciplina;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<EnderecoResponse> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<EnderecoResponse> endereco) {
        this.endereco = endereco;
    }

    public List<DisciplinaResponse> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<DisciplinaResponse> disciplina) {
        this.disciplina = disciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
