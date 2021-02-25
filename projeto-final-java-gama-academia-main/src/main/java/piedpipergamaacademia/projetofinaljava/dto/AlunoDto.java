package piedpipergamaacademia.projetofinaljava.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class AlunoDto {

	@NotEmpty
	@Length(min=5)
    private String nome;
    
	@Pattern(regexp="[1-9][0-9]{4}-[0-9]{4}")
    private String telefone;
    
	@NotEmpty
    private String curso;
    
    private List<EnderecoDto> endereco;
    
    private List<DisciplinaDto> disciplina;

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

	public List<EnderecoDto> getEnderecoDto() {
		return endereco;
	}

	public void setEnderecoDto(List<EnderecoDto> endereco) {
		this.endereco = endereco;
	}

	public List<DisciplinaDto> getDisciplinaDto() {
		return disciplina;
	}

	public void setDisciplinaDto(List<DisciplinaDto> disciplina) {
		this.disciplina = disciplina;
	}
    
}
