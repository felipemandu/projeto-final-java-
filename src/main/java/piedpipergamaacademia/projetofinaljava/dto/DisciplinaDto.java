package piedpipergamaacademia.projetofinaljava.dto;


public class DisciplinaDto {

    //TODO usar as anotações do spring validation para criar as validações dos dados de entrada;

    private String nome;

    private Double nota1;

    private Double nota2;

    private Double notaTrabalho;

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
