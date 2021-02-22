package piedpipergamaacademia.projetofinaljava.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class DisciplinaDto {

	@NotEmpty
	@Min(5)
    private String nome;
	
	@Size(max=10)
    private Double nota1;
    
	@Size(max=10)
    private Double nota2;

	@Size(max=10)
    private Double notaTrabalho;

	@Size(max=10)
    private Double notaApresentacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(Double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public Double getNotaApresentacao() {
        return notaApresentacao;
    }

    public void setNotaApresentacao(Double notaApresentacao) {
        this.notaApresentacao = notaApresentacao;
    }
}
