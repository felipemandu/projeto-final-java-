package piedpipergamaacademia.projetofinaljava.dto;

public class AlunoDto {

    //TODO usar as anotações do spring validation para criar as validações dos dados de entrada;

    private String nome;

    private EnderecoDto enderecoDto;

    private String telefone;

    private String curso;

    private DisciplinaDto disciplinaDto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecoDto getEnderecoDto() {
        return enderecoDto;
    }

    public void setEnderecoDto(EnderecoDto enderecoDto) {
        this.enderecoDto = enderecoDto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public DisciplinaDto getDisciplinaDto() {
        return disciplinaDto;
    }

    public void setDisciplinaDto(DisciplinaDto disciplinaDto) {
        this.disciplinaDto = disciplinaDto;
    }
}
