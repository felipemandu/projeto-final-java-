package piedpipergamaacademia.projetofinaljava.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class AlunoDto {

	@NotEmpty
	@Min(5)
    private String nome;
    
	@Pattern(regexp="[1-9][0-9]{4}-[0-9]{4}")
    private String telefone;
    
	@NotEmpty
    private String curso;
    
    private List<EnderecoDto> enderecoDto;
    
    private List<DisciplinaDto> disciplinaDto;

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
		return enderecoDto;
	}

	public void setEnderecoDto(List<EnderecoDto> enderecoDto) {
		this.enderecoDto = enderecoDto;
	}

	public List<DisciplinaDto> getDisciplinaDto() {
		return disciplinaDto;
	}

	public void setDisciplinaDto(List<DisciplinaDto> disciplinaDto) {
		this.disciplinaDto = disciplinaDto;
	}
    
}
