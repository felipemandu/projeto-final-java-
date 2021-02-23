package piedpipergamaacademia.projetofinaljava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Double nota1;
    private Double nota2;
    private Double notaTrabalho;
    private Double notaApresentacao;
    private String conceito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    
    public String getConceito() {
    	if(conceito == null && possuiTodasNotas()) {
    		transformarNotaEmConceito();
    	}	
        return conceito;
    }


	public void setConceito(String conceito) {
        this.conceito = conceito;
    }

	public String getStatus() {
		switch(getConceito()) {
			case "A":;
			case "B":;
			case "C": return "Aprovado";
			case "D":;
			case "E":;
			case "F": return "Reprovado";
			default: return "Não se aplica";
		}

	}
	
	private void transformarNotaEmConceito() {
    	Double notaFinal = (nota1 + nota2 + notaApresentacao + notaTrabalho) / 4;
		if(notaFinal < 2) {
			conceito = "F";
		} else if (notaFinal < 4) {
			conceito = "E";
		} else if (notaFinal < 5) {
			conceito = "D";
		} else if (notaFinal < 7) {
			conceito = "C";
		} else if (notaFinal < 8.5) {
			conceito = "B";
		} else {
			conceito = "A";
		}
    }
	

    private boolean possuiTodasNotas() {
		boolean nota1 = this.nota1 != null;
		boolean nota2 = this.nota2 != null;
		boolean notaApresentacao = this.notaApresentacao != null;
		boolean notaTrabalho = this.notaTrabalho != null;
		
		return nota1 && nota2 && notaApresentacao && notaTrabalho;
	}
    
	
}
